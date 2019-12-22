package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//To load a page only
		
		//dynamic wait
				//1.implicit wait 
				//2.Explicit wait
		//1.Implicitly
				//It always applied globally--is will available for all web elements.
				//It is dynamic in nature
				//You can change anytime or anywhere in application code
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//-------------
		//Static Wait
		//Thread.Sleep(3000);
		//2.Explicit wait
	//----------
		
		//2.Explicit wait.
				//1.There is no explicit keyword or methods like implicit wait
				//2.it is Available with WebDriverWait with some ExpectedConditions.
				//3.It is specific to elements
				//4.It is also dynamic in nature
				//5.We should not use implicit wait and explicit wait together because 
				//total sync wait will be increased for each element.
		
		
		
		WebElement fname=driver.findElement(By.name("firstname"));
		WebElement lname=driver.findElement(By.name("lastname"));
		WebElement forgotAccount=driver.findElement(By.linkText("Forgotten account?"));
		sendkeys(driver,fname , 10, "Heena");
		sendkeys(driver,lname , 30, "Heena");
		clickon(driver,forgotAccount,20);
		
	}
	
	public static void sendkeys(WebDriver driver,WebElement element,int timeout,String values) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(values);
		
	}
	


public static void clickon(WebDriver driver,WebElement element,int timeout) {
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
	element.click();
}
	
	}


