package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private static WebElement element = null;

	private static WebElement getEmailField(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-form-email']")));
		return element;
	}

	public static void setEmail(WebDriver driver, String email) {
		getEmailField(driver).clear();
		getEmailField(driver).sendKeys(email);
	}

	private static WebElement getPasswordField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='login-pass']"));
		return element;
	}

	public static void setPassword(WebDriver driver, String password) {
		getPasswordField(driver).clear();
		getPasswordField(driver).sendKeys(password);
	}

	private static WebElement getLoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return element;
	}

	public static void login(WebDriver driver) {
		getLoginButton(driver).click();
	}

	private static WebElement getMenu(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//i[@class='v-icon material-icons material-icons']")));
		return element;
	}

	private static void menu(WebDriver driver) {
		getMenu(driver).click();
	}

	private static WebElement getActivityLogButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Activity Log')]"));
		return element;
	}

	public static void activityLog(WebDriver driver) {
		Actions builder = new Actions(driver);
		menu(driver);
		Actions action = builder.sendKeys(getActivityLogButton(driver), Keys.ENTER);
		action.perform();
	}

	private static WebElement getLogoutButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'Logout')]"));
		return element;
	}

	public static void logout(WebDriver driver) {
		Actions builder = new Actions(driver);
		menu(driver);
		Actions action = builder.sendKeys(getLogoutButton(driver), Keys.ENTER)
				.sendKeys(driver.findElement(By.xpath("//div[contains(text(),'Yes')]")), Keys.ENTER);
		action.perform();
	}
}