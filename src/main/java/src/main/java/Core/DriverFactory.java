package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	private DriverFactory() {
	}
	
	public static WebDriver getDriver() 
	{
		String caminhoFireFox = "C:\\Users\\Flavio\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe";
		String driverFireFox = "webdriver.gecko.driver"; 
		String caminhoChrome = "C:\\Users\\Flavio\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		String driverChrome = "webdriver.chrome.driver";
		
		if(driver == null)
		{
			System.setProperty(driverFireFox, caminhoFireFox);
			switch(proprieter.browser)
			{
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;
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
