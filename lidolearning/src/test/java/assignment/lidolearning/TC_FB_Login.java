package assignment.lidolearning;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import assignment.lidolearning.Page.FB_Login;
import assignment.lidolearning.util.BasePage;

public class TC_FB_Login {

	public WebDriver driver = null;
	public FB_Login loginPage = null;

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) throws InterruptedException {
		BasePage basePage = new BasePage();
		driver = basePage.loadDriver(browser);
		basePage.loadURL(url);
		loginPage = new FB_Login(driver);
	}

	@Test
	@Parameters({ "userName", "password", "emptyUserName", "emptypassword" })
	public void fb_login(String userName, String password, String emptyUserName, String emptypassword) {
		loginPage.loginWithValidCredential(userName, password);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		loginPage = null;
		driver = null;
	}
}
