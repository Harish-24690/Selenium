package Browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iexplorer {
	public static void main(String[] args) {
		DesiredCapabilities  capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
		
		driver.get("https://printerpix.com");
		driver.close();
	}

}
