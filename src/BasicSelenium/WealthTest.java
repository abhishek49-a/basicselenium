package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WealthTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://login.iiflwealth.com/IIFLWealth/#/login");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("kyphId")).sendKeys("CRN18038");
		driver.findElement(By.xpath("//button[@data-box='registration_otp]")).click();
		

	
	}

}
