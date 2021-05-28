package tests;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LogIn extends BaseClass {

	XSSFWorkbook workbook;
	XSSFSheet sheet1;

	@BeforeTest
	public void fetchData() throws IOException {
		FileInputStream fio = new FileInputStream("exceldata.xlsx");
		workbook = new XSSFWorkbook(fio);
		sheet1 = workbook.getSheetAt(0);

	}

	@Test
	public void login() throws InterruptedException {

		LoginPage loginpage = new LoginPage(driver);
		String mobile = sheet1.getRow(0).getCell(0).getStringCellValue();
		loginpage.loginApp(mobile);

	}

}
