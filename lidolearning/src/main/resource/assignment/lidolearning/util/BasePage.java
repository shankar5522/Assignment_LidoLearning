/**
 * 
 */
package assignment.lidolearning.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Shankar
 *
 */
public class BasePage {

	public WebDriver driver = null;

	public void loadURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public WebDriver loadDriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Opps! Issue while loading the Browser");
		}
		return driver;
	}

}
