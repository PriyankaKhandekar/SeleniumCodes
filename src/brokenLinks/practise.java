package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		// Calculate is there any BEOKEN LINK is present or not
		    String baseUrl = "http://demo.guru99.com/test/newtours/";					
	        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        
	        String url ="";
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));					
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        List<String> link = new ArrayList<>();
	        Iterator it = links.iterator();
	        while(it.hasNext())
	        {
	        	url=((WebElement) it.next()).getAttribute("href");
	        	//System.out.println(url);
	        	
	        	try {
	        		huc = (HttpURLConnection)(new URL(url).openConnection());
	        		
	        		huc.setRequestMethod("HEAD");
	        		huc.connect();
	        		respCode = huc.getResponseCode();
	        		
	        		if(respCode >= 400) {
	        			System.out.println(url + " : is a broken link");
	        		}
	        //		else {System.out.println(url + " : is a valid Link");}
	        		
	        	}catch(Exception e)
	        	{
	        		
	        	}
	        }

	}

}
