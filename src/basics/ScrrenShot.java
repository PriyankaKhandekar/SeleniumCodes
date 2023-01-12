package basics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD-hh-mm-ss");
        String curretDate = f.format(date);
        System.out.println(curretDate);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\Screenshots\\Screenshots + curretDate+.jpg");
        FileHandler.copy(source, dest);
        
        driver.close();

	}

}
