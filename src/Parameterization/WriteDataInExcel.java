package Parameterization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        System.out.println(driver.findElement(By.xpath("//div[text()='Appliances']")).getText());
        
        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
        List<String> elee = new ArrayList<>();
       
        for(int i=0; i<ele.size(); i++)
        {
           elee.add(ele.get(i).getText());
        } System.out.println(elee);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Priya");
        FileOutputStream file1 = null;
        for(int i=0; i<elee.size(); i++)
        {
        
        
        	Row r = sheet.createRow(i);
        	Cell c = r.createCell(0);
        	c.setCellValue(elee(i));
        	 File file = new File("D:\\Selenium\\WriteData.xlsx");
             file1 = new FileOutputStream(file);
             wb.write(file1);
     
        }  
             
        
		file1.close();
        wb.close();
        
        

	}

	private static Date elee(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
