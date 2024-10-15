package Fileuploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
WebDriver driver;
	@Test
	void file() throws InterruptedException, Exception {	
	
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
       //single file
     
      
      Actions act=new Actions(driver);
      act.moveToElement(driver.findElement(By.id("uploadfile_0"))).click().perform();
      Thread.sleep(5000);
    
     StringSelection ss=new StringSelection("‪‪C:\\Users\\admin\\Downloads\\facitys.jpeg");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
      Thread.sleep(3000);
      Robot r= new Robot();
      Thread.sleep(3000);
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      Thread.sleep(3000);
      
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_V);
      Thread.sleep(3000);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
    
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(3000);
	 
	 // driver.quit();
	

	
	
	
	
	
	
	
	
	}}
