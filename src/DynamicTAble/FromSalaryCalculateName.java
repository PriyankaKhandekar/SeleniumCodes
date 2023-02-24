package DynamicTAble;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromSalaryCalculateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// sallary less  than $372000 get name of that employes
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
		System.out.println(row.size());
		
		String coloumN= "Salary";
		int index =0;
		int sal = 100000;
		
		
		for(int i=1; i<=col.size(); i++)
		{
			String colN = driver.findElement(By.xpath("//table/thead/tr/th["+ i +"]")).getText();
						
			if(coloumN.equals(colN))
			{
				System.out.println(colN);
				index= i;
				break;
			}
		}
		for(int i=1; i<row.size(); i++)
		{
			String rowsal = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td["+ index +"]")).getText();
			String rowsal1 = rowsal.replace("$", "");
			String rowsal2 = rowsal1.replace(",", "");
			int  salaryInteger = Integer.parseInt(rowsal2);
			
									
			if(sal >= (salaryInteger))
			{
				String name = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[1]")).getText();
				String position = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td[2]")).getText();
				System.out.println(name+ "            "+ position);
				
			}
		
		}
		
		driver.quit();
	}

}
