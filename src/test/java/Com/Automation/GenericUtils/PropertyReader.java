package Com.Automation.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	
	static Properties prop = new Properties();
	
	public static void initproperty()
	{
		try {
			prop.load(new FileInputStream("C:\\Users\\prachi.gupta2\\eclipse-workspace\\JustDial_Testing\\src\\test\\resources\\Config\\Config.properties"));
		}
		
		catch(Exception E)
		{
			E.printStackTrace();
		}
	}
		

	public static String getProperty(String key)
	{
		return prop.getProperty(key);
		
	}

}
