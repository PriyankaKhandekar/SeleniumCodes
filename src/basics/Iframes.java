package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        System.out.println();
        List<WebElement> el = driver.findElements(By.xpath("//iframes"));
        int a = driver.findElements(By.xpath("//iframe")).size();
        System.out.println(a);
        
        driver.switchTo().frame(driver.findElement(By.id("frame1")));
        System.out.println(driver.getWindowHandle());
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        System.out.println(driver.getWindowHandle());
        System.out.println();
        System.out.println(driver.getTitle());
        
        driver.switchTo().defaultContent();
        System.out.println(driver.getWindowHandle());
        

	}

}
