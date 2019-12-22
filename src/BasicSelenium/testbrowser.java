package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testbrowser { 
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	  WebElement webtable = driver.findElement(By.id("customers"));
	  	  
	  List <WebElement> tablecell = webtable.findElements(By.tagName("td"));
	  int c = tablecell.size(); 
	  
	  Xls_Reader reader=new Xls_Reader("C:\\Users\\user\\Documents\\TestData.xlsx");
		if(!reader.isSheetExist("WebData")) {
			reader.addSheet("WebData");
			reader.addColumn("WebData", "CompanyName");
			reader.addColumn("WebData", "Contact");
			reader.addColumn("WebData", "Country");
					
		}
		
	  for(int cell=0;cell<c;cell++)
	  {
	   String celltext=tablecell.get(cell).getText();
	  
	   System.out.println(celltext);
		 reader.setCellData("WebData", "CompanyName", cell, celltext);
		 
      
      }
	    		//driver.close();
	}

}
