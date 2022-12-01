package JavaScriptExecuteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsClickMukeshVolgs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*This script will not execute it will thorugh exception i.e
	 * ElementNotInteractableException
	 * xpath is correct
	 * when i am refreshing dom and write new xpath after that it will run script but signed in box not cheked
	 * so how to resolve tis issue??
	 * using java script
	 * 
	 * 	also used
	 * js.executeScript("argument[0].click()")
	 */
		
		
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.findElement(By.name("username")).sendKeys("random@gmail.com");
		//driver.findElement(By.id("persistent")).click();
		//webElement checkbox= driver.findElement(By.xpath("//input[@id='persistent']");
		//also used
		 // js.executeScript("argument[0].click()", checkbox);
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('persistent').click()");
		

	}

}
