package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgeBrowser {
	public static void main(String[] args) {
	//DesiredCapabilities capabilities =  DesiredCapabilities.edge();
	//capabilities.setCapability(EdgeDriver., true, );
    //System.setProperty("webdriver.edge.driver", "C:\\MicrosoftWebDriver.exe");
	WebDriverManager.edgedriver().setup();	
	WebDriver driver = new EdgeDriver();
	driver.get("https://printerpix.com");
	driver.close();
	
			
	}

}
