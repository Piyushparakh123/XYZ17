package readpropertydata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
	// read	 data from property file
		Properties prop = new Properties();
		prop.load(fis); //make 
	String username = prop.getProperty("username");
	System.out.println(username);

	}

}
