package WebDriver.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverExample {
	public static String Browser  = "Firefox";
	public static WebDriver driver;
	public static void main(String[] args) {
		
	if(Browser.equals("Chrome")){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	else if(Browser.equals("Firefox")){
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	else if(Browser.equals("ie")){
		WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
	}
	driver.get("https://printerpix.com");
	driver.close();
	}

}
