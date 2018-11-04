package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static WebElement element = null;

	private static WebElement getInvoicesPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='nav-bar-invoices']//div[@class='v-btn__content']")));
		return element;
	}
	
	public static void invoicesPage(WebDriver driver) {
		getInvoicesPage(driver).click();
	}

	private static WebElement getBusinessPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']")));
		return element;
	}
	
	public static void businessPage(WebDriver driver) {
		getBusinessPage(driver).click();
	}

	private static WebElement getClientsPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']")));
		return element;
	}
	
	public static void clientsPage(WebDriver driver) {
		getClientsPage(driver).click();
	}
}