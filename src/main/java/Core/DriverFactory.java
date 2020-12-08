package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.OaIdl.SYSKIND;

public class DriverFactory {

	private static WebDriver driver;
	
	private DriverFactory() {
	}
	
	public static WebDriver getDriver() 
	{				
		String caminhoFireFox = "src\\main\\resources\\geckodriver.exe";
		String driverFireFox = "webdriver.gecko.driver"; 	
		String caminhoChrome = "src\\main\\resources\\chromedriver.exe";
		String driverChrome = "webdriver.chrome.driver";
		
		if(driver == null)
		{			
			System.setProperty(driverFireFox, caminhoFireFox);
			System.setProperty(driverChrome,caminhoChrome);
			
			switch(proprieter.browser)
			{
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME:  driver = new ChromeDriver();	break;
			}
		}		
		return driver;
	}
	
	public static void killDriver(){
		WebDriver driver = getDriver();
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
