package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {


	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//To launch browser
			driver.manage().window().maximize();
			driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\user\\Downloads\\FunctionInJava.java");
		    Thread.sleep(5000);
	}

}
