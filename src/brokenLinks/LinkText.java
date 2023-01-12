package brokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Pushkraj\\\\\\\\eclipse-workspace\\\\\\\\ChromeDriverEXE\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
	
//        driver.get("http://demo.guru99.com/test/link.html");					
//        driver.findElement(By.partialLinkText("here")).click();
//        driver.findElement(By.linkText("click here")).click();					
//        System.out.println("title of page is: " + driver.getTitle());		
		
		driver.get("http://demo.guru99.com/test/block.html");
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
        driver.quit();	
	}

}
