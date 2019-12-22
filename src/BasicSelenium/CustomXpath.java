package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {

			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Downloads\\\\extr file\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//Launch browser
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("etrydwyw");//with @properties/attributes
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();// with text()
		driver.quit();
	}
	
	}


