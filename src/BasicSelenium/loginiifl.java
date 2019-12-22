package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginiifl {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://accounts.google.com/");
        driver.findElement(By.id("identifierId")).sendKeys("dahiwal.abhishek111@gmail.com");
	    driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	  
	    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("abhi777dahiwal");
        driver.findElement(By.xpath("//*[@id='passwordNext']/span")).click();
		
	}

}
