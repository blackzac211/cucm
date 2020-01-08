package unist.cucm.sap.functions.extension;

import com.sap.conn.jco.*;

import unist.cucm.sap.UnistConfiguration;
import unist.cucm.sap.functions.extension.model.ExtensionNum;

import java.util.HashMap;

public class ExtensionNumClient {
    private JCoDestination destination;

    public ExtensionNumClient(JCoDestination destination) {
        this.destination = destination;
    }

    public HashMap<String, String> updateExtensionNum(ExtensionNum extensionNum) {
        try {
            JCoFunction function = destination.getRepository().getFunction("Z3HR_UPDATE_INTER_IPPHONE");
            function.getImportParameterList().setValue("IV_DEVICE", extensionNum.getIv_device());
            function.getImportParameterList().setValue("IV_NUMBER", extensionNum.getIv_number());
            function.getImportParameterList().setValue("IV_ORGEH", extensionNum.getIv_orgeh());
            function.getImportParameterList().setValue("IV_ENAME", extensionNum.getIv_enmae());
            function.getImportParameterList().setValue("IV_EPLACE", extensionNum.getIv_eplace());
            function.getImportParameterList().setValue("IV_PERNR", extensionNum.getIv_pernr());
            function.getImportParameterList().setValue("IV_DELETE", extensionNum.getIv_delete());
            
            JCoContext.begin(destination);
            function.execute(destination);
            JCoContext.end(destination);
            
            HashMap<String, String> returnMap = new HashMap<>();
            returnMap.put("ev_return", (String)function.getExportParameterList().getValue("EV_RETURN"));
            returnMap.put("ev_return_text", (String)function.getExportParameterList().getValue("EV_RETURN_TEXT"));
            
            return returnMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /*
    public static void main(String[] args) throws Exception {
        new UnistConfiguration().sapDestinationProvider();
        // JCoDestination destination = JCoDestinationManager.getDestination("sap_destination_dev");
        JCoDestination destination = JCoDestinationManager.getDestination("sap_destination");
        
        ExtensionNum vo = new ExtensionNum();
        vo.setIv_device("0041D2B28123");
        vo.setIv_number("2501");
        vo.setIv_orgeh("10000780");
        vo.setIv_enmae("김효빈");
        vo.setIv_eplace("");
        vo.setIv_pernr("31844");
        vo.setIv_delete(null);
        
        ExtensionNumClient client = new ExtensionNumClient(destination);
        Object o = client.updateExtensionNum(vo);
        System.out.print(o);
    }
    */
}
