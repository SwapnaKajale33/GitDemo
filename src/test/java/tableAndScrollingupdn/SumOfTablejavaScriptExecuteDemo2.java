package tableAndScrollingupdn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SumOfTablejavaScriptExecuteDemo2 {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement>values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	//	We have to sum of that table count
	//	first initiate one variable i.e sum
		int sum =0;
		for(int i =0;i<values.size();i++)
		{
            sum=sum+Integer.parseInt(values.get(i).getText());// they return in String format but we need to convert integer format
            /*sum =0 then 0+28=28 after that              * 
             * sum =28 then 28+23 will happen nhere so new value is 51
             * so like this it will sum to each and every value in every iteration and the iteration is complete 
             * 
             */
		}
          System.out.println(sum);
          /*Your next goal is to complete the values 
           * if it is mathicing with this means tithe sum and appan automate kelele sum corret ahe ki nahi te check 
           */
           driver.findElement(By.cssSelector(".totalAmount")).getText();
         int total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
         System.out.println(total);
         Assert.assertEquals(sum, total);
	}

}
