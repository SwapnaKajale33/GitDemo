package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownDemo {

	public static void main(String[] args) {
		//We call it as a static because options in this dropdown is fixed.
		System.setProperty("webdriver.chrome.driver","E:\\Swapnali\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// dropdown with select Tag
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);// call this method you can create object of this select class
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	

	}

}
