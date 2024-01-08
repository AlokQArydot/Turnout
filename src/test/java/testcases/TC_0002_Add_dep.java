package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.NumberFormat;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_0002_Add_dep extends TC_Turnout_Login_001 {
	
	@Test(priority = 2)
	public void deg() throws InterruptedException, IOException {
		FileInputStream file = new FileInputStream(new File("/home/alokkumarnayak/eclipse-workspace/com.Turnout/utility/turnoutemployee.xlsm"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("dep");

		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell name = row.getCell(0);
			XSSFCell code = row.getCell(1);
			Thread.sleep(3000);
			// click create ====================================================================================================================================================
			WebElement adddegButton = driver.findElement(By.xpath("//*[text()='Create']"));
						
			adddegButton.click();
			
			WebElement Name = driver.findElement(By.xpath("//*[@id='name']"));
			WebElement Code = driver.findElement(By.xpath("//*[@id='code']"));
			
			
			Name.sendKeys(name.getStringCellValue());   // enter department name 
			Code.sendKeys(code.getStringCellValue());   // enter code

//			double numericValue = code.getNumericCellValue();   //enter code 
//			NumberFormat nf = NumberFormat.getInstance();
//			nf.setGroupingUsed(false);
//			String stringValue = nf.format(numericValue);
//			Code.sendKeys(stringValue);
			
			driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
			
			Thread.sleep(3000);

}}}
