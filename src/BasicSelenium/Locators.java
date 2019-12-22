package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		
		//ID locator   //*[@id="identifierId"]
		
		
		//driver.findElement(By.id("identifierId")).sendKeys("dahiwal.abhishek111@gmail.com");
		
		//Name locator
		//driver.findElement(By.name("identifier")).sendKeys("dahiwal.abhishek111@gmail.com");
		
		//Class name locator
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("SDFADSFDF");
		
		//.Xpath locator
		
		//driver.findElement(By.xpath("//input[@id='identifierId']"));

		//.css selector
		//driver.findElement(By.cssSelector("#indentifierID")).sendKeys("fsdfads");
		
		//Linktext: it is used only for link        
		driver.findElement(By.linkText("Learn more")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	
	}
}