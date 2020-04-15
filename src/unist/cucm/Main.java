package unist.cucm;


import java.util.Calendar;
import java.util.Timer;

import unist.cucm.device.controller.DeviceController;

public class Main {
	public static void main(String[] args) throws Exception {
		DeviceController task = new DeviceController();
		
		task.task();
		
		Timer timer = new Timer();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);  //새벽2시 마다 하루에 1회 
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		timer.scheduleAtFixedRate(task, cal.getTime(), 1000 * 60 * 60 * 24);	// 일 배치 스케쥴러 1일 
	}
}
