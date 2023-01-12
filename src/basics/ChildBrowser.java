package basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("realme");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        List<WebElement> all = driver.findElements(By.xpath("//a[@class='_1fQZEK']"));      
        for(int i=1; i<3; i++)
        {
        	all.get(i).click();
        	
        }
        Set<String> set = driver.getWindowHandles();
        List<String> allList = new ArrayList<>(set);
        driver.switchTo().window(allList.get(1));
        System.out.println(driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText());
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        
        
	}

}
