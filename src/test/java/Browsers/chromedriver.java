package Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://printerpix.com");
		driver.close();

}
}