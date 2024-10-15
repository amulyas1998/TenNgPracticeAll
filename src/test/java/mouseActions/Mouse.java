package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	
	static WebDriver driver;
	

	//mousehover	
		/*@Test
		
		void hover() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);

			
			WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
			WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
			Actions act= new Actions(driver);
			act.moveToElement(desktop).moveToElement(mac).click().build().perform();
			
		}*/
		
		//mouse rightclick
		
	/*	@BeforeTest
		
		void openPage() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);	
		}
		
		
		@Test
		void rightsclick() {
		
			WebElement rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			Actions act= new Actions(driver);
			act.contextClick(rightClick).perform();
		}
		
		@AfterTest
		
		void cut() throws InterruptedException {
			
			
			driver.findElement(By.xpath("//span[normalize-space()='Cut']")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		}*/
		
		//Doubleclick
		
		@Test
		void doubleclick() throws InterruptedException {
			

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(3000);	
			driver.switchTo().frame("iframeResult");
			WebElement f1=	driver.findElement(By.xpath("//input[@id='field1']"));
			f1.clear();
			f1.sendKeys("amulya");
			WebElement f2=	driver.findElement(By.xpath("//input[@id='field2']"));
			WebElement button=	driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			Actions act=new Actions(driver);
			act.doubleClick(button).perform();
			
		}
		
		//drag&drop
		/*@Test
		void drag() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
			driver.manage().window().maximize();
			Thread.sleep(3000);	
			driver.switchTo().frame("iframeResult");
			Actions act=new Actions(driver);
			WebElement drag=driver.findElement(By.xpath("//img[@id='drag1']"));
			WebElement drop=driver.findElement(By.xpath("//div[@id='div1']"));
			act.dragAndDrop(drag, drop).perform();
			
			
		}*/
		

}
