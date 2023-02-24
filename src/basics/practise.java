package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String coloumN = "Sallary";
		int index =0, salary=100000;
		List<WebElement> col  = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(col.size());
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(row.size());
		
		for(int i=1; i<col.size(); i++)
		{
			String coloumName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(coloumN.equalsIgnoreCase(coloumName))
			{
				index=i;
				break;
			}
		}
		
		for(int i=1; i<row.size(); i++)
		{
			String sl= driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td["+ index +"]")).getText();
			String sl1= sl.replace("$","");
			String sl2 = sl1.replace(",", "");
			int coloumSallary = Integer.parseInt(sl2);
			
			if(salary >= coloumSallary)
			{
				String name = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]")).getText();
			}
		}
	}

}
