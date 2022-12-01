package JavaScriptExecuteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jSsendKeysMukeshVolgs {

	public static void main(String[] args) throws InterruptedException {
		// How to type in selenium using JavaScript Or Type In Selenium without sendkeys method

		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='random@gmail.com'",email);
		Thread.sleep(3000);
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='persistent']"));
		
		 js.executeScript("arguments[0].click()", checkbox);
	}

}
