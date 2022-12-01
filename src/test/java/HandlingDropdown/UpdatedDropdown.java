package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("hrefIncAdt")).click();
		int i=1;
		while(i<5) 
		{
			// when you say while loop true so whatever you write inside this loop will keep
			// on execute continuosly until this condition becomes flase 
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		/*also used For loop here to click add adults  
		 * for(int i=1; i<5;i++)
		 * {
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * }
		 * 
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 */
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		

	}

}
