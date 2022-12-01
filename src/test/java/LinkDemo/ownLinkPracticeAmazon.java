package LinkDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ownLinkPracticeAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver =driver.findElement(By.id("navFooter"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement coloumndriver =footerdriver.findElement(By.xpath("//div[1]/div[1]/div[1]/ul[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
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

}
