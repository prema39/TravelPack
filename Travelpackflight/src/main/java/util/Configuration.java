package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	public static Properties pro;
	public static void loadconfiguration(){
		File fl =new File("src/main/resources/config.properties");
		InputStream fis=null;
		try {
			fis = new FileInputStream(fl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String getbrowsername(){
		return pro.getProperty("browser");
	}
	
	public static String geturl(){
		return pro.getProperty("url");
		
	}

}
