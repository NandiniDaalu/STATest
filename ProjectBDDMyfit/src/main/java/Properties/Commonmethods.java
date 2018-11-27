package Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonmethods {
	public static WebDriver driver; 
	public static String BrowserName;

	public static void driverinstantiate(String BrowserName) throws Exception
	{
	if(BrowserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.firefox.marionette", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if (BrowserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new EdgeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Edge")) 
	{
	System.setProperty("webdriver.edge.driver", "./Drivers/MicrosoftWebDriver.exe");
	driver = new EdgeDriver(); 
	}
	else
	{
		throw new Exception("Browser information need to be passed");
	}
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    String baseURL= "https://www.phptravels.net/";
    driver.navigate().to(baseURL);  
    driver.manage().deleteAllCookies();
	}

	public static void driver_quit()
	{
		driver.quit();
	}
}
