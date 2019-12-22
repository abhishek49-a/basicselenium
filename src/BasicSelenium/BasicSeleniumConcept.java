package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumConcept {

	public static void main(String[] args) {
		
		
     System.setProperty("webdriver.chrome.driver", "E:\\Java_Ecllipse\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//To launch browser
		driver.get("https://accounts.google.com/");//Enter Url
		
		String title=driver.getTitle();//To get title
		System.out.println(title);
		System.out.println(driver.getPageSource());
		
		//validate data
  		if(title.equals("Goole"))
  		{
  			System.out.println("get the correct title");
  		}
  		
  		else
  		{
  			System.out.println("Title is not correct");
  		}
  	
  		System.out.println(driver.getCurrentUrl());
  		String CurrentURL=driver.getCurrentUrl();
  		
  		if(CurrentURL.contains("google.com"))
  		{
  			System.out.println("Contains is present");
  		}
  		  else
  		   {
  			System.out.println("Contains is not present");
  		     }
  		
  		
  		
  		driver.quit();
	
	}
		
	}


