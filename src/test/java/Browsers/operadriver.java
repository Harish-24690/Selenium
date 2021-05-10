package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class operadriver {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.opera.driver", "C:\\operadriver_win64\\operadriver_win64\\operadriver.exe"); //exe file plugin
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("https://printerpix.com");
		driver.close();
	}

}
