package headlesstesting;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	private String noOfBrokenLinks;

	@Test
	void broken() {
		
	
	ChromeOptions options=new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	WebDriver driver=new ChromeDriver(options);
	
	File file=new File("C:\\Users\\admin\\Downloads\\selenium extension\\uBlock-Origin-Chrome-Web-Store.crx");
	options.addExtensions(file);
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));//for total no of links
	System.out.println("total links:"+links.size());
	for(WebElement link:links) {
	String hrefAttValue=link.getAttribute("href");
	if(hrefAttValue==null||hrefAttValue.isEmpty()) {
		System.out.println("href value is null");
		continue;
	
	}
	 try {
		 URL linkURL= new URL(hrefAttValue);//convert href from string-url
		 HttpURLConnection conn= (HttpURLConnection)linkURL.openConnection();//open connection to server
		 conn.connect();//connect to server & sent req to server
		if( conn.getResponseCode()>=400) {
			System.out.println("broken links:"+hrefAttValue);
		}
		else {
			System.out.println("not broken links:"+hrefAttValue);
	
	 }
		}
		catch(Exception E) {
			
		}
	
	}

	}}
	 

