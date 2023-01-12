package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcyMjkwNTM2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,100)");
        //js.executeScript("arguments[0].scrollIntoView(true)",WebElement);
        WebElement email = driver.findElement(By.id("email"));
        js.executeScript("arguments[0].value='7770076500'", email);
        
        WebElement pass = driver.findElement(By.id("pass"));
        js.executeScript("arguments[0].value='priyavicky'", pass);
        
        WebElement login = driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()", login);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Groups']")).click();

		
	}

}
