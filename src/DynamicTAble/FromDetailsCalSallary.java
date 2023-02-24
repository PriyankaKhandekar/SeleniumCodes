package DynamicTAble;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromDetailsCalSallary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
		System.out.println(row.size());
		
		String name = "Ashton Cox";
		String position = "	Junior Technical Author";
		String sallary = "Sallary";
		int index = 0;
		
		for(int i =1; i<=col.size(); i++)
		{
			String colName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(sallary.equals(colName))
			{
				index = i;
				break;
				
			}
		}
		for(int i=1; i<row.size()-1; i++)
		{
			String nameCol = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[1]")).getText();
			String PositionCol = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[2]")).getText();
			if(name.equals(nameCol) || position.equals(PositionCol))
			{
				String sallaryCol = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[6]")).getText();
				System.out.println(sallaryCol);
			}
					
		}
		
				
	}

}
