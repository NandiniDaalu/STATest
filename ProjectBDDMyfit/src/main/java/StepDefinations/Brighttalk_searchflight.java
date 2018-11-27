package StepDefinations;

import org.openqa.selenium.support.PageFactory;

import Properties.Commonmethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.Brighttalk_searchflight_page;

public class Brighttalk_searchflight extends Commonmethods{
	
	Brighttalk_searchflight_page search_obj;
	
	@Given("^I am on the Home page and i click on Flights tab$")
	public void Go_to_Homepage() throws Exception{
		driverinstantiate("Edge");
		search_obj = PageFactory.initElements(driver, Brighttalk_searchflight_page.class);
		search_obj.go_to_flights_tab();
	}

	@When("^I select From address as London city airport from the dropdown$")
	public void select_from_address() throws InterruptedException{
		search_obj.enter_location_from_dropdown();
	}

	@When("^I select the Return address as Dubai international airport from the dropdown$")
	public void select_return_address(){
		search_obj.enter_location_to_dropdown();
		}

	@When("^I select the Roundtrip radio button$")
	public void select_trip(){
		search_obj.way_trip_type();
	    
	}

	@When("^I select the from date as (\\d+) weeks from today and return date as (\\d+) weeks later$")
	public void select_to_and_from_date(int arg1, int arg2){
	  
	}

	@When("^I click on Guests icon and select (\\d+) from Adults checkbox & (\\d+) from Child checkbox$")
	public void select_guests() throws Throwable {
		search_obj.travellers_input();
		search_obj.select_travellers();
		
	   	}

	@When("^I click on Search button and I am redirected to list of available flights$")
	public void click_search(){
		search_obj.search();
	}

	@When("^I filter the search by clicking on Turkish airlines and omar air$")
	public void filter_by_airlines(){
		search_obj.filter_by_airlines();
	}

	@When("^I get the search results and i select the cheapest airfare by clicking on BookNow button$")
	public void select_fare(){
		search_obj.search_results();
	}

	@Then("^I am redirected to booking page$")
	public void Go_to_booking_page() {
		search_obj.get_title();
	}



}
