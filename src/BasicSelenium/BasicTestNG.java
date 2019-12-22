package BasicSelenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        }
	
	@Test(priority=1)
	public void gettitle() 
	{
	 String title= driver.getTitle();
	 System.out.println("pagetitle is:"+title);
    // assert.assertEquals("title", "Google");
	 Assert.assertEquals("title", "Google");
	 
	 Assert.assertEquals(title, "GOOGLE");
		
	}
	
	@Test(priority=2)
	public void URL()
	
	{
	String CURL = driver.getCurrentUrl();
	System.out.println("URL is:" +CURL);
		
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
		
	}
}