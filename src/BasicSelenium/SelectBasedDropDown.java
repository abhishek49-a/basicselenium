package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBasedDropDown {

	public static void main(String[] args) {

	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement element=driver.findElement(By.xpath("//select[@id='month' and @aria-label='Month']"));
			Select select=new Select(element);
			select.selectByIndex(3);
		
			//select.selectByIndex(1);
		//select.selectByVisibleText("Jul");
			
			
		List<WebElement>monthlist=driver.findElements(By.xpath("//select[@id='month' and @aria-label='Month']"));
		//System.out.println(monthlist.size());
		for(int i=0;i<monthlist.size();i++ ) {
			
			System.out.println(monthlist.get(i).getText());
		}
			
			
			
		}


		
		
	}


