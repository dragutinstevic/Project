package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import pageObjects.BusinessPage;
import pageObjects.HomePage;
import utility.Constant;
import utility.ExcelUtils;

public class BusinessPageTest {
	public static void setupExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");
	}

	public static String setNewBusinessTest(WebDriver driver) throws Exception {

		String businessName = ExcelUtils.getCellData(1, 1);
		String country = ExcelUtils.getCellData(2, 1);
		String city = ExcelUtils.getCellData(3, 1);
		String street = ExcelUtils.getCellData(4, 1);
		String zip = ExcelUtils.getCellData(5, 1);
		String registryNumber = ExcelUtils.getCellData(6, 1);
		
		String bankName = ExcelUtils.getCellData(7, 1);
		String accountNumber = ExcelUtils.getCellData(8, 1);
		String swiftNumber = ExcelUtils.getCellData(9, 1);
		String paymentInstructions = ExcelUtils.getCellData(10, 1);
		String currency = ExcelUtils.getCellData(11, 1);
		
		HomePage.businessPage(driver);
		BusinessPage.addNewBusiness(driver);
		BusinessPage.setBusinessName(driver, businessName);
		BusinessPage.setCountry(driver, country);
		BusinessPage.setCity(driver, city);
		BusinessPage.setStreet(driver, street);
		BusinessPage.setZip(driver, zip);
		BusinessPage.setRegistryNumber(driver, registryNumber);
		
		BusinessPage.addBankAccount(driver);
		BusinessPage.setBankName(driver, bankName);
		BusinessPage.setAccountNumber(driver, accountNumber);
		BusinessPage.setSwiftNumber(driver, swiftNumber);
		BusinessPage.setPaymentInstructions(driver, paymentInstructions);
		BusinessPage.setCurrency(driver, currency);
		BusinessPage.setBank(driver);
		BusinessPage.save(driver);
		return "Pass";
	}
}