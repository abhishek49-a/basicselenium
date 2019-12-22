package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InlineElement {

	public static void main(String[] args) {


	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//To launch browser
			driver.get("https://www.google.com/");
	        driver.findElement(By.xpath("//a[@title='Google apps']")).click();
	        driver.findElement(By.xpath("//span[@pid='23']")).click();
	      //*[@id="yDmH0d"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[4]/a/span[1]
	
	
	
	
	}

}
