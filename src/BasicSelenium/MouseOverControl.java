package BasicSelenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverControl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//To launch browser
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/jquery-mouseover-with-examples/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Algo ▼']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Analysis of Algorithms']")).click();
		
			
	}

}
