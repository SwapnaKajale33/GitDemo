package httpcertification;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeoptionsExetension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		/*withis options object you can access them at methods present in this chromeoptions class
		 * This options object have the behavior of how it should behave so that behaviour options object.
		 * you have to pass as an argument to your chrome driver class
		 */
		/*AddExtension: you can dowload that chrome extensions as a file and give the path
		 * of that in this method.so in that way chrome while invoking picks up that file and added as an extension
		 * 
		 */
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		
		options.setCapability("proxy", proxy);
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
