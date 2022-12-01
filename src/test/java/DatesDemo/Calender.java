package DatesDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(3000);
	List<WebElement>dates=driver.findElements(By.className("flatpickr-day"));
	//grab common attribute // put into list and iterate 
	int count =driver.findElements(By.className("flatpickr-day")).size();
	for(int i=0;i<count;i++)
	{
		String text =driver.findElements(By.className("flatpickr-day")).get(i).getText();
		if(text.equalsIgnoreCase("23"))
		{
			driver.findElements(By.className("flatpickr-day")).get(i).click();
			break;
			
		}
	}
	}

}
