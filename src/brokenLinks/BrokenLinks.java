package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("//https://www.zlti.com/");
        driver.manage().window().maximize();
        
        String url = " " ;
        String homePage = "//https://www.zlti.com/";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<String> link = new ArrayList<>();
        Iterator<WebElement> it = links.iterator();
        while(it.hasNext()) {
        	
        	url = it.next().getAttribute("href");
        	System.out.println(url);
        	if(url == null || url.isEmpty())
        	{
        	  System.out.println("URL is either not configured for anchor tag or it is empty");
        	  continue;
        	}
        	if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
        	}
        	try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
        		}catch(Exception e) {
        			 e.printStackTrace();
        		}
                    
            }
        	
           
//        for(WebElement k:links)
//        {
//        	link.add(k.getText());
//        	
//        }System.out.println(link);
//        System.out.println(link.size());
        
        
        driver.close();
	}

}