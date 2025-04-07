
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath {

	public static void main(String[] args){
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.quikr.com");
	driver.manage().window().maximize();
	
    driver.findElement(By.xpath("//a[@href='javascript:;']")).click();
    
     List<WebElement> list = driver.findElements(By.xpath("//a[@href='javascript:;']"));
     
     driver.findElement(By.xpath("///img[@alt='Quikr']")).click();
     
	 for(WebElement item :list) {
    	System.out.println(item.getText());
    }
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
    
    driver.quit();
	
	}

	
}
