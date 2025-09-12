package steps;



import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import utils.ExcelUtility;
import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions  {
	
	public static ExcelUtility excelUtil;

	/*@BeforeSuite
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
       
       String filePath = "C:\\CMS\\Website-Test-Automation-master\\Website-Test-Automation-master\\src\\test\\resources\\TestData.xlsx";
		String sheetName = "Sheet1";
		excelUtil = new ExcelUtility(filePath);
		int rowCount = 0;
		try {
			rowCount = excelUtil.getRowCount(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }*/
}
