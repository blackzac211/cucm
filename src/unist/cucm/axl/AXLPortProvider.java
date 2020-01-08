package unist.cucm.axl;

import javax.xml.ws.BindingProvider;

import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLPort;


public class AXLPortProvider {
	private AXLAPIService axlService = new AXLAPIService();
	private AXLPort axlPort = axlService.getAXLPort();
	private String url = "https://unuc-cucm-01.unist.ac.kr:8443/axl/";
	
	private String cucmID = "administrator";
	private String cucmPWD = "Unist@IPT";
		
	public AXLPortProvider() {
		((BindingProvider) axlPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, cucmID);
		((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, cucmPWD);
	}
	
	public AXLPort getAxlPort() {
		return axlPort;
	}
}
