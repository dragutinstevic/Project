package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utility.Constant;
import utility.ExcelUtils;

public class LoginPageTest {

	public static void setupExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
	}

	public static String SignInTest(WebDriver driver) throws Exception {
		String email = ExcelUtils.getCellData(1, 1);
		String password = ExcelUtils.getCellData(2, 1);

		LoginPage.setEmail(driver, email);
		LoginPage.setPassword(driver, password);
		LoginPage.login(driver);
		//LoginPage.activityLog(driver);
		//LoginPage.logout(driver);
		return "Pass";
	}
}