package DynamicTAble;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllDAtaOfDynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(row.size());
		
		for(int i=1; i<=row.size(); i++)
		{
			for(int j=1; j<=col.size(); j++)
			{
			WebElement allData = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(allData.getText());
		}}
		
		
		
		driver.quit();
	}

}
