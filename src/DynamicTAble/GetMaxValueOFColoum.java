package DynamicTAble;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMaxValueOFColoum {

	public static void main(String[] args) {
		// Get maximum value of that perticular Coloum

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		String colName = "Current Price (Rs)";
		int index =0;
		double dd= 0;
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(row.size());
		
		for(int i=1; i<=col.size(); i++)
		{
			String colN = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+i+"]")).getText();
			if(colName.equals(colN))
			{
				index = i;
			}
		}
		
		for(int i=1; i<row.size(); i++)
		{
			String data = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+index+"]")).getText();
			double d = Double.parseDouble(data);
			//int num = Integer.parseInt(data);
			//System.out.println(d);
			if(dd<d)
			{
				dd=d;
			}
					
		}System.out.println(dd);
		
		
	}

}
