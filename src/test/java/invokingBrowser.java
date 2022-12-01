import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokingBrowser {

	public static void main(String[] args) {
		// Invoking Browser
		//Chrome browser- Chrome driver 
		/*ChromeDriver driver = new ChormDriver();
		 * driver Object here has access to all the methods of chrome driver
		 * 
		 * If i write chrome driver like this: that time this code might not work in other browsers if this driver is accessing
		 * personel chrome driver class method
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * driver object here has access to the methods of chrome driver which are defined in webdriver interface.
		 * Why This??
		 * Its's because the driver is the interface grown driver is implementing.and we want to refer only the driver
		 * methods.
		 * 
		 * Step one to go and dowload the chrome driver and get the part whwere exactly you stored in your system
		 * 
		 * Firefox launch
		 * 
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNALI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\SWAPNALI\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 WebDriver driver1 = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","C:\\Users\\SWAPNALI\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver driver2 = new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.get
//	driver.close();//close only originally open selenium, close only current window 
	//driver.quit();//all associated window closed which is opened by program
		 

	}

}
