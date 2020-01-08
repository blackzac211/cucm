package unist.cucm.sap.connector;

import com.sap.conn.jco.ext.DestinationDataProvider;

import java.util.Properties;

/**
 * Created by oks on 15. 10. 2..
 */
public class DefaultSapConnector implements SapConnector {
    private Properties properties = new Properties();

    private String client;
    private String lang;
    private String user;
    private String passwd;
    private String r3Name;
    private String group;
    private String mshost;

    public void setMshost(String mshost) {
        this.mshost = mshost;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setR3Name(String r3Name) {
        this.r3Name = r3Name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getLang() {
        return lang;
    }

    public String getR3Name() {
        return r3Name;
    }

    public String getGroup() {
        return group;
    }

    public String getMshost() {
        return mshost;
    }

    @Override
    public Properties getSapProperties() {
        properties.setProperty(DestinationDataProvider.JCO_CLIENT, getClient());
        properties.setProperty(DestinationDataProvider.JCO_USER, getUser());
        properties.setProperty(DestinationDataProvider.JCO_PASSWD, getPasswd());
        properties.setProperty(DestinationDataProvider.JCO_LANG, getLang());
        properties.setProperty(DestinationDataProvider.JCO_R3NAME, getR3Name());
        properties.setProperty(DestinationDataProvider.JCO_MSHOST, getMshost());
        properties.setProperty(DestinationDataProvider.JCO_GROUP, getGroup());

        return properties;
    }
}
