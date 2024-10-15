package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	static WebDriver driver;
	
	@Test(priority=1)
	void openPage() {
		
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
     
	 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();	
		
	}
//static dropdowns
	@Test(priority=2)
	void fromplace() throws InterruptedException {
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value=\"AMD\"]")).click();
		Thread.sleep(2000);
	
	}
	
	//static dropdown
		@Test(priority=3)
		void toplace() throws InterruptedException {
			
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@value=\"HYD\"])[2]")).click();
			Thread.sleep(2000);
	
		}
		
		
		
		//dynamic
		
		@Test(priority=4)
		void dynamic() throws InterruptedException {
		driver.findElement(By.id("autosuggest")).sendKeys("ind");	
		Thread.sleep(2000);
		List<WebElement> staticdropdown=driver.findElements(By.cssSelector("li.ui-menu-item"));
		Thread.sleep(2000);
	    for(WebElement dropdown:staticdropdown) {
	    	if(dropdown.getText().equalsIgnoreCase("india")) {
	    		dropdown.click();
	    	}
	    }	
		}
	
}
