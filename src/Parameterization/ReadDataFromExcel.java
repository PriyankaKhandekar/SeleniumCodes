package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
       
        FileInputStream file = new FileInputStream("D:\\Selenium\\RedData.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0; i<3; i++)
		{
			String data = null;
			try {
				data=sheet.getRow(i).getCell(0).getStringCellValue();
				
			}catch(Exception e)
			{data= String.valueOf(sheet.getRow(i).getCell(0).getNumericCellValue());
			}
			WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys(data);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			for(int j=0; j<data.length(); j++)
			{
				search.sendKeys(Keys.BACK_SPACE);
			}
		}
        
        
		      
        Thread.sleep(2000);

		
	   }

}
