package test_driver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Commonmethods {
	protected static WebDriver driver; 
	static Properties properties;
	public static void driverinstantiate()
	{
	System.setProperty("webdriver.edge.driver", "C:\\NandiniWork\\MicrosoftWebDriver.exe");
	driver = new EdgeDriver(); 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    String baseURL= "https://www.amazon.co.uk/";
    driver.navigate().to(baseURL);    
	}
	public static void loadData() throws IOException
	{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"\\ProjectBDDMyfit\\src\\main\\jav\test.properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
		
	}
	
    public static String getObject(String Data) throws IOException
    {
    	loadData();
    	String data = properties.getProperty(Data);
    	return data;
    }
}
