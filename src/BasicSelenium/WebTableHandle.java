package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import util.Xls_Reader;

public class WebTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\extr file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		String beforepath_Company="//*[@id=\"customers\"]/tbody/tr[";
		String AfterXpath_company="]/td[1]";
		
		String beforeXpath_contact="//*[@id=\"customers\"]/tbody/tr[";
		String AferXpath_contact="]/td[2]";
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\'customers\']//tr"));
		System.out.println(rows.size()-1);
		int rowcount=rows.size();
		
		Xls_Reader reader=new Xls_Reader("F:\\Selenium All\\TestData.xlsx");
		if(!reader.isSheetExist("WebData")) {
			reader.addSheet("WebData");
			reader.addColumn("WebData", "CompanyName");
			reader.addColumn("WebData", "Contact");
		}
		
		
		for(int i=2; i<=rowcount; i++) {
			String actualXpath_company = beforepath_Company+i+AfterXpath_company;
			String actualXpath_contact=beforeXpath_contact+i+AferXpath_contact;
			
		String Company=driver.findElement(By.xpath(actualXpath_company)).getText();
		System.out.println(Company);
		reader.setCellData("WebData", "CompanyName", i, Company);
	   // reader.setCellData("TableData", "CompanyName", i, companyName);
		
		String Contact=driver.findElement(By.xpath(actualXpath_contact)).getText();
		System.out.println(Contact);
		//reader.setCellData("WebData", "Contact", i, Contact);
			
			
		} 
		
			
	}

}
