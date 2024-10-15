package headlesstesting;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessTesting {
	
@Test
void headlesst() {
	

	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless=new");
	WebDriver driver= new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	File file=new File("C:\\Users\\admin\\Downloads\\selenium extension\\uBlock-Origin-Chrome-Web-Store.crx");
    options.addExtensions(file);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Boolean logo =	driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
	if(logo) {
		System.out.println("logo is displayed"+logo);
	}
	else {
		System.out.println("logo not displayed"+logo);
	}
    String actual=driver.getTitle();
    System.out.println(actual);
    String expected="OrangeHRM";
    Assert.assertEquals(actual,expected );		
}
}
