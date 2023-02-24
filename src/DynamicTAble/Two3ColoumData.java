package DynamicTAble;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two3ColoumData {

	public static void main(String[] args) {
		// Print 2 or 3 Coloum Data
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(row.size());
		
		String a= "New York";
		String aa= "Office";
		int colIndex = 0;
		
		for(int i=1; i<=col.size(); i++)
		{
			String colName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(aa.equals(colName))
			{
				System.out.println(colName);
				colIndex = i;
				break;	
			}
		}
		
		for(int i=1; i<row.size(); i++)
		{
			String colValues = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+ colIndex+"]")).getText();
			if(a.equals(colValues))
			{
				String name = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[1]")).getText();
				String position = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[2]")).getText();
				String startDate = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[5]")).getText();
				String salary = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[6]")).getText();
				
				System.out.println(name+"       "+ position + "        " + startDate + "        "+salary);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		// print three coloum data
//		for(int i=1; i<=row.size(); i++)
//		{
//			String name = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
//			String position = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
//			String office = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
//			System.out.println(name + "         " + position + "        " + office );
//			
//		}
		

		driver.quit();
	}

}
