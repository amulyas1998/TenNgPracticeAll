package keyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {
	
	
	static WebDriver driver;
	
	//tab window shoty keys
/*	@Test(priority=1)
	
	void openPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	Thread.sleep(3000);
		
	}
	
	@Test(priority=2,dependsOnMethods= {"openPage"})
	void switching() {
		driver.switchTo().frame("iframeResult");
	}
 
	@Test(priority=3,dependsOnMethods= {"switching"})
	void copy() throws InterruptedException {
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("ammu");
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(f1).perform();
		//delete
		act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
        //cntl+c
        //act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	}*/
	
	
	//windowhandles
	
/*@Test
void window() throws InterruptedException  {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	WebElement regLink=driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]"));
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	List<String> ids1=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window(ids1.get(1));
	Thread.sleep(2000);
	driver.switchTo().window(ids1.get(0));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[normalize-space()=\"Open New Seperate Windows\"]")).click();
	Thread.sleep(2000);
	WebElement regLink2= driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
	Actions act1= new Actions(driver);
	act1.keyDown(Keys.CONTROL).click(regLink2).keyUp(Keys.CONTROL).perform();
	List<String> ids=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window(ids.get(2));
    Thread.sleep(2000);
    driver.switchTo().window(ids1.get(0)); 
}*/
	
	//windowhandle
	@Test
	void window1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//driver.switchTo().newWindow(WindowType.TAB);
		
	}
}

