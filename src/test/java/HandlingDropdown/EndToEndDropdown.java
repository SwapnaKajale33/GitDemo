package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndDropdown {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("Div1")).getAttribute("style");
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		for(int i=1; i<5;i++)
			 {
			  driver.findElement(By.id("hrefIncAdt")).click();
			 }
			 
			  driver.findElement(By.id("btnclosepaxoption")).click();
			  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			  
			  WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticdropdown);
				dropdown.selectByIndex(3);// call this method you can create object of this select class
			System.out.println(dropdown.getFirstSelectedOption().getText());
			 
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


	}

}
