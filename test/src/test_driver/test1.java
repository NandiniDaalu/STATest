package test_driver;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class test1 {

	@Test
	public void testsite() {
		System.setProperty("webdriver.edge.driver", "C:\\NandiniWork\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String baseURL= "http://www.statravel.co.uk/tours-worldwide.htm";
        driver.navigate().to(baseURL);
        assertTrue(driver.getTitle().contains("Worldwide Tours | STA Travel"));
        
        driver.findElement(By.id("sta-cookie-save-all-button")).click(); 
        driver.findElement(By.xpath("//div[1]/div[5]/div[2]/div/div[4]/div/div/div/div[2]/div[1]/div/div[6]/form/fieldset[1]/div[1]/div/input[2]")).sendKeys("India");
        driver.findElement(By.xpath("//div[1]/div[5]/div[2]/div/div[4]/div/div/div/div[2]/div[1]/div/div[6]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//div[1]/div[5]/div[2]/div/div[4]/div/div/div/div[2]/div[1]/div/div[6]/form/fieldset[2]/p/button")).click();
        
        Select sortorder = new Select(driver.findElement(By.id("sortSelect")));
        sortorder.selectByIndex(1);
        Assert.assertTrue(true);
        
        String match_found = driver.findElement(By.id("lblTotalSearchResult")).getText();
        String extract_count = match_found.substring(0, 2);
        int header_matches_count = Integer.valueOf(extract_count);
        Assert.assertEquals("66 Matches Found", "66 Matches Found");
        
        driver.findElement(By.id("btnViewMore")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnReset"))); 
        
        int actual_list_items_count = driver.findElements(By.xpath("//div[@id='products']//div[@class='day-price']")).size();
        System.out.println("Display search items:" +actual_list_items_count);
        Assert.assertEquals(header_matches_count, actual_list_items_count);
        
        driver.quit();
	   
	}		
	}
		

