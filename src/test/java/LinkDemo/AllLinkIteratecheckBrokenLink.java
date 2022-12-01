package LinkDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AllLinkIteratecheckBrokenLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement>links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) 
		{
		String url=	link.getAttribute("href");
		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode =conn.getResponseCode();
		System.out.println(responseCode);
		if(responseCode>400)
		{
			System.out.println("The link with text"+link.getText()+" is broken with code" +responseCode);
			Assert.assertTrue(false);
		}
		
		}
		
		
		
		
		
        
	
	
	}

}
