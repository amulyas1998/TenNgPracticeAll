package Datepicker;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DatePicker {
	
	static WebDriver driver;
	String year="1998";
	String month="july";
	String date="13";
	@Test
	 
	void d() throws InterruptedException {
		 
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 /* driver.get("https://fengyuanchen.github.io/datepicker/");
		WebElement actual= driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
		actual.sendKeys("10/13/2024");*/
		
		 /*String year="2025";
		 String month="August";
		 String date="10";
		 
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		 driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		 while(true) {
			 String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 String currectYear  =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 
			 if(currentMonth.equals(month)&&currectYear.equals(year)) {
				 break;
			 }
			
			 driver.findElement(By.xpath("//a[@title='Next']")).click();
		 }
		  List<WebElement> alldates=driver.findElements(By.xpath("//a[normalize-space()='10']"));
   
         for(WebElement dt:alldates) {
        	 
        	if(dt.getText().equals(date)) {
             dt.click();
            
        	}
        
}
		
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement mywait=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='October']"))); //driver.findElement(By.xpath("//span[normalize-space()='October']"));
		 driver.findElement(By.xpath("//a[normalize-space()='21']")).click();*/
		 
		 
	/*driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	
	driver.findElement(By.id("first_date_picker")).sendKeys("09/24/2024");
	Thread.sleep(3000);
	driver.findElement(By.id("second_date_picker")).sendKeys("09/25/2024");
	Thread.sleep(3000);
	driver.findElement(By.id("third_date_picker")).sendKeys("09/26/2024");
	Thread.sleep(3000);
	driver.findElement(By.id("fourth_date_picker")).sendKeys("09/27/2024");
	Thread.sleep(3000);
	driver.findElement(By.id("fifth_date_picker")).sendKeys("09/28/2024");
	Thread.sleep(3000);
	driver.findElement(By.id("sixth_date_picker")).sendKeys("09/29/2024");
	Thread.sleep(5000);
	driver.quit();*/
	
	
	/*driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	driver.findElement(By.id("dob")).click();
	 
	WebElement dbyear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select selectyr=new Select(dbyear);
	selectyr.selectByVisibleText(year);
	Thread.sleep(5000);
	}
	
	static Month  convertMonth(String month) {
	
	HashMap<String,Month> monthMap=	new HashMap<String,Month>();
    monthMap.put("January",Month.JANUARY);
    monthMap.put("February",Month.FEBRUARY);
    monthMap.put("March",Month.MARCH);
    monthMap.put("April",Month.APRIL);
    monthMap.put("May",Month.MAY);
    monthMap.put("June",Month.JUNE);
    monthMap.put("July",Month.JULY);
    monthMap.put("August",Month.AUGUST);
    monthMap.put("September",Month.SEPTEMBER);
    monthMap.put("October",Month.OCTOBER);
    monthMap.put("November",Month.NOVEMBER);
    monthMap.put("December",Month.DECEMBER);
    
	Month month1= monthMap.get(month);
		if(month1==null) {
			System.out.println("invalid");
		}
	
		while(true) {
			String displaymonth=driver.findElement(By.xpath("//select[@class=ui-datepicker-month']")).getText();
			
			Month expectedMonth=convertMonth(month);
			Month currentMonth=convertMonth(displaymonth);
			 int result=expectedMonth.compareTo(currentMonth);
			 if(result<0) {
				 driver.findElement(By.className("ui-datepicker-prev ui-corner-all")).click();
				
			 }
			 else if(result>0){
				 driver.findElement(By.className("ui-datepicker-next ui-corner-all")).click();
			 }
			 else {
				 break;
			 }
			 
			 
			 List<WebElement> alldates=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
			   
	         for(WebElement dt:alldates) {
	        	 
	        	if(dt.getText().equals(alldates)) {
	             dt.click();
			 
		}
	        	  
	         }
	       
	         }*/
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
