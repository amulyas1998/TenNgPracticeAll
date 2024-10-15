package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {
WebDriver driver;

//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
@Test(priority=1,groups= {"regression"})
void scrollelement() throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	

	driver.get("https://artoftesting.com/samplesiteforselenium");
    driver.manage().window().maximize();
    
    Thread.sleep(3000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
    //scroll till element visisble
    
     /*WebElement element= driver.findElement(By.xpath("//div[@id='targetDiv']"));
      System.out.println(js.executeScript("return window.pageYOffset;"));
     js.executeScript("arguments[0].scrollIntoView();", element);*/
    
	
	//scroll by pixel no
	
	/*js.executeScript("window.scrollBy(0,1500)","");
	System.out.println(js.executeScript("return window.pageYOffset;"));*/
	
	
	//SCROLL till end of the page
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));	
	Thread.sleep(2000);
	//scroll down to top
	
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));	
	
	
	//driver.quit();

}
}
