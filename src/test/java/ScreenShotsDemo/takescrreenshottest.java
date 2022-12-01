package ScreenShotsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescrreenshottest {

	public static void main(String[] args) throws IOException {
		/*If you want to take a schreenshot you have to convert 
		 * Steps to take screenshot:
1. Create an object of specific browser related class (eg : FirefoxDriver) and then upcast it to WebDriver
object (eg : driver)
2. Typecast the same upcasted driver object to TakesScreenshot interface type.
3. Using the typecasted object, we call getScreenshotAs(OutputType.FILE) which in turn returns the
source file object.
4. Using the File IO operations (i.e FileUtils class), we store the screenshots to desired location in the
projec
		 * 
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("E://screenshot.png"));
	 
	}

}
