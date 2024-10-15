package windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	@Test
	public void window() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement regLink=driver.findElement(By.xpath("//button[@id='openwindow']"));
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	List<String> ids=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window(ids.get(1));
	Thread.sleep(2000);
	driver.switchTo().window(ids.get(0));
	Thread.sleep(2000);
	driver.quit();
	}

}
