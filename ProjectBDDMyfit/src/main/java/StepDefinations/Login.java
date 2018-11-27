package StepDefinations;

import org.openqa.selenium.support.PageFactory;

import Properties.Commonmethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.Loginpage;

public class Login extends Commonmethods
{	
	Loginpage logobj;

	@Given("^User is on amazon page and click on signup button$")
	public void user_is_on_amazon_page_and_click_on_signup_button() throws Exception{
		driverinstantiate("Edge");
		logobj = PageFactory.initElements(driver, Loginpage.class);
		
	}

	@When("^User enters incorect \"([^\"]*)\" and \"([^\"]*)\" $")
	public void user_enters_incorect_entry(String EmailID, String Password){
		
		logobj.signin_with_credentials(EmailID, Password);
	}

	@When("^User clicks on the Signup button$")
	public void user_clicks_on_the_Signup_button(){
		logobj.clicks_Signup_button();
	}

	@Then("^User gets an error messsage$")
	public void user_gets_an_error_messsage(){
		logobj.user_gets_an_error_messsage();
		driver_quit();
	}



}