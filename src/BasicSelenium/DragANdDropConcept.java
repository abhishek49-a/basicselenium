package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDropConcept {

	public static void main(String[] args) {

		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//To launch browser
			driver.manage().window().maximize();
			driver.get("http://jqueryui.com/droppable/");//Enter Url
			driver.switchTo().frame(0);
			//driver.quit();
			Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']")))
		.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
			
	
	}
}
