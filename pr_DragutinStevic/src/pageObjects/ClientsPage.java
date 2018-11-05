package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientsPage {

	private static WebElement element = null;

	private static WebElement getAddNewClient(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Add new client')]")));
		return element;
	}

	public static void addNewClient(WebDriver driver) {
		getAddNewClient(driver).click();
	}

	private static WebElement getClientName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Client Name']")));
		return element;
	}

	public static void setClientName(WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);
	}

	private static WebElement getContactName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='Contact Name']"));
		return element;
	}

	public static void setContactName(WebDriver driver, String contactName) {
		getContactName(driver).sendKeys(contactName);
	}

	private static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='E-mail']"));
		return element;
	}

	public static void setEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}

	private static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='Registry Number']"));
		return element;
	}

	public static void setRegistryNumber(WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);
	}

	private static WebElement getCountry(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='Countries']"));
		return element;
	}

	public static void setCountry(WebDriver driver, String countryName) {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountry(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	private static WebElement getCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='City']"));
		return element;
	}

	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	private static WebElement getStreet(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='Street']"));
		return element;
	}

	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	private static WebElement getZip(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='Zip']"));
		return element;
	}

	public static void setZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}

	private static WebElement getDateAdded(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Date Added')]"));
		return element;
	}

	public static void setDateAdded(WebDriver driver, String dateAdded) {
		getDateAdded(driver).click();
	}

	private static WebElement getCode(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@aria-label='Code']"));
		return element;
	}

	public static void setCode(WebDriver driver, String code) {
		getCode(driver).sendKeys(code);
	}

	private static WebElement getAgreementDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Agreement Date')]"));
		return element;
	}

	public static void setAgreementDate(WebDriver driver, String agreementDate) {
		getAgreementDate(driver).click();
	}

	private static WebElement getStatus(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple primary--text']"));
		return element;
	}

	private static WebElement getStatusLabel(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
		return element;
	}

	public static void setStatus(WebDriver driver, String status) {
		String currentStatus = getStatusLabel(driver).getText();
		String cs = currentStatus.split(":")[1].trim();
		if (!status.equals(cs)) {
			getStatus(driver).click();
		}
	}

	private static WebElement getSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return element;
	}

	public static void save(WebDriver driver) {
		getSaveButton(driver).click();
	}

	private static WebElement getBackToClientList(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Back to client list')]")));
		return element;
	}

	public static void backToClientList(WebDriver driver) {
		getBackToClientList(driver).click();
	}
}