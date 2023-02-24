package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BnyMellon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bnymellon.com/apac/en.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//div[@class='cmp-teaser'])[7]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement el = driver.findElement(By.xpath("(//span[text()='Learn more'])[4]"));
		js.executeScript("arguments[0].click()",el);
				//driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
		
		
		
				
		

	}

}
