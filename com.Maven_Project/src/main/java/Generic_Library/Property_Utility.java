package Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {
	
	public static String getData(String key) throws IOException {
		FileInputStream fis = new FileInputStream(Iconstant.property_Path);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String url = p.getProperty(key);
		
		return url;
	}

}
