package com.bugzilla.bdd.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ReadConfigProperties{

	private Properties prop;

	
	
	private void initPropertiesFile(String fileName) {
		if(isDefaultPropertiesFile(fileName)){
			prop = getDataFromProperties("config.properties");
		}else{
			prop = getDataFromProperties(fileName);
		}
	}
	
	private boolean isDefaultPropertiesFile(String fileName) {
		if("".equalsIgnoreCase(fileName))
			return true;
		return false;
	}
	
	public ReadConfigProperties(String fileName){
		initPropertiesFile(fileName);
	}
	
	public  ReadConfigProperties() {
		initPropertiesFile("");
	}

	private  Properties getDataFromProperties(String fileName) {
		//String path = ResourceUtils.getResourcePath(fileName);
		
		String path = "C:\\Users\\pandes15\\Documents\\Selenium\\com.bugzilla.bdd\\src\\main\\resources\\" +fileName ;
		try {
			
			prop = new Properties();
			InputStream stream = new FileInputStream(new File(path));
			prop.load(stream);

		} catch (IOException e) {

			throw new RuntimeException(e.getMessage());
		}

		return prop;

	}

	public String getApplicationURI() {
		
		System.out.println(prop.getProperty("application"));
		return prop.getProperty("application");
	}

	public String getUsername() {
		System.out.println(prop.getProperty("username"));
		return prop.getProperty("username");
	}

	public String getPassword() {
		System.out.println(prop.getProperty("password"));
		return prop.getProperty("password");
	}

	public String getBrowser() {
		System.out.println(prop.getProperty("browser"));
		return prop.getProperty("browser");
	}
	
/*public static void main(String[] args) {
		
	ReadConfigProperties r = new ReadConfigProperties();
	r.getApplicationURI();
	r.getBrowser();
	r.getPassword();
	r.getUsername();
	}*/
	
}
