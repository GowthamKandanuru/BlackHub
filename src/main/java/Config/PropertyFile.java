package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	private Properties props;
	private FileInputStream fs;
	
	public PropertyFile()
	{
		props = new Properties();
		try {
				fs = new FileInputStream("K:\\GitProjects\\BlackHub\\Resources\\Config.properties");
				props.load(fs);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public String getUrl()
	{
		return props.getProperty("url");
	}
	
	public String getUsername()
	{
		return props.getProperty("email");
	}
	
	public String getPassword()
	{
		return props.getProperty("password");
	}
	
	public String getDriver()
	{
		return props.getProperty("driver");
	}
	
	public String getDriverPath()
	{
		return props.getProperty("driverPath");
	}
}
