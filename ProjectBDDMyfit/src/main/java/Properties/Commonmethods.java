package Properties;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Commonmethods {
	protected static WebDriver driver; 
	public static void driverinstantiate()
	{
	System.setProperty("webdriver.edge.driver", "C:\\NandiniWork\\MicrosoftWebDriver.exe");
	driver = new EdgeDriver(); 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    String baseURL= "https://www.amazon.co.uk/";
    driver.navigate().to(baseURL);    
	}
	public static void driver_quit()
	{
		driver.quit();
	}
}
