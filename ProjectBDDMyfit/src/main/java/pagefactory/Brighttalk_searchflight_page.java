package pagefactory;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Brighttalk_searchflight_page {
	
	WebDriver driver;
	
	public Brighttalk_searchflight_page(WebDriver pagedriver)
	{
		this.driver = pagedriver;
	}
	@FindBy(how= How.CSS,using="li[data-title=flights]")
	WebElement select_flights_tab;
	
	@FindBy(how=How.ID,using="s2id_location_from")
	WebElement location_from;
	
	
	@FindBy(how=How.ID,using="s2id_location_to")
	WebElement location_to;
	
	@FindBy(how=How.XPATH,using="//div[@class='datepicker-days']//tr//td[@class='day active']")
	String active_dates;
	
	@FindBy(how=How.ID,using="travellersInput")
	WebElement travellers_input;
	
	@FindBy(how=How.CSS,using="madult")
	WebElement travellers_input_adult;
	
	@FindBy(how=How.CSS,using="mchildren")
	WebElement travellers_input_children;
	
	@FindBy(how=How.ID,using="sumManualPassenger")
	WebElement click_done;

	@FindBy(how=How.CSS,using="button[type=submit]")
	WebElement click_submit;
	
	@FindBy(how=How.ID,using="round")
	WebElement option_roundtrip;
	
	@FindBy(how=How.ID,using="checkairTurkish Airlines")
	WebElement checkbox_turkish_airlines;
	
	@FindBy(how=How.ID,using="checkairOman Air")
	WebElement checkbox_airOman_airlines;
	
	@FindBy(how=How.CSS,using="input[name=arrival]")
	WebElement arrive_date;
	
	@FindBy(how=How.XPATH,using="//div[14]/div[1]/table/thead/tr[1]/th[3]")
	WebElement arrive_date_next;
	
	@FindBy(how=How.XPATH,using="//div[14]/div[1]/table/thead/tr[1]/th[3]")
	WebElement select_arrive_date;
	
		
	@FindBy(how=How.CSS,using="input[name=departure]")
	WebElement departure_date;
	
	@FindBy(how=How.XPATH,using="//div[15]/div[1]/table/tbody/tr[6]/td[2]")
	WebElement select_departure_date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"load_data\"]/tbody/tr/td/div[2]/p/span")
	List<WebElement> search_results;
	

	@FindBy(how=How.XPATH,using="//*[@id=\"load_data\"]")
	WebElement search_table;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[1]")
	WebElement title;	
	
	public void go_to_flights_tab()
	{
		select_flights_tab.click();
	}
	
	public void enter_location_from_dropdown() throws InterruptedException
	{
		wait(100);
		location_from.click();
		location_from.sendKeys("London");
		Select dropdown = new Select(location_from);
		dropdown.selectByVisibleText("LCY");
	}
	
	public void enter_location_to_dropdown() {
		location_to.click();
		location_to.sendKeys("Dubai");
		Select to_dropdown = new Select(location_to);
		to_dropdown.selectByVisibleText("DXB");
		
	}
	
	public void way_trip_type()
	{
		option_roundtrip.click();
	}
	
	public void travellers_input()
	{
		travellers_input.click();
	}
	
	public void select_travellers()
	{
		Select no_of_adults = new Select(travellers_input_adult);
		no_of_adults.selectByVisibleText("2");
		Select no_of_children = new Select(travellers_input_children);
		no_of_children.deselectByVisibleText("2");
		click_done.click();
	}
	public void search()
	{
		click_submit.click();
	}
	
	
	public void filter_by_airlines()
	{
		checkbox_turkish_airlines.click();
		checkbox_airOman_airlines.click();
	}
	public void select_dates()
	{
		arrive_date.click();
		arrive_date_next.click();	
		select_arrive_date.click();
		select_departure_date.click();
		         
	}
	public void search_results()
	{
		WebElement table = search_table;
		List<WebElement> listOfCols = null;

			List<WebElement> listOfRows = new ArrayList<>();
					
				listOfRows=table.findElements(By.tagName("tr"));

			System.out.println("Rows: "+listOfRows.size());
			
			for(int i=0; i<listOfRows.size(); i++)
			{
				listOfCols = search_results;
				System.out.println("Columns: "+listOfCols.get(i));	
	
			}	
			List<WebElement> array = listOfCols;
			for(int i=0; i<array.size(); i++)
			{
				for(int j=1; j<array.size();j++)
				{
					if(i>j)
					{
						int temp = i;
						i= j;
						j=temp;
					}
					else
					{
						j++;
					}
				}
				System.out.println(array.get(i));
				
			}	
	driver.findElement(By.xpath("//*[@id='bookbtn']")).click();
}
	public void get_title()
	{
		String summary_title = title.getText();
		Assert.assertEquals("Personal Details", summary_title);
	}
}
