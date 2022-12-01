package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// this is something that option comes based upon your input
		/*AutoSuggestive: in this dropdown your first goal is to provide input and then figure out the generic locator
		 * which extract all these three items and stored it in a list then iterate your list
		 * 
		 * 
		 */
		
			System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("autosuggest")).sendKeys("Ind");
			Thread.sleep(2000);
	List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement option :options)
	{
		if(option.getText().equalsIgnoreCase("India")) {
			option.click();
			break;
		}
	}
			

	}

}
