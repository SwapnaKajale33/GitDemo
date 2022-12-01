package httpcertification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		/*withis options object you can access them at methods present in this chromeoptions class
		 * This options object have the behavior of how it should behave so that behaviour options object.
		 * you have to pass as an argument to your chrome driver class
		 */
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		/*Privacy error
		 * when we get this title that time 
		 * chromeOptions class help you to set the behaviour for your chrome browser
		 * 
		 * 
		 */

	}

}
