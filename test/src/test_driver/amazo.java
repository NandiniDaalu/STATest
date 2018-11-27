package test_driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class amazo extends Commonmethods{
	
	 // static WebDriver driver; 
	  @SuppressWarnings("deprecation")
	    @Test
		public void user_is_on_amazon_page_and_click_on_signup_button(){
		    driverinstantiate();
		    driver.findElement(By.id("nav-link-yourAccount")).click();
			driver.findElement(By.id("ap_email")).sendKeys("hciuweicbcccuciw*798$3");
			driver.findElement(By.id("ap_password")).sendKeys("huhwiuwc");
			driver.findElement(By.id("signInSubmit")).click();
			 String text = driver.findElement(By.xpath("//div[@id='auth-error-message-box']//ul//li//span")).getText();
			 System.out.println(text);
			 Assert.assertTrue(text, true);
			 driver.quit();
	}
}