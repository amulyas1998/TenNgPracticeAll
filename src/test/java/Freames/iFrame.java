package Freames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame {

	WebDriver driver;
	
	@Test
	void frames() throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	 
	WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ammu");
    driver.switchTo().defaultContent();//for reutun to page so that we can switch to other frame
	
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);//iframe
	Thread.sleep(2000);
       driver.switchTo().frame(0);//inner frame
	 List<WebElement> checkbox=  driver.findElements(By.xpath("//div[@class='geS5n']"));
	 for(int i=0;i<checkbox.size();i++) {
		 checkbox.get(i).click();

	 }
		driver.switchTo().defaultContent();
		driver.quit();
		
	
	
	}	
	
}
