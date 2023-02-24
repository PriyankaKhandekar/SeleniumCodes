package DynamicTAble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewDynamicTable {

	public static void main(String[] args) {
		
		//
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
		System.out.println(row.size());
/// frome name we calculate all details of that employ		
		String name = "Cedric Kelly";
		int colIn = 0;
		for(int i=1; i<row.size(); i++)
		{
		    String name1 = driver.findElement(By.xpath("//table/tbody/tr[" + i +"]/td")).getText();
			if(name.equals(name1))
			{
				System.out.println(name1);
				colIn=i;
				break;
			}
		}
		for(int j=1; j<col.size(); j++)
				{
					String data = driver.findElement(By.xpath("//table/tbody/tr["+colIn+"]/td["+j+"]")).getText();
					System.out.println(data);
					
				}
	
		driver.quit();
		
		
		

	}

}
