package DynamicTAble;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Pushkraj\\\\eclipse-workspace\\\\ChromeDriverEXE\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		//no.of coloum
		String max ="";
		double m=0, r=0;
		List<WebElement> coloum = driver.findElements(By.xpath("//div[@id='leftcontainer']//table//thead//tr//th"));
		System.out.println("No. of coloums are : "+coloum.size());
		//no. of rows
		List<WebElement> row = driver.findElements(By.xpath("//div[@id='leftcontainer']//table//tbody//tr"));
		System.out.println("No of Rows are : " + row.size());
		
		// maximum of particular coloum
		for(int i=0; i<row.size(); i++)
		{
			max = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/table/tbody/tr["+ (i+1) + "]/td[4]")).getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if(m>r)
			{
				r=m;
			}
		}
		System.out.println("Maximum no. is : " + r);
		
		//get 3rd row and 3rd coloum data
		WebElement row3 = driver.findElement(By.xpath("//div[@id='leftcontainer']//table//tbody//tr[3]//td[3]"));
		System.out.println("3rd row 3rd coloum data"+row3.getText());
		
		// get 3rd coloum name
		WebElement coloum3 = driver.findElement(By.xpath("//div[@id='leftcontainer']//table//thead//tr//th[3]"));
		System.out.println(coloum3.getText());

		
		
	}

}
