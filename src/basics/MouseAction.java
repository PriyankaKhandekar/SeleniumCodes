package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//MOVETOELMENT
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Actions  act = new Actions(driver);
//		WebElement move = driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
//		act.moveToElement(move).perform();
//		act.moveToElement(driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"))).click().build().perform();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		//CONTEXT CLICK , DOUBLE CLICK
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions  act = new Actions(driver);
		WebElement elee = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(elee).perform();
		act.click(driver.findElement(By.xpath("//span[text()='Edit']"))).perform();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Actions  actt = new Actions(driver);
		actt.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		Alert altt = driver.switchTo().alert();
		altt.accept();
	}

}

