package test_driver;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

	//WebDriver driver = new EdgeDriver(); 
	
	WebDriver driver;
	@BeforeMethod
	public void commonmethods()
	{
		System.setProperty("webdriver.edge.driver", "C:\\NandiniWork\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String baseURL= "http://www.google.com";
        driver.navigate().to(baseURL);
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains("Google"));
	}
	@Test
	public void testmethod()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("Hadoop");
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).click();
		System.out.println(driver.findElement(By.id("tvcap")).getSize());
		driver.findElement(By.xpath("//a[@class='q qs']")).click();
		WebElement result = driver.findElement(By.xpath("//div/h3/a"));
		result.click();
	
	}
	@AfterMethod
	public void last()
	{
		driver.quit();
	}
	
}
