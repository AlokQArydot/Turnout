package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Trail_Turnout extends TC_Turnout_Login_001 {

	@Test(priority = 2)

	public void employee() throws InterruptedException, IOException {
		FileInputStream file = new FileInputStream(
				new File("/home/alokkumarnayak/eclipse-workspace/com.Turnout/utility/turnoutemployee.xlsm"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("employee");

		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			XSSFRow row = sheet.getRow(i);

			XSSFCell name = row.getCell(0);
			XSSFCell code = row.getCell(1);
			XSSFCell Gender = row.getCell(2);
			XSSFCell mobno = row.getCell(3);
			XSSFCell almobno = row.getCell(4);
			XSSFCell doj = row.getCell(5);
			XSSFCell dob = row.getCell(6);
			XSSFCell Blood = row.getCell(7);
			XSSFCell maritalstatus = row.getCell(8);
			XSSFCell marraigedate = row.getCell(9);
			XSSFCell companysubs = row.getCell(10);
			XSSFCell employetype = row.getCell(11);
			XSSFCell department = row.getCell(12);
			XSSFCell role = row.getCell(13);
			XSSFCell designation = row.getCell(14);
			XSSFCell reportingmaneger = row.getCell(15);
			XSSFCell zone = row.getCell(15);
			XSSFCell region = row.getCell(16);
			XSSFCell state = row.getCell(17);
			XSSFCell city = row.getCell(18);
			XSSFCell branch = row.getCell(19);
			XSSFCell address = row.getCell(20);
			XSSFCell email = row.getCell(21);
			XSSFCell password = row.getCell(22);
			XSSFCell cpassword = row.getCell(23);

			// element start
			// ======================================================================================================================================

			Thread.sleep(2000);

			// click create
			// ====================================================================================================================================================
			WebElement addemployeeButton = driver.findElement(By.xpath("//*[text()='Create']"));

			addemployeeButton.click();

			Thread.sleep(2000);

			// Enter name
			// ====================================================================================================================================================

			WebElement Name = driver.findElement(By.xpath("//*[@id='name']"));

			Name.sendKeys(name.getStringCellValue());

			// Enter code
			// ====================================================================================================================================================

			WebElement Code = driver.findElement(By.xpath("//*[@id='employeeCode']"));

			if (code.getCellType() == CellType.STRING) {
				String codeValue = code.getStringCellValue();
				Code.sendKeys(codeValue);
			} else if (code.getCellType() == CellType.NUMERIC) {
				double number = code.getNumericCellValue();
				NumberFormat nf = NumberFormat.getInstance();
				nf.setGroupingUsed(false);
				String codevalue = nf.format(number);
				Code.sendKeys(codevalue);
			}

			// Select Gender
			// ====================================================================================================================================================
			WebElement male = driver.findElement(By.xpath("//*[@id='gender_m']"));

			WebElement female = driver.findElement(By.xpath("//*[@id='gender_f']"));

			String gender = Gender.getStringCellValue();
			if (gender.equalsIgnoreCase("male")) {
				male.click();
			} else if (gender.equalsIgnoreCase("female")) {
				female.click();
			}

			// Select Mobile Number
			// ====================================================================================================================================================

			WebElement Mo_Number = driver.findElement(By.xpath("//*[@id='phone']"));

			if (mobno.getCellType() == CellType.STRING) {
				String stringValue = mobno.getStringCellValue();
				Mo_Number.sendKeys(stringValue);
			} else if (mobno.getCellType() == CellType.NUMERIC) {
				double number = mobno.getNumericCellValue();
				NumberFormat nf = NumberFormat.getInstance();
				nf.setGroupingUsed(false);
				String mobilenumber = nf.format(number);
				Mo_Number.sendKeys(mobilenumber);
			}

			// Select Mobile Number
			// ====================================================================================================================================================

			WebElement Alter_Mo_Number = driver.findElement(By.xpath("//*[@id='alternatePhone']"));

			if (almobno.getCellType() == CellType.STRING) {
				String stringValue = almobno.getStringCellValue();
				Alter_Mo_Number.sendKeys(stringValue);
			} else if (almobno.getCellType() == CellType.NUMERIC) {
				double number = almobno.getNumericCellValue();
				NumberFormat nf = NumberFormat.getInstance();
				nf.setGroupingUsed(false);
				String mobilenumber = nf.format(number);
				Alter_Mo_Number.sendKeys(mobilenumber);
			}
			// Select Join Date
			// ====================================================================================================================================================

			WebElement Joind = driver.findElement(By.xpath("//*[@id='joiningDate']"));

			double dojValue = doj.getNumericCellValue();
			java.util.Date date = DateUtil.getJavaDate(dojValue);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String formattedDate = sdf.format(date);
			Joind.sendKeys(formattedDate);

			// Select Date of Birth
			// ====================================================================================================================================================

			WebElement Dob = driver.findElement(By.xpath("//*[@id='birthdate'] "));

			double dobValue = dob.getNumericCellValue();
			java.util.Date date1 = DateUtil.getJavaDate(dobValue);
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			String formattedDate1 = sdf1.format(date1);
			Dob.sendKeys(formattedDate1);

			// Select Blood Group
			// ====================================================================================================================================================

			String bloodType = Blood.getStringCellValue().toUpperCase();
			System.out.println(bloodType);

			WebElement bloodGroupDropdown = driver.findElement(By.xpath("//*[@id='bloodGroup']"));
			bloodGroupDropdown.click();
			Thread.sleep(3000);

			WebElement bloodGroupOption = driver.findElement(By.xpath("//*[text()='" + bloodType + "']"));
			bloodGroupOption.click();

			// Select martial status
			// ====================================================================================================================================================

			String martialType = maritalstatus.getStringCellValue();
			System.out.println(martialType);

			Thread.sleep(2000);

			WebElement martialropdown = driver.findElement(By.xpath("//*[@id='maritalStatus']"));
			martialropdown.click();
			Thread.sleep(3000);

			WebElement martialOption = driver.findElement(By.xpath("//*[text()='" + martialType + "']"));

			if (martialType.equalsIgnoreCase("Married")) {

				martialOption.click();

				Thread.sleep(2000);

				WebElement marriagedate = driver.findElement(By.xpath("//*[@id='marriageDate']")); // enter marriage
																									// date
				double marraigeValue = marraigedate.getNumericCellValue();
				java.util.Date date2 = DateUtil.getJavaDate(marraigeValue);
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				String formattedDate2 = sdf2.format(date2);
				marriagedate.sendKeys(formattedDate2);

			} else if (!martialType.equalsIgnoreCase("Married")) {
				Thread.sleep(2000);
				martialOption.click();
			}

			// Select Company Name
			// ====================================================================================================================================================

			Thread.sleep(2000);

			String CompanyType = companysubs.getStringCellValue();

			System.out.println(CompanyType);

			WebElement companyDropdown = driver.findElement(By.xpath("//*[@id='childCompanyId']"));
			companyDropdown.click();
			Thread.sleep(3000);

			WebElement CompanyOption = driver.findElement(By.xpath("//*[text()='" + CompanyType + "']"));

			Thread.sleep(2000);

			CompanyOption.click();

			// Select Employee Type
			// ====================================================================================================================================================

			Thread.sleep(2000);

			String employeeType = employetype.getStringCellValue();

			System.out.println(employeeType);

			WebElement employeeDropdown = driver.findElement(By.xpath("//*[@id='employeeType']"));
			employeeDropdown.click();
			Thread.sleep(3000);

			WebElement employeOption = driver.findElement(By.xpath("//*[text()='" + employeeType + "']"));

			employeOption.click();

			// Select Department Type
			// ====================================================================================================================================================

			Thread.sleep(2000);

			String DepartmentType = department.getStringCellValue();

			System.out.println(DepartmentType);

			WebElement DepartmentDropdown = driver.findElement(By.xpath("//*[@id='department']"));
			DepartmentDropdown.click();
			Thread.sleep(3000);

			WebElement DepartmentOption = driver.findElement(By.xpath("//*[text()='" + DepartmentType + "']"));

			DepartmentOption.click();

			// Select Role Type
			// ====================================================================================================================================================

			Thread.sleep(2000);

			String RoletType = role.getStringCellValue();

			System.out.println(RoletType);

			WebElement RoleDropdown = driver.findElement(By.xpath("//*[@id='role']"));
			RoleDropdown.click();
			Thread.sleep(3000);

			WebElement RoleOption = driver.findElement(By.xpath("//*[text()='" + RoletType + "']"));

			RoleOption.click();

			// Select Designation Type
			// ====================================================================================================================================================

			Thread.sleep(2000);

			String DesignationtType = designation.getStringCellValue();

			System.out.println(RoletType);

			WebElement  DesignationDropdown = driver.findElement(By.xpath("//*[@id='designation']"));
			DesignationDropdown.click();
			Thread.sleep(3000);

			WebElement DesignationOption = driver.findElement(By.xpath("//*[text()='" + DesignationtType + "']"));

			DesignationOption.click();

		}
	}
}
