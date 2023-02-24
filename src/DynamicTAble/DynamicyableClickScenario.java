package DynamicTAble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicyableClickScenario {

	public static void main(String[] args) {
		// TO print all the elements of the table

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		

		List<WebElement> rows = driver.findElements(By.xpath("//table[@cellspacing='1']/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> all = driver.findElements(By.xpath("//table[@cellspacing='1']/tbody/tr/td"));
		List<String> print = new ArrayList<>();
		Iterator it = all.iterator();
		while(it.hasNext())
		{
			print.add(((WebElement) it.next()).getText());
		}System.out.println(print);
		for(WebElement k: all)
		{
			print.add(k.getText());
			
		}System.out.println(print);
		
	}//table[@cellspacing='1']/tbody

}
