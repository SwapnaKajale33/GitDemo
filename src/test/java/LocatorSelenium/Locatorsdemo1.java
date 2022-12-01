package LocatorSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver object here has access to the methods of chrome driver which are defined in webdriver interface.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Swapnali");
		driver.findElement(By.name("inputPassword")).sendKeys("Swapnali123");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String text =driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Swapnali");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("swapnali17@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("swapnali.k17@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("swapnali.kajale17@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9075375114");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//Thread.sleep(2000);
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Swapnali");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
	}

}
