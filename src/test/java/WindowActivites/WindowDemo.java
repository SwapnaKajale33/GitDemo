package WindowActivites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) {
	
				System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://google.com");// it will wait to window is fullly loaded
				driver.navigate().to("http://rahulshettyacademy.com");//selenium not wait to load fully page load
				// when you are alredy selenium browser automation mode if you are opening another window the you can do this
				
				driver.navigate().back();
				driver.navigate().forward();

	}

}
