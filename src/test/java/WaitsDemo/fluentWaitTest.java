package WaitsDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWaitTest {

	public static void main(String[] args) {
		//Fluent wait we have to give them polling time so that it only monitors and at regular intervals 
		//of time
		/*if you have to give timeout as 10 seconds and falling as 2 seconds so that means for every two
		 * seconds it will check in the browser if the object is found oe not
		 * if it is not found it will check after 2 second 
		 * 
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		Wait <WebDriver>wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
	}

}
