package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zoominout {
WebDriver driver;
	
@Test(priority=1,groups= {"sanity"})
void zoom() throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	

	driver.get("https://artoftesting.com/samplesiteforselenium");
    driver.manage().window().maximize();
    
    Thread.sleep(3000);
    
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("document.body.style.zoom='40%'");
    Thread.sleep(3000);
    js.executeScript("document.body.style.zoom='80%'");
}}
