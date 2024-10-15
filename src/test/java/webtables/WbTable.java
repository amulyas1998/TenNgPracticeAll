package webtables;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WbTable {
	
	@Test
	void table() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 //add block
		
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(options);
	
		 File file= new File("C:\\Users\\admin\\Downloads\\selenium extension\\uBlock-Origin-Chrome-Web-Store.crx");
			options.addExtensions(file);
			
			
			
			 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		//print no of rows&columns
	int rows= driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		System.out.println("no of rows:"+rows);
	int columns= driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
	    System.out.println("no of columns:"+columns);
		
	   
	    
	  //for specific row&column

		String liberia= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[2]//td[2]")).getText();
		System.out.println(liberia);
		String expected="Maria Anders";
		Assert.assertEquals(liberia,expected );
	  
	    
	    //print data from specific columns
	    String Company=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr['+r+']//td[1]")).getText();
	    if(Company.equals("Google")) {
	     String Contact=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr['+r+']//td[2]")).getText();	
	     String Country=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr['+r+']//td[3]")).getText();
	     System.out.println(Company+"\t"+Contact+"\t"+Country);
	    }
	   
	    
	    
	    
	    
	    
	    //total data from specific row&column
	  /* System.out.println("Company"+"\t"+"Contact"+"\t"+"Country");//for header print
		
	   for(int r=2;r<=rows;r++) {
			
			for(int c=1;c<=columns;c++) {
				String value= driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+c+"]")).getText();	
				System.out.print(value+"\t");
			}
			System.out.println();
		}*/
	    
	
	}

}
