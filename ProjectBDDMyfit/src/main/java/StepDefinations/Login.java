package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Properties.Commonmethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login extends Commonmethods
{	
	@Given("^User is on amazon page and click on signup button$")
	public void user_is_on_amazon_page_and_click_on_signup_button(){
		driverinstantiate();
		driver.findElement(By.id("nav-link-yourAccount")).click();
	}

	@When("^User enters incorect \"([^\"]*)\" in the emailid field$")
	public void user_enters_incorect_in_the_emailid_field(String EmailID){
		driver.findElement(By.id("ap_email")).sendKeys(EmailID);
		
	}

	@When("^User also enters password in the password field$")
	public void user_also_enters_password_in_the_password_field(){
		driver.findElement(By.id("ap_password")).sendKeys("huhwiuwc");
		    
	}

	@When("^User clicks on the Signup button$")
	public void user_clicks_on_the_Signup_button(){
		driver.findElement(By.id("signInSubmit")).click();
	}

	//@SuppressWarnings("deprecation")
	@Then("^User gets an error messsage$")
	public void user_gets_an_error_messsage(){
	String errormessage = driver.findElement(By.xpath("//div[@class='a-alert-content']//ul//li//span")).getText();
	System.out.println(errormessage);
	//Assert.assertTrue(errormessage, true);
	driver_quit();
	}



}