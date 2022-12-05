package gitRahulPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dataProvider {
	
	@Test(dataProvider="LoginTestData")
	public void testOrangehrm(String Uname, String Pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed());
	}
	
	
	@DataProvider(name="LoginTestData")
	public Object[][] loginData() 
	{
		Object[][] data=new Object[2][2];
		data[0][0]= "Admin";
		data[0][1]="admin123";
		
		
		data[1][0]="Admin";
		data[1][1]="test123";
		return data;
	}
		
	


}
