package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#photo%20Manager");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions act = new Actions(driver);
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='gallery']//li"));
		for(WebElement k:list)
		{
			act.dragAndDrop(k, drop).perform();
		}
		
		WebElement drop1 = driver.findElement(By.xpath("//ul[@id='gallery']"));
		List<WebElement> rlist = driver.findElements(By.xpath("//div[@id='trash']//li"));
		for(WebElement kk:rlist)
		{
			act.dragAndDrop(kk, drop1).perform();
		

	}

}}