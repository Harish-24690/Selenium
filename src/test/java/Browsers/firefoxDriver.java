package Browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxDriver {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://printerpix.com");
		driver.close();
	}

}
