package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import pageObjects.ClientsPage;
import pageObjects.HomePage;
import utility.Constant;
import utility.ExcelUtils;

public class ClientsPageTest {
	public static void setupExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet3");
	}

	public static String addNewClientTest(WebDriver driver) throws Exception {
		String clientName = ExcelUtils.getCellData(1, 1);
		String contactName = ExcelUtils.getCellData(2, 1);
		String email = ExcelUtils.getCellData(3, 1);
		String registryNumber = ExcelUtils.getCellData(4, 1);
		String country = ExcelUtils.getCellData(5, 1);
		String city = ExcelUtils.getCellData(6, 1);
		String street = ExcelUtils.getCellData(7, 1);
		String zip = ExcelUtils.getCellData(8, 1);
		String dateAdded = ExcelUtils.getCellData(9, 1);
		String code = ExcelUtils.getCellData(10, 1);
		String agreementDate = ExcelUtils.getCellData(11, 1);
		String status = ExcelUtils.getCellData(12, 1);

		HomePage.clientsPage(driver);
		ClientsPage.addNewClient(driver);
		ClientsPage.setClientName(driver, clientName);
		ClientsPage.setContactName(driver, contactName);
		ClientsPage.setEmail(driver, email);
		ClientsPage.setRegistryNumber(driver, registryNumber);
		ClientsPage.setCountry(driver, country);
		ClientsPage.setCity(driver, city);
		ClientsPage.setStreet(driver, street);
		ClientsPage.setZip(driver, zip);
		ClientsPage.setCode(driver, code);
		ClientsPage.setStatus(driver, status);
		ClientsPage.save(driver);		
		return "Pass";
	}
}