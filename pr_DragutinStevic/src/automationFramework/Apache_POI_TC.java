package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import pageObjectsTests.BusinessPageTest;
import pageObjectsTests.ClientsPageTest;
import pageObjectsTests.InvoicesPageTest;
import pageObjectsTests.LoginPageTest;
import utility.*;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dragan\\Documents\\Drajver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		LoginPageTest.setupExcel();
		LoginPageTest.SignInTest(driver);
		
//		BusinessPageTest.setupExcel();
//		BusinessPageTest.addNewBusinessTest(driver);
		
//		ClientsPageTest.setupExcel();
//		ClientsPageTest.addNewClientTest(driver);
		
//		InvoicesPageTest.setupExcel();
//		InvoicesPageTest.addNewInvoiceTest(driver);
		
//		driver.close();
//		driver.quit();
	}
}