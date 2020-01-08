package unist.cucm.sap;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.ext.Environment;

import unist.cucm.sap.connector.FileSapConnector;
import unist.cucm.sap.connector.SapConnector;


public class UnistConfiguration {
    public SapDestinationProvider sapDestinationProvider() {
        SapDestinationProvider provider = SapDestinationProvider.getInstance();

        if (!Environment.isDestinationDataProviderRegistered()) {
            Environment.registerDestinationDataProvider(provider);

            SapConnector sapConnector = new FileSapConnector("/unist/cucm/sap/properties/sap.properties");
            provider.addDestination("sap_destination", sapConnector);

            SapConnector sapConnector_dev = new FileSapConnector("/unist/cucm/sap/properties/sap_dev.properties");
            provider.addDestination("sap_destination_dev", sapConnector_dev);

            SapConnector sapConnector_qa = new FileSapConnector("/unist/cucm/sap/properties/sap_qa.properties");
            provider.addDestination("sap_destination_qa", sapConnector_qa);

            provider.setDestination("sap_destination");
        }

        return provider;
    }

    public JCoDestination jCoDestination() {
        try {
            if (!Environment.isDestinationDataProviderRegistered()) {
                sapDestinationProvider();
            }

            return JCoDestinationManager.getDestination("sap_destination");
        } catch (JCoException e) {
            e.printStackTrace();
        }

        return null;
    }
}