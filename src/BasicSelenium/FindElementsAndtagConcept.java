package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAndtagConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//To launch browser
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement>element=driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		for(int i=0;i<element.size();i++) {
			//System.out.println(element.get(i).getText());
			String text=element.get(i).getText();
			if(text.equals("Today's Deals"))
			{
				element.get(i).click();
				break;
				
			}
		}

		}

	}
