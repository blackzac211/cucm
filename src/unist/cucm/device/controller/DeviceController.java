package unist.cucm.device.controller;

import java.util.HashMap;
import java.util.TimerTask;

import unist.cucm.device.service.DeviceService;
import unist.cucm.util.CommonUtility;

public class DeviceController extends TimerTask {
	
	@Override
	public void run() {
		task();
	}
	
	public void task() {
		DeviceService service = new DeviceService();
		CommonUtility.writeLog("Connected CUCM successfully");
		
		service.updateDevicesYesterday();
		CommonUtility.writeLog("Finished updateDevicesYesterday()");
		
		service.updateAllDeviceIntoDB();
		CommonUtility.writeLog("Finished updateAllDeviceIntoDB()");
		
		service.updateDevicesHistory();
		CommonUtility.writeLog("Finished updateDevicesHistory()");
		
		service.updateUserInfo();
		CommonUtility.writeLog("Finished updateUserInfo()");


		HashMap<String, Integer> resultMap;
		resultMap = service.updateExtensionNumberToERP_AD();
		if(resultMap != null) {
			CommonUtility.writeLog("Finished updateExtensionNumberToERP_AD(): " + resultMap.get("succ")
				+ ", noChanges=" + resultMap.get("fail"));
		}
		
		service.updateAssociatedDevices();
		CommonUtility.writeLog("Finished updateAssociatedDevices()");
	}
}
