/**
 * 
 */
package assignment.lidolearning.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import assignment.lidolearning.util.BasePage;

/**
 * @author Shankar
 *
 */
public class FB_Login {

	WebDriver driver = null;
	BasePage basePage = null;

	public FB_Login(WebDriver driver) {
		this.driver = driver;
		this.basePage = new BasePage();
	}

	By userName = By.id("email");
	By password = By.id("pass");
	By loginButton = By.id("loginbutton");
	By fb_HomeIcon = By.xpath("//a[text()='Home']");
	By fb_logoutArrow = By.id("userNavigationLabel");
	By fb_logoutButton = By.xpath("//span[text()='Log Out']");

	public void loginWithValidCredential(String userName, String password) {
		this.typeUserName(userName);
		this.typePassword(password);
		this.clickFBLoginButton();
		WebDriverWait wait = basePage.waitInstance(driver, 55);
		wait.until(ExpectedConditions.visibilityOfElementLocated(fb_HomeIcon));
		fbLogout();
	}

	public void typeUserName(String userName) {
		driver.findElement(this.userName).sendKeys(userName);
	}

	public void typePassword(String password) {
		driver.findElement(this.password).sendKeys(password);
	}

	public void clickFBLoginButton() {
		driver.findElement(this.loginButton).click();
	}

	public void fbLogout() {
		driver.findElement(this.fb_logoutArrow).click();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(this.fb_logoutButton).click();
		WebDriverWait wait = basePage.waitInstance(driver, 50);
		wait.until(ExpectedConditions.titleContains("Facebook"));
	}
}