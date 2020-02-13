package unist.cucm.util;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommonUtility {
	public static void writeLog(String msg) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		// File file = new File("C:/blocked_account_catcher_exception.log");
		File file = new File("E:/java_scheduler.log");
		FileWriter writer;
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			writer = new FileWriter(file, true);
			writer.write(df.format(cal.getTime()) + ", " + msg + "\n");
			writer.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
