package unist.cucm.sap;

import com.sap.conn.jco.ext.DestinationDataEventListener;
import com.sap.conn.jco.ext.DestinationDataProvider;

import unist.cucm.sap.connector.SapConnector;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SapDestinationProvider implements DestinationDataProvider {
    private static SapDestinationProvider instance = new SapDestinationProvider();

    public static SapDestinationProvider getInstance() {
        return instance;
    }

    private String currentDestination = null;

    private DestinationDataEventListener destinationDataEventListener;

    private Map<String, SapConnector> destinations = new HashMap<String, SapConnector>();

    public void addDestination(String name, SapConnector sapConnector) {
        destinations.put(name, sapConnector);
    }

    @Override
    public Properties getDestinationProperties(String s) {
        SapConnector sapConnector = destinations.get(s);

        if (sapConnector == null) {
            return null;
        } else {
            return sapConnector.getSapProperties();
        }
    }

    public String getCurrentDestination() {
        return currentDestination;
    }

    public void setDestination(String destination) {
        Properties properties = getDestinationProperties(destination);

        if (properties != null) {
            this.currentDestination = destination;

            destinationDataEventListener.updated(destination);
        }
    }

    public void removeDestination(String destination) {
        Properties properties = getDestinationProperties(destination);

        if (properties != null) {
            destinationDataEventListener.deleted(destination);
        }
    }

    @Override
    public boolean supportsEvents() {
        return true;
    }

    @Override
    public void setDestinationDataEventListener(DestinationDataEventListener destinationDataEventListener) {
        this.destinationDataEventListener = destinationDataEventListener;
    }
}
