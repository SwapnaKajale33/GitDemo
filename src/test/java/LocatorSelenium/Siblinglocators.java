package LocatorSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblinglocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver object here has access to the methods of chrome driver which are defined in webdriver interface.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Absolute xpath: you will start from the top means html root object
		////header/div/button[1]/following-sibling::button[1] 
		// parent to child and sibling to sibling xpath
		// here we go practice to Login 
		////header/div/button[1]/following-sibling::button[1]/preceding-sibling::button[1]
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/preceding-sibling::button[1]")).getText());
	}

}
