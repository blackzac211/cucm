package unist.cucm.sap.connector;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class FileSapConnector implements SapConnector {
    private Properties properties = new Properties();

    private String path;

    public FileSapConnector(String path) {
        this.path = path;
    }

    @Override
    public Properties getSapProperties() {
        try {
            Reader reader = new InputStreamReader(getClass().getResourceAsStream(path));
            properties.load(reader);

            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
