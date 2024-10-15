package SleniumAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxndRadio {
	static WebDriver driver;
	
	@Test
	void pageopen() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[value='radio3']")).click();
		Thread.sleep(5000);
		List<WebElement> checkbox=driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
		for(int i=0;i<checkbox.size();i++) {   //for specific boxes (for all need to give i=0)
			checkbox.get(i).click();
			Thread.sleep(5000);
			
		}
		
	}
	
	
	
}
