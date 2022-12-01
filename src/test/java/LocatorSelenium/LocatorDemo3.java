package LocatorSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// grab this password text Please use temporary password 'rahulshettyacademy' to Login.
		// parse the string
			System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver object here has access to the methods of chrome driver which are defined in webdriver interface.
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("Swapnali");
			driver.findElement(By.name("inputPassword")).sendKeys(password);
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(2000);
		//	String text =driver.findElement(By.cssSelector("p.error")).getText();
		//	System.out.println(text);
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Swapnali");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("swapnali.kajale17@gmail.com");
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("9075375114");
			driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
	//	Please use temporary password 'rahulshettyacademy' to Login.
  String[]passwordArray	=passwordText.split("'");
		//0 th index -Please use temporary password 
		//1st index-rahulshettyacademy' to Login.our password is here
         String password= passwordArray[1].split("'")[0];
      // String password = passwordArray2[0];
       return password;
         //0th index-rahulshettyacademy
         // 1st indext-to Login.
	}

}
