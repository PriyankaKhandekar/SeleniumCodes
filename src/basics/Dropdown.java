package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
       
        WebElement el = driver.findElement(By.id("carselect"));
        Select sc = new Select(el);
        sc.selectByValue("benz");
        sc.selectByVisibleText("Honda");
        sc.selectByIndex(1);
        sc.deselectAll();
        
        WebElement ele = sc.getFirstSelectedOption();
        System.out.println(ele.getText());
        List<WebElement> list = sc.getOptions();
         List<String> liist = new ArrayList<String>();
         
         for(int i=0; i<list.size(); i++)
         {
        	 liist.add(list.get(i).getText());
         }System.out.println(liist);
                
        // multiple options can be selected
        WebElement multi = driver.findElement(By.id("multiple-select-example"));
        Select ss = new Select(multi);
        
        ss.selectByVisibleText("Apple");
        ss.selectByIndex(2);
        
        List<WebElement> elle  = ss.getAllSelectedOptions();
        List<String> sele = new ArrayList<String>();
        for(int i=0; i<elle.size(); i++)
        {
        	sele.add(elle.get(i).getText());
        }System.out.println(sele);
        
        ss.deselectByIndex(2);
        
       
		
	}

}
