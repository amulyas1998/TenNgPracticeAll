package screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
	switch(br) 
	{
	
	case"chrome":driver= new ChromeDriver();break;
	case"edge":driver= new EdgeDriver();break;

	}
	
		
	driver.get("https://artoftesting.com/samplesiteforselenium");
    driver.manage().window().maximize();
    Thread.sleep(2000);
	}
    @Test
    void screenshot() throws InterruptedException {
    	
    	TakesScreenshot ts=(TakesScreenshot)driver;
        
    //fullpage
    	/*File source=ts.getScreenshotAs(OutputType.FILE);
        
        File target=new File("C:\\Users\\admin\\eclipse-workspace\\TenNgPracticeAll\\src\\test\\java\\screenshot\\screenshot\\fullpage.png");
        source.renameTo(target);*/
    
    //halfpage
    	 /*File source=ts.getScreenshotAs(OutputType.FILE);
        
       File target=new File("C:\\Users\\admin\\eclipse-workspace\\TenNgPracticeAll\\src\\test\\java\\screenshot\\screenshot\\halfpage.png");
        source.renameTo(target);*/
	
	
	//specific area
    	
    	/*driver.findElement(By.xpath("//li[@id='menu-item-97']//a[@href='#'][normalize-space()='Manual']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//li[@id='menu-item-310']//a[normalize-space()='What is Manual Testing?']")).click();
    	Thread.sleep(5000);
        WebElement UsefulResources=driver.findElement(By.xpath("//img[@alt='Manual Testing Tutorial']"));
        File source=UsefulResources.getScreenshotAs(OutputType.FILE);
        File target=new File("C:\\Users\\admin\\eclipse-workspace\\TenNgPracticeAll\\src\\test\\java\\screenshot\\screenshot\\UsefulResources.png");
        source.renameTo(target);*/
	
	
     //webelement
    	 WebElement elementlogo=driver.findElement(By.xpath("//a[normalize-space()='ArtOfTesting']"));
         File source=elementlogo.getScreenshotAs(OutputType.FILE);
         File target=new File("C:\\Users\\admin\\eclipse-workspace\\TenNgPracticeAll\\src\\test\\java\\screenshot\\screenshot\\elementlogo.png");
         source.renameTo(target);
	     driver.quit();
	}
	}

