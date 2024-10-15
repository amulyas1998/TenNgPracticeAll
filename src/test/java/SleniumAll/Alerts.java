package SleniumAll;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	
	@Test
	void alert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement timerAlert = driver.findElement(By.id("timerAlertButton"));
		timerAlert.click();
		Thread.sleep(5000);
		Alert timerAlertbutton=driver.switchTo().alert();
		timerAlertbutton.accept();
		
		
		
		WebElement button =	driver.findElement(By.id("confirmButton"));
		button.click();
		Alert buttonalert=driver.switchTo().alert();
		buttonalert.dismiss();
		Thread.sleep(2000);
		
		
		WebElement text = driver.findElement(By.id("promtButton"));
		text.click();
		Alert textdisplays= driver.switchTo().alert();
		textdisplays.sendKeys("ammu");
		textdisplays.accept();
		
	}


}
