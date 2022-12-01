package LinkDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkURLDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		//broken link
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            /*broken url
             * step 1:is to get urls tiedbupnto the links Selenium
             * java methds will call URLS and get you the status code
             * if status code >400 then that url is not working->link which tied to url is broken
             * 
             *  
             *  
             */
	String url =driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int responseCode =conn.getResponseCode();
	System.out.println(responseCode);
	
		
	}

}
