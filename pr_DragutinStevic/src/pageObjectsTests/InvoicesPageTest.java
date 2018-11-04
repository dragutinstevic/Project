package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.InvoicesPage;
import utility.Constant;
import utility.ExcelUtils;

public class InvoicesPageTest {
	public static void setupExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet4");
	}

	public static String addNewInvoiceTest(WebDriver driver) throws Exception {
		String title = ExcelUtils.getCellData(1, 1);
		String status = ExcelUtils.getCellData(2, 1);
		String client = ExcelUtils.getCellData(3, 1);
		String business = ExcelUtils.getCellData(4, 1);
		String number = ExcelUtils.getCellData(5, 1);
		String dateSubmitted = ExcelUtils.getCellData(6, 1);
		String dueDate = ExcelUtils.getCellData(7, 1);
		String basis = ExcelUtils.getCellData(8, 1);
		String service = ExcelUtils.getCellData(9, 1);
		String note = ExcelUtils.getCellData(10, 1);
		String days = ExcelUtils.getCellData(11, 1);
		String ratePerHour = ExcelUtils.getCellData(12, 1);
		String notes = ExcelUtils.getCellData(13, 1);

		HomePage.invoicesPage(driver);
		InvoicesPage.addNewInvoice(driver);
		InvoicesPage.setTitle(driver, title);
		InvoicesPage.setStatus(driver, status);
		InvoicesPage.setClient(driver, client);
		InvoicesPage.setBusiness(driver, business);
		InvoicesPage.setNumber(driver, number);
		InvoicesPage.setBasis(driver, basis);
		InvoicesPage.setCurrency(driver);
		InvoicesPage.addContent(driver);
		InvoicesPage.setService(driver, service);
		InvoicesPage.setNote(driver, note);
		InvoicesPage.setDays(driver, days);
		InvoicesPage.setRatePerHour(driver, ratePerHour);
		InvoicesPage.setNotes(driver, notes);
		InvoicesPage.setBank(driver);
		InvoicesPage.save(driver);
		return "Pass";
	}
}