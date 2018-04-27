package home.assignment5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebsiteTest {

	static void openNewTours(WebDriver driver) {
		String url = "http://newtours.demoaut.com/";
		driver.manage().window().maximize();
		driver.get(url);
		
		String title = driver.getTitle();
		System.out.println("WEBSITE TITLE IS: "+ title);
		
		String footer = driver.findElement(By.className("footer")).getAttribute("outerText");
		System.out.println("FOOTER IS: "+ footer);
		if(footer.equals("© 2005, Mercury Interactive (v. 011003-1.01-058)")){
			System.out.println("FOOTER DISPLAYED CORRECTLY");
		}
		else{
			System.out.println("FOOTER NOT DISPLAYED CORRECTLY");
		}
	}
	
	static void openFacebook(WebDriver driver) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		String url = "https://www.facebook.com/";
		driver.navigate().to(url);
		System.out.println("FACEBOOK OPENED IN NEW TAB");
	}
	
	static void closeBrowser(WebDriver driver){
		driver.close();
		System.out.println("BROWSER CLOSED");
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		openNewTours(driver);
		String firstTab = driver.getWindowHandle();
		openFacebook(driver);
		Set<String> set = driver.getWindowHandles();
		
		closeBrowser(driver);
	}

}
