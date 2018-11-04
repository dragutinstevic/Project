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

public class InvoicesPage {

	private static WebElement element = null;

	private static WebElement getAddNewInvoice(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='set-new-invoice']//div[@class='v-btn__content']")));
		return element;
	}

	public static void addNewInvoice(WebDriver driver) {
		getAddNewInvoice(driver).click();
	}

	private static WebElement getTitle(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[@id='click-to-enter']")));
		return element;
	}

	public static void setTitle(WebDriver driver, String title) {
		Actions builder = new Actions(driver);
		builder.moveToElement(getTitle(driver)).click().sendKeys(title);
		builder.perform();
	}

	private static WebElement getStatus(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__selection v-select__selection--comma']"));
		return element;
	}

	private static List<WebElement> getStatusLabel(WebDriver driver) {
		List<WebElement> list = new ArrayList<WebElement>();
		list.add(driver.findElement(By.xpath("//div[@class='v-list__tile__title'][contains(text(),'Draft')]")));
		list.add(driver.findElement(By.xpath("//div[contains(text(),'Sent')]")));
		list.add(driver.findElement(By.xpath("//div[contains(text(),'Paid')]")));
		list.add(driver.findElement(By.xpath("//div[contains(text(),'Invalidated')]")));
		return list;
	}

	public static void setStatus(WebDriver driver, String status) {
		Actions builder = new Actions(driver);
		WebElement element = getStatus(driver);
		Actions action = builder.moveToElement(element).click();
		action.perform();
		List<WebElement> statusLabel = getStatusLabel(driver);
		for (WebElement e : statusLabel) {
			if (e.getText().equals(status)) {
				e.click();
			}
		}
	}

	private static WebElement getClient(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@class='layout pa-2 column']//div[@class='v-select__selections']"));
		return element;
	}

	public static void setClient(WebDriver driver, String client) {
		getClient(driver).click();
		List<WebElement> clientList = driver.findElements(By.xpath("//div[@class='v-list__tile__title']"));
		int listSize = clientList.size();
		for (int i = 0; i < listSize; i++) {
			WebElement e = clientList.get(i);
			if (e.getText().equals(client)) {
				e.click();
			}
		}
	}

	private static WebElement getBusiness(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='layout pa-2 secondary column']//div[@class='v-select__selections']"));
		return element;
	}

	public static void setBusiness(WebDriver driver, String business) {
		getBusiness(driver).click();
		List<WebElement> businessList = driver.findElements(By.xpath("//div[@class='v-list__tile__title']"));
		int listSize = businessList.size();
		for (int i = 0; i < listSize; i++) {
			WebElement element = businessList.get(i);
			if (element.getText().equals(business)) {
				element.click();
			}
		}
	}

	private static WebElement getNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-number']"));
		return element;
	}

	public static void setNumber(WebDriver driver, String number) {
		Actions builder = new Actions(driver);
		getNumber(driver).click();
		getNumber(driver).clear();
		Actions action = builder.moveToElement(getNumber(driver)).sendKeys(number);
		action.perform();
	}

	private static WebElement getDateSubmitted(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-date-submitted']"));
		return element;
	}

	public static void setDateSubmitted(WebDriver driver, String dateSubmitted) {
		getDateSubmitted(driver).sendKeys(dateSubmitted);
	}

	private static WebElement getDueDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-date-duedate']"));
		return element;
	}

	public static void setDueDate(WebDriver driver, String dueDate) {
		getDueDate(driver).sendKeys(dueDate);
	}

	private static WebElement getBasis(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-basis']"));
		return element;
	}

	public static void setBasis(WebDriver driver, String basis) {
		getBasis(driver).sendKeys(basis);
	}

	private static WebElement getCurrency(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs4 ml-2']//div[@class='v-select__selections']"));
		return element;
	}

	public static void setCurrency(WebDriver driver) {
		Actions builder = new Actions(driver);
		Actions action = builder.moveToElement(getCurrency(driver)).click()
				.sendKeys(driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/a/div/div")), Keys.ENTER);
		action.perform();
	}

	private static WebElement getAddContent(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='set-content-btn']//div[@class='v-btn__content']"));
		return element;
	}

	public static void addContent(WebDriver driver) {
		getAddContent(driver).click();
	}

	private static WebElement getService(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-service-0']"));
		return element;
	}

	public static void setService(WebDriver driver, String service) {
		getService(driver).sendKeys(service);
	}

	private static WebElement getNote(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-note-0']"));
		return element;
	}

	public static void setNote(WebDriver driver, String note) {
		getNote(driver).sendKeys(note);
	}

	private static WebElement getDays(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-days-0']"));
		return element;
	}

	public static void setDays(WebDriver driver, String days) {
		getDays(driver).click();
		getDays(driver).clear();
		getDays(driver).sendKeys(days);
	}

	private static WebElement getRatePerHour(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inv-form-rate-0']"));
		return element;
	}

	public static void setRatePerHour(WebDriver driver, String ratePerHour) {
		getRatePerHour(driver).click();
		getRatePerHour(driver).clear();
		getRatePerHour(driver).sendKeys(ratePerHour);
	}

	private static WebElement getNotes(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='inv-form-notes']"));
		return element;
	}

	public static void setNotes(WebDriver driver, String notes) {
		getNotes(driver).sendKeys(notes);
	}

	private static WebElement getBank(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='flex xs2']//div[@class='v-input v-text-field v-select']//div[@class='v-select__slot']"));
		return element;
	}

	public static void setBank(WebDriver driver) {
		getBank(driver).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/a/div")))
				.click();
	}

	private static WebElement getSaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'save')]"));
		return element;
	}

	public static void save(WebDriver driver) {
		getSaveButton(driver).click();
	}

	private static WebElement getCancelButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'cancel')]"));
		return element;
	}

	public static void cancel(WebDriver driver) {
		getCancelButton(driver).click();
	}

	private static WebElement getBackToInvoicesList(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='inv-form-back-btn']//div[@class='v-btn__content']")));
		return element;
	}

	public static void backToInvoicesList(WebDriver driver) {
		getBackToInvoicesList(driver).click();
	}
}