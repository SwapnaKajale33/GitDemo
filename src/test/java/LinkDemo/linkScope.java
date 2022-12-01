package LinkDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkScope {

	public static void main(String[] args) throws InterruptedException {
		//Give the count of links on the page
		
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());// size will give us the acutal count of the link
		// get me the count of link the footer section 
		// i will create mini driver only for this footer section
		
		WebElement footerdriver =driver.findElement(By.id("gf-BIG"));// limiting WebDriver scope
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	//requirement one coumn link
	
	WebElement coloumndriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(coloumndriver.findElements(By.tagName("a")).size());
	// click on each link in the coloumn and check if the pages are opening 
	
	for(int i =1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
	{
		String clickOnLinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		Thread.sleep(5000L);
	}// all tabs are open
		Set<String>abc=driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		
		while(it.hasNext())// it will check if iterator have next index which is true then it go inside 
		{
		  driver.switchTo().window(it.next());// when i say it.next it actually moves  that index
		  System.out.println(driver.getTitle());
		}
	}
		// final requirement of each and every get the title of tab
	}


