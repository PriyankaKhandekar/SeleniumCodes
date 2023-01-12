package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitMEthod {

	public static void main(String[] args) {
	
		WebDriver driver=null;//these line We can Not Write 
		//In Anather METHOD we call like that
		WebElement search = explicitWait(driver, "Xpath");
		
	}
	public static WebElement explicitWait(WebDriver driver, String elee)
	{
		WebElement ele = null;
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elee)));
		}
		catch(Exception e) {}
		
		return ele;
	}
	
	
	
	
}
