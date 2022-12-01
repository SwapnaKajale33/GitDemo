package httpcertification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class incognitoModeDemo {

	/*How to launch broswer in  inncognito mode 
	 * what is incognito mode:
	 * It is also one kind of internet browsing mode where our browser will automatically delets the browsing history
	 * at the same time our browser will delete the cookies at the end of the session.
	 * all browser will open incognito mode safari, firefox , chrome edge ;
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		option.setCapability(ChromeOptions.CAPABILITY, option);
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
