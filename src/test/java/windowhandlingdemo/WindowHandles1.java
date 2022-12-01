package windowhandlingdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String>it =windows.iterator();
		String parentId= it.next();
		String childId=it.next();
		
		
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		/*Please email us at mentor@rahulshettyacademy.com with below template to receive response

		 * here we want to grab this email address and switch to parent window and entrr in username 
		 * so we have to use no string methodsnto parse this string and to extract only this emial id
		 * 
		 * 
		 * 
		 */
		driver.findElement(By.cssSelector(".im-para.red")).getText();// put debug point here 
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailId);//mentor@rahulshettyacademy.com
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}
	

}
