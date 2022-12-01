package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TestNG Is one of the testing framework 
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//  count get all the checkbox
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	int i=1;
	while(i<5)
	{
		 driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}


	}

