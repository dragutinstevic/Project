package pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {

	private static WebElement element = null;

	private static WebElement getAddNewBusiness(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Add new business')]")));
		return element;
	}

	public static void addNewBusiness(WebDriver driver) {
		getAddNewBusiness(driver).click();
	}

	private static WebElement getBusinessName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-name']")));
		return element;
	}

	public static void setBusinessName(WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}

	private static WebElement getCountry(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return element;
	}

	public static void setCountry(WebDriver driver, String countryName) {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountry(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	private static WebElement getCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return element;
	}

	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	private static WebElement getStreet(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return element;
	}

	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	private static WebElement getZip(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return element;
	}

	public static void setZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);

	}

	private static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return element;
	}

	public static void setRegistryNumber(WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);
	}

	private static WebElement getSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return element;
	}

	public static void save(WebDriver driver) {
		getSaveButton(driver).click();
	}

	private static WebElement getBackToBusinessList(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Back to business list')]")));
		return element;
	}

	public static void backToBusinessList(WebDriver driver) {
		getBackToBusinessList(driver).click();
	}

	private static WebElement getAddBankAccount(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Add Bank Account')]")));
		return element;
	}

	public static void addBankAccount(WebDriver driver) {
		getAddBankAccount(driver).click();
	}

	private static WebElement getBankName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='bank-dialog-name']")));
		return element;
	}

	public static void setBankName(WebDriver driver, String bankName) {
		getBankName(driver).sendKeys(bankName);
	}

	private static WebElement getAccountNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return element;
	}

	public static void setAccountNumber(WebDriver driver, String accountNumber) {
		getAccountNumber(driver).sendKeys(accountNumber);
	}

	private static WebElement getSwiftNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return element;
	}

	public static void setSwiftNumber(WebDriver driver, String swiftNumber) {
		getSwiftNumber(driver).sendKeys(swiftNumber);
	}

	private static WebElement getPaymentInstructions(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return element;
	}

	public static void setPaymentInstructions(WebDriver driver, String paymentInstructions) {
		getPaymentInstructions(driver).sendKeys(paymentInstructions);
	}

	private static WebElement getCurrency(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__selections']"));
		return element;
	}

	private static List<WebElement> getCurrencyLabel(WebDriver driver) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
		list.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
		list.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
		return list;
	}

	public static void setCurrency(WebDriver driver, String currency) {
		Actions builder = new Actions(driver);
		WebElement element = getCurrency(driver);
		Actions action = builder.moveToElement(element).click();
		action.perform();
		List<WebElement> currencyLabel = getCurrencyLabel(driver);
		for (WebElement e : currencyLabel) {
			if (e.getText().equals(currency)) {
				e.click();
			}
		}
	}

	private static WebElement getsetBankButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return element;
	}

	public static void setBank(WebDriver driver) {
		getsetBankButton(driver).click();
	}

	private static WebElement getCancelButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		return element;
	}

	public static void cancel(WebDriver driver) {
		getCancelButton(driver).click();
	}
}