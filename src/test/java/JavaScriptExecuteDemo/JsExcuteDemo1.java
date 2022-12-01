package JavaScriptExecuteDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExcuteDemo1 {

	public static void main(String[] args) throws InterruptedException {
		/*Java Script Executor:
		 * JavaScriptExecutor is an interface that helps to execute JavaScript through Selenium WebDriver
		 * 
		 * Syntax: JavaScriptExecutor js = (JavascriptsExecutor)driver;
		 * js.executeScript(script,Arguments);
		 * Script: This is the javaScript that needs to execute .
		 * Arguments: It is the arguments to the script. its optional.
		 * Returns: could be anything from Boolean, Long,String, List,WebElement or null.
		 * 
		 * 
		 * 
		 * driver means webdriver ka instance or object typecast to java script executor 
		 * why we need to typecast to javascript to driver
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// to Enter text in search box type text using js 
		JavascriptExecutor js =(JavascriptExecutor)driver;
	   WebElement txt =driver.findElement(By.name("username"));
	   js.executeScript("arguments[0].value='Admin'", txt);
	   WebElement Pwd = driver.findElement(By.name("password"));
	   js.executeScript("arguments[0].value='admin123'", Pwd);
	   Thread.sleep(3000);
	   WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
	   js.executeScript("arguments[0].click()", element);
	
		//js.executeScript("document.getElementByName('username').value='Admin';" );
		//js.executeScript("document.getElementByName('password').value='admin123';" );
		// to click button using js
		//WebElement element =driver.findElement(By.xpath("//button[@type='submit']"));
		//js.executeScript("argument[0].click();", element);
		// refresh browser
		//js.executeScript("history.go(0)");
		
		// to get the title of our Webpage
	//String title =	js.executeScript("return document.title;").toString();
	//System.out.println(title);
	
	// to generate Alert Pop windows in selenium WebDriver
//	js.executeScript("alert('Welcome to Selenium');");
		
	}

}
