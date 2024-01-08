package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC__00001_AddEmployee extends TC_Turnout_Login_001 {

	@Test(priority = 2)

	public void employee() throws InterruptedException, IOException {
		FileInputStream file = new FileInputStream(new File("/home/alokkumarnayak/eclipse-workspace/com.Turnout/utility/Live.xlsm"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("employee");

		for (int i =0 ; i < sheet.getLastRowNum() + 1; i++) {
			XSSFRow row = sheet.getRow(i);

			XSSFCell name = row.getCell(0);
			XSSFCell code = row.getCell(1);
			XSSFCell Gender = row.getCell(2);
			XSSFCell mobno = row.getCell(3);
			//XSSFCell almobno = row.getCell(4);
			XSSFCell doj = row.getCell(5);
			XSSFCell dob = row.getCell(6);
			XSSFCell Blood = row.getCell(7);
			XSSFCell maritalstatus = row.getCell(8);
			XSSFCell marraigedate = row.getCell(9);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
			XSSFCell companysubs = row.getCell(10);
			XSSFCell emtype = row.getCell(11);
			XSSFCell depa = row.getCell(12);
			XSSFCell role = row.getCell(13);
			XSSFCell designation = row.getCell(14);
			//XSSFCell reportingmaneger = row.getCell(15);
			XSSFCell zone = row.getCell(15);
			XSSFCell region = row.getCell(16);
			XSSFCell state = row.getCell(17);
			XSSFCell city = row.getCell(18);
			XSSFCell branch = row.getCell(19);
			XSSFCell address = row.getCell(20);
			XSSFCell email = row.getCell(21);
			XSSFCell password = row.getCell(22);
			XSSFCell cpassword = row.getCell(23);

//   element start ======================================================================================================================================		

			Thread.sleep(2000);
// click create ====================================================================================================================================================
			WebElement addemployeeButton = driver.findElement(By.xpath("//*[text()='Create']"));
			
			addemployeeButton.click();

			Thread.sleep(2000);

			WebElement Name = driver.findElement(By.xpath("//*[@id='name']"));
			WebElement Code = driver.findElement(By.xpath("//*[@id='employeeCode']"));
			WebElement male = driver.findElement(By.xpath("//*[@id='gender_m']"));
			WebElement female = driver.findElement(By.xpath("//*[@id='gender_f']"));
			WebElement Mob = driver.findElement(By.xpath("//*[@id='phone']"));
			//WebElement Almob = driver.findElement(By.xpath("//*[@id='alternatePhone']"));
			WebElement Joind = driver.findElement(By.xpath("//*[@id='joiningDate']"));
			WebElement Dob = driver.findElement(By.xpath("//*[@id='birthdate'] "));
			WebElement bloodg = driver.findElement(By.xpath("//*[@id='bloodGroup']"));
			WebElement marital = driver.findElement(By.xpath("//*[@id='maritalStatus']"));
			WebElement Comps = driver.findElement(By.xpath("//*[@id='childCompanyId']"));
			WebElement Emtype = driver.findElement(By.xpath("//*[@id='employeeType']"));
			WebElement Department1 = driver.findElement(By.xpath("//*[@id='department']"));
			WebElement Role = driver.findElement(By.xpath("//*[@id='role']"));
			WebElement Designationbtn = driver.findElement(By.xpath("//*[@id='designation']"));
			//WebElement repotingmanager = driver.findElement(By.xpath("//*[@id='reportingManager']"));
			WebElement zonebtn = driver.findElement(By.xpath("//*[@id='zoneId']"));
			WebElement regionbtn = driver.findElement(By.xpath("//*[@id='regionId']"));
			WebElement statebtn = driver.findElement(By.xpath("//*[@id='state']"));
			WebElement citybtn = driver.findElement(By.xpath("//*[@id='city']"));
			WebElement branchbtn = driver.findElement(By.xpath("//*[@id='branchId']"));
			WebElement addressbtn = driver.findElement(By.xpath("//*[@id='metaInfo.address.lines']"));
			WebElement emailbtn = driver.findElement(By.xpath("//*[@id='email']"));
			WebElement passwordbtn = driver.findElement(By.xpath("//*[@id='password']"));
			WebElement confirmpassword = driver.findElement(By.xpath("//*[@id='confirm_password']"));

			Name.sendKeys(name.getStringCellValue());   
			// enter employee name 
			Code.sendKeys(code.getStringCellValue());
//			double numericValue = code.getNumericCellValue();   //enter code 
//			NumberFormat nf = NumberFormat.getInstance();
//			nf.setGroupingUsed(false);
//			String stringValue = nf.format(numericValue);
//			Code.sendKeys(stringValue);

			String gender = Gender.getStringCellValue();        // click gender 
			if (gender.equalsIgnoreCase("male")) {
				male.click();
			} else if (gender.equalsIgnoreCase("female")) {
				female.click();
			}

//			double number = mobno.getNumericCellValue();         // enter mobile number
//			NumberFormat mf = NumberFormat.getInstance();
//			mf.setGroupingUsed(false);
//			String mobilenumber = mf.format(number);
//			Mob.sendKeys(mobilenumber);

			Mob.sendKeys(mobno.getStringCellValue());
			
//			double alnumber = almobno.getNumericCellValue();      // enter alternative mobile number 
//			NumberFormat amf = NumberFormat.getInstance();
//			amf.setGroupingUsed(false);
//			String almobilenumber = amf.format(alnumber);
//			Almob.sendKeys(almobilenumber);

			double dojValue = doj.getNumericCellValue();          // enter date of joining 
			java.util.Date date = DateUtil.getJavaDate(dojValue);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String formattedDate = sdf.format(date);
			Joind.sendKeys(formattedDate);

			double dobValue = dob.getNumericCellValue();           // enter date of birth 
			java.util.Date date1 = DateUtil.getJavaDate(dobValue);
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			String formattedDate1 = sdf1.format(date1);
			Dob.sendKeys(formattedDate1);

			
			bloodg.click();											// enter blood group 
			
			Thread.sleep(3000);
			WebElement Apositive = driver.findElement(By.xpath("//*[text()='A+']"));
			WebElement Bpositive = driver.findElement(By.xpath("//*[text()='B+']"));
			WebElement Anegative = driver.findElement(By.xpath("//*[text()='A-']"));
			WebElement Bnegative = driver.findElement(By.xpath("//*[text()='B-']"));
			WebElement ABnegative = driver.findElement(By.xpath("//*[text()='AB-']"));
			WebElement ABpositive = driver.findElement(By.xpath("//*[text()='AB+']"));
			WebElement Opositive = driver.findElement(By.xpath("//*[text()='O+']"));
			WebElement Onegative = driver.findElement(By.xpath("//*[text()='O-']"));
			

			 String bloodtype = Blood.getStringCellValue();

			 System.out.println(bloodtype);        

			if (bloodtype.equalsIgnoreCase("A+")) {
				
				Apositive.click();
			} else if (bloodtype.equalsIgnoreCase("B+")) {
				Bpositive.click();
			} else if (bloodtype.equalsIgnoreCase("A-")) {
				Anegative.click();
			} else if (bloodtype.equalsIgnoreCase("B-")) {
				
				Bnegative.click();
			} else if (bloodtype.equalsIgnoreCase("AB-")) {
				
				ABnegative.click();
			} else if (bloodtype.equalsIgnoreCase("AB+")) {
				
				ABpositive.click();
			}else if (bloodtype.equalsIgnoreCase("O+")) {
				
				Opositive.click();
			} else if (bloodtype.equalsIgnoreCase("O-")) {
		
				Onegative.click();
			}
	 
			
			marital.click();                                  // enter martial status 

			Thread.sleep(3000);                                
			
			WebElement Married = driver.findElement(By.xpath("//*[text()='Married']"));
			WebElement Single = driver.findElement(By.xpath("//*[text()='Single']"));
			WebElement Divorced = driver.findElement(By.xpath("//*[text()='Divorced']"));
			WebElement widowed = driver.findElement(By.xpath("//*[text()='widowed']"));

			String maritalvalue = maritalstatus.getStringCellValue();

			System.out.println(maritalvalue);

			if (maritalvalue.equalsIgnoreCase("Married")) {
				Married.click();                  
				Thread.sleep(2000);
				WebElement marriagedate = driver.findElement(By.xpath("//*[@id='marriageDate']"));  // enter marriage date 
				double marraigeValue = marraigedate.getNumericCellValue();
				java.util.Date date2 = DateUtil.getJavaDate(marraigeValue);
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				String formattedDate2 = sdf2.format(date2);
				marriagedate.sendKeys(formattedDate2);
					
			} else if (maritalvalue.equalsIgnoreCase("Single")) {
				Thread.sleep(2000);
				Single.click();
				Thread.sleep(2000);
			} else if (maritalvalue.equalsIgnoreCase("Divorced")) {
				Thread.sleep(2000);
				Divorced.click();
			} else if (maritalvalue.equalsIgnoreCase("widowed")) {
				Thread.sleep(2000);
				widowed.click();
			}
			

			Thread.sleep(3000);

			Comps.click();                      // enter company name 
			Thread.sleep(3000);
			WebElement compnyone = driver.findElement(By.xpath("//*[text()='DDAMOT PVT LTD']"));

			WebElement compnytwo = driver.findElement(By.xpath("//*[text()='HARDTEN PRECISION TECHNOLOGIES PRIVATE LIMITED']"));
			
			WebElement compnythree = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='SUPERHARD RESEARCH CENTRE PRIVATE LIMITED']"));
			Thread.sleep(2000);
			String company = companysubs.getStringCellValue();
			if (company.equalsIgnoreCase("D Damot Pvt Ltd")) {
				compnyone.click();
				Thread.sleep(2000);
			} else if (company.equalsIgnoreCase("Hardten Precision Technologies Pvt Ltd")) {
				compnytwo.click();
				Thread.sleep(2000);
			}else if (company.equalsIgnoreCase("Superhard Research Centre Pvt Ltd")) {
				compnythree.click();
			}
			
			Emtype.click();                // enter employee type 
			Thread.sleep(3000);
			WebElement admin = driver.findElement(By.xpath("//*[text()='Admin']"));
			WebElement Employee = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Employee']"));
			WebElement HR = driver.findElement(By.xpath("//*[text()='HR']"));
			WebElement Intern = driver.findElement(By.xpath("//*[text()='Intern']"));
			WebElement Trainee = driver.findElement(By.xpath("//*[text()='Trainee']"));
			WebElement Worker = driver.findElement(By.xpath("//*[text()='Worker']"));
			WebElement permanet = driver.findElement(By.xpath("//*[text()='Permanent']"));

			String employeetype = emtype.getStringCellValue();

			System.out.println(employeetype);

			if (employeetype.equalsIgnoreCase("admin")) {
				Thread.sleep(2000);
				admin.click();
			} else if (employeetype.equalsIgnoreCase("employee")) {
				Thread.sleep(2000);
				Employee.click();
			} else if (employeetype.equalsIgnoreCase("HR")) {
				Thread.sleep(2000);
				HR.click();
			} else if (employeetype.equalsIgnoreCase("Intern")) {
				Thread.sleep(2000);
				Intern.click();
			} else if (employeetype.equalsIgnoreCase("Trainee")) {
				Thread.sleep(2000);
				Trainee.click();
			} else if (employeetype.equalsIgnoreCase("Worker")) {
				Thread.sleep(2000);
				Worker.click();
			}else if (employeetype.equalsIgnoreCase("Permanent")) {
				Thread.sleep(2000);
				permanet.click();
			}

			Thread.sleep(3000);

			Department1.click();            // enter department 

			Thread.sleep(2000);
			
			WebElement p = driver.findElement(By.xpath("//*[text()='4P']"));
			
			WebElement admina = driver.findElement(By.xpath("//*[text()='Admin']"));
			
			WebElement adminstration = driver.findElement(By.xpath("//*[text()='ADMINISTRATION']"));
			
			WebElement assort = driver.findElement(By.xpath("//*[text()='Assort']"));
			
			WebElement assortment = driver.findElement(By.xpath("//*[text()='Assortment']"));
			
			WebElement aSSORTOR = driver.findElement(By.xpath("//*[text()='ASSORTOR']"));
			
			WebElement blocking = driver.findElement(By.xpath("//*[text()='Blocking']"));
			
			WebElement BlockingDepartment = driver.findElement(By.xpath("//*[text()='Blocking Department']"));
			
			WebElement BOIL = driver.findElement(By.xpath("//*[text()='BOIL']"));
			
			WebElement Boiling = driver.findElement(By.xpath("//*[text()='Boiling']"));
			
			WebElement Cleaving = driver.findElement(By.xpath("//*[text()='Cleaving']"));
			
			WebElement CleavingDepartment = driver.findElement(By.xpath("//*[text()='Cleaving Department']"));
			
			WebElement ECommerce = driver.findElement(By.xpath("//*[text()='E-Commerce']"));
			
			WebElement Fancydepartment = driver.findElement(By.xpath("//*[text()='Fancy department']"));
			
			WebElement FINANCE = driver.findElement(By.xpath("//*[text()='FINANCE']"));
			
			WebElement FINANCEACCOUNT = driver.findElement(By.xpath("//*[text()='FINANCE & ACCOUNT']"));
			
			WebElement HOUSEKEEPING = driver.findElement(By.xpath("//*[text()='HOUSEKEEPING']"));
			
			WebElement HRandAdmin = driver.findElement(By.xpath("//*[text()='HR and Admin']"));
			
			WebElement HumanResource = driver.findElement(By.xpath("//*[text()='Human Resource']"));
			
			WebElement Lab = driver.findElement(By.xpath("//*[text()='Lab']"));
			
			WebElement Laser = driver.findElement(By.xpath("//*[text()='Laser']"));
			
			WebElement LaserDepartment = driver.findElement(By.xpath("//*[text()='Laser Department']"));
			
			WebElement LEGAL = driver.findElement(By.xpath("//*[text()='LEGAL']"));
			
			WebElement Lot = driver.findElement(By.xpath("//*[text()='Lot']"));
			
			WebElement LotDepartment = driver.findElement(By.xpath("//*[text()='Lot Department']"));
			
			WebElement Maintenance = driver.findElement(By.xpath("//*[text()='Maintenance']"));
			
			WebElement MANAGEMENT = driver.findElement(By.xpath("//*[text()='MANAGEMENT']"));
			
			WebElement Operations = driver.findElement(By.xpath("//*[text()='Operations']"));
			
			WebElement Plant = driver.findElement(By.xpath("//*[text()='Plant']"));
			
			WebElement Polish = driver.findElement(By.xpath("//*[text()='Polish']"));
			
			WebElement PolishDepartment = driver.findElement(By.xpath("//*[text()='Polish Department']"));
			
			WebElement Production = driver.findElement(By.xpath("//*[text()='Production']"));
			
			WebElement PurchaseStore = driver.findElement(By.xpath("//*[text()='Purchase & Store']"));
			
			WebElement QualityControl = driver.findElement(By.xpath("//*[text()='Quality Control']"));
			
			WebElement RD = driver.findElement(By.xpath("//*[text()='R&D']"));
			
			WebElement RoundDepartment = driver.findElement(By.xpath("//*[text()='Round Department']"));
			
			WebElement SALESANDMARKETING = driver.findElement(By.xpath("//*[text()='SALES AND MARKETING']"));
			
			WebElement STOCK = driver.findElement(By.xpath("//*[text()='STOCK']"));
			
			

			String departmentvalue = depa.getStringCellValue();

			System.out.println(departmentvalue);

			if (departmentvalue.equalsIgnoreCase("4P")) {
				Thread.sleep(2000);
				p.click();
			} else if (departmentvalue.equalsIgnoreCase("Admin")) {
				Thread.sleep(2000);
				admina.click();
			}else if (departmentvalue.equalsIgnoreCase("ADMINISTRATION")) {
				Thread.sleep(2000);
				adminstration.click();
			}else if (departmentvalue.equalsIgnoreCase("Assort")) {
				Thread.sleep(2000);
				assort.click();
			}else if (departmentvalue.equalsIgnoreCase("Assortment")) {
				Thread.sleep(2000);
				assortment.click();     
			}else if (departmentvalue.equalsIgnoreCase("ASSORTOR")) {
				Thread.sleep(2000);
				aSSORTOR.click();     
			}else if (departmentvalue.equalsIgnoreCase("Blocking")) {
				Thread.sleep(2000);
				blocking.click();     
			}else if (departmentvalue.equalsIgnoreCase("Blocking Department")) {
				Thread.sleep(2000);
				BlockingDepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("BOIL")) {
				Thread.sleep(2000);
				BOIL.click();     
			}else if (departmentvalue.equalsIgnoreCase("Boiling")) {
				Thread.sleep(2000);
				Boiling.click();     
			}else if (departmentvalue.equalsIgnoreCase("Cleaving")) {
				Thread.sleep(2000);
				Cleaving.click();     
			}else if (departmentvalue.equalsIgnoreCase("Cleaving Department")) {
				Thread.sleep(2000);
				CleavingDepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("E-Commerce")) {
				Thread.sleep(2000);
				ECommerce.click();     
			}else if (departmentvalue.equalsIgnoreCase("Fancy department")) {
				Thread.sleep(2000);
				Fancydepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("FINANCE")) {
				Thread.sleep(2000);
				FINANCE.click();     
			}else if (departmentvalue.equalsIgnoreCase("FINANCE & ACCOUNT")) {
				Thread.sleep(2000);
				FINANCEACCOUNT.click();     
			}else if (departmentvalue.equalsIgnoreCase("HOUSEKEEPING")) {
				Thread.sleep(2000);
				HOUSEKEEPING.click();     
			}else if (departmentvalue.equalsIgnoreCase("HR and Admin")) {
				Thread.sleep(2000);
				HRandAdmin.click();     
			}else if (departmentvalue.equalsIgnoreCase("Human Resource")) {
				Thread.sleep(2000);
				HumanResource.click();     
			}else if (departmentvalue.equalsIgnoreCase("Lab")) {
				Thread.sleep(2000);
				Lab.click();     
			}else if (departmentvalue.equalsIgnoreCase("Laser")) {
				Thread.sleep(2000);
				Laser.click();     
			}else if (departmentvalue.equalsIgnoreCase("Laser Department")) {
				Thread.sleep(2000);
				LaserDepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("LEGAL")) {
				Thread.sleep(2000);
				LEGAL.click();     
			}else if (departmentvalue.equalsIgnoreCase("Lot")) {
				Thread.sleep(2000);
				Lot.click();     
			}else if (departmentvalue.equalsIgnoreCase("Lot Department")) {
				Thread.sleep(2000);
				LotDepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("Maintenance")) {
				Thread.sleep(2000);
				Maintenance.click();     
			}else if (departmentvalue.equalsIgnoreCase("MANAGEMENT")) {
				Thread.sleep(2000);
				MANAGEMENT.click();     
			}else if (departmentvalue.equalsIgnoreCase("Operations")) {
				Thread.sleep(2000);
				Operations.click();     
			}else if (departmentvalue.equalsIgnoreCase("Plant")) {
				Thread.sleep(2000);
				Plant.click();     
			}else if (departmentvalue.equalsIgnoreCase("Polish")) {
				Thread.sleep(2000);
				Polish.click();     
			}else if (departmentvalue.equalsIgnoreCase("Polish Department")) {
				Thread.sleep(2000);
				PolishDepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("Production")) {
				Thread.sleep(2000);
				Production.click();     
			}else if (departmentvalue.equalsIgnoreCase("Purchase & Store")) {
				Thread.sleep(2000);
				PurchaseStore.click();     
			}else if (departmentvalue.equalsIgnoreCase("Quality Control")) {
				Thread.sleep(2000);
				QualityControl.click();     
			}else if (departmentvalue.equalsIgnoreCase("R&D")) {
				Thread.sleep(2000);
				RD.click();     
			}else if (departmentvalue.equalsIgnoreCase("Round Department")) {
				Thread.sleep(2000);
				RoundDepartment.click();     
			}else if (departmentvalue.equalsIgnoreCase("SALES AND MARKETING")) {
				Thread.sleep(2000);
				SALESANDMARKETING.click();     
			}else if (departmentvalue.equalsIgnoreCase("STOCK")) {
				Thread.sleep(2000);
				STOCK.click();     
			}
			
			Thread.sleep(2000);
			
			Role.click();                              // enter role 
			Thread.sleep(2000);
			WebElement er = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Employee']"));


			String rolevalue = role.getStringCellValue();

			System.out.println(rolevalue);

			if (rolevalue.equalsIgnoreCase("Employee")) {
				Thread.sleep(2000);
				er.click();
			}
			Thread.sleep(2000);

			Designationbtn.click();                      

	    WebElement pop = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='4-P Operator']"));
	    WebElement AccExec =driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Account Executive']"));
	    WebElement Accountant = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Accountant']"));
		WebElement AdmOfcr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Admin Officer']"));
		WebElement AppEng = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='APPLICATION ENGINEER']"));
		WebElement AssMngr =driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistanat Manager - C&B -HO']"));
		WebElement Asstnt = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistant']"));
		WebElement Astmg = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistant Manager']"));
		WebElement AstMngAdm = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistant Manager Admin']"));
		WebElement AstProdMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistant Production Manager']"));
		WebElement AstTech = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistant Technician']"));
		WebElement AstTechTrainee = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assistant Technician Trainee']"));
		WebElement Assorter = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Assorter']"));
		WebElement BlckMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Blocking Manager']"));
		WebElement BlckWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Blocking Worker']"));
		WebElement BoilWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Boil Worker']"));
		WebElement Boiler = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Boiler']"));
		WebElement Checker = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Checker']"));
		WebElement Chef = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Chef']"));
		WebElement ClevMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Cleaving Manager']"));
		WebElement ClevWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Cleaving Worker']"));
		WebElement CMO = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='CMO']"));
		WebElement CmpSec = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Company Secretary']"));
		WebElement DtaEtryOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Data Entry Operator']"));
		WebElement DptyMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Deputy Manager - Lab']"));
		WebElement DsgnEng = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Design Engineer']"));
		WebElement DiamdPolshWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Diamond Polishing Worker']"));
		WebElement DiplmaEngTrain = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Diploma Engineer Trainee']"));
		WebElement Driver = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Driver']"));
		WebElement EcomExec = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Ecommerce Executive']"));
		WebElement Engineer = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Engineer']"));
		WebElement EngiTech = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Engineering Technologist']"));
		WebElement ExecAcc = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Executive Account']"));
		WebElement ExecAssnt = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Executive Assistant']"));
		WebElement ExecStore = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Executive Store']"));
		WebElement FacTech = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Facility Technologist']"));
		WebElement GradEngiTrain = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Graduate Engineer Trainee']"));
		WebElement HeadSalesMarkt = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Head, Sales & Marketing']"));
		WebElement Helper = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Helper']"));
		WebElement JnrEngi = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Jr. Engineer']"));
		WebElement JnrEngiMaint = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Jr. Engineer - Maintenance']"));
		WebElement JnrLabMaint = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Jr. Lab Maintenance']"));
		WebElement JuniorEngi = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Junior Engineer']"));
		WebElement LabAsst = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='LAB ASSISTANT']"));
		WebElement LabTech = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Lab Technician']"));
		WebElement LasMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Laser Manager']"));
		WebElement LaserOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Laser Operator']"));
		WebElement LotChkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Lot Checker']"));
		WebElement LotingMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Lotting Manager']"));
		WebElement MachOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Machine Operator']"));
		WebElement Manager = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Manager']"));
		WebElement MngrHr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Manager - HR']"));
		WebElement MngrMaint = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Manager Maintenance']"));
		WebElement MangDirctr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Managing Director']"));
		WebElement Marker = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Marker']"));
		WebElement MaterScint = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='MATERIAL SCIENTIST']"));
		WebElement MicroOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Microscope Operator']"));
		WebElement OpManager = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Operation Manager']"));
		WebElement Peon = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Peon']"));
		WebElement PrincipScients = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Principal Scientist']"));
		WebElement ProcessEngi = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='PROCESS ENGINEER']"));
		WebElement PrdtDesgnEngi = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Product Design Engineer']"));
		WebElement PrdtDevlopEngi = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Product Development Engineer']"));
		WebElement ProdctionWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Production Worker']"));
		WebElement PurchseExec = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Purchase Executive']"));
		WebElement ResrchSci = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Resarch Scientist']"));
		WebElement RoundWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Round Worker']"));
		WebElement RussianBrutWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Russian Bruter Worker']"));
		WebElement SalesMarketing = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sales & Marketing']"));
		WebElement SalesCoord = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sales Coordinator']"));
		WebElement SalesExec = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sales Executive']"));
		WebElement SalesOffcr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sales Officer']"));
		WebElement SarinOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sarin Operator']"));
		WebElement SecurityGuard = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Security Guard']"));
		WebElement SiteSupervisr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Site Supervisor']"));
		WebElement SnrEngi = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sr. Engineer']"));
		WebElement SnrEngiQua = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sr. Engineer - Quality']"));
		WebElement SnrEngiMaintLab = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sr. Engineer Maintenance Lab']"));
		WebElement SnrExecBank = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sr. Executive Banking']"));
		WebElement SnrExecHr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sr. Executive HR']"));
		WebElement SnrMngr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sr. Manager']"));
		WebElement Sticking = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sticking']"));
		WebElement StickOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Sticking Operator']"));
		WebElement StickWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Stitching worker']"));
		WebElement StockManager = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Stock Manager']"));
		WebElement TaliyaWrkr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Taliya Worker']"));
		WebElement Technician = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Technician']"));
		WebElement Traineee = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Trainee']"));
		WebElement WeightOptr = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='Weight Operator']"));
		
				
		String Designationrolevalue = designation.getStringCellValue();
		 System.out.println(Designationrolevalue);
		if (Designationrolevalue.equalsIgnoreCase("4-P Operator")) {
		 Thread.sleep(2000);
		 pop.click();
		 } else if (Designationrolevalue.equalsIgnoreCase("Account Executive")) {
		 Thread.sleep(2000);
		 AccExec.click();
		 } else if (Designationrolevalue.equalsIgnoreCase("Accountant")) {
		 Thread.sleep(2000);
		 Accountant.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Admin Officer")) {
		 Thread.sleep(2000);
		 AdmOfcr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("APPLICATION ENGINEER")) {
		 Thread.sleep(2000);
		 AppEng.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistanat Manager - C&B -HO")) {
		 Thread.sleep(2000);
		 AssMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistant")) {
		 Thread.sleep(2000);
		 Asstnt.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistant Manager")) {
		 Thread.sleep(2000);
		 Astmg.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistant Manager Admin")) {
		 Thread.sleep(2000);
		 AstMngAdm.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistant Production Manager")) {
		 Thread.sleep(2000);
		 AstProdMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistant Technician")) {
		 Thread.sleep(2000);
		 AstTech.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assistant Technician Trainee")) {
		 Thread.sleep(2000);
		 AstTechTrainee.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Assorter")) {
		 Thread.sleep(2000);
		 Assorter.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Blocking Manager")) {
		 Thread.sleep(2000);
		 BlckMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Blocking Worker")) {
		 Thread.sleep(2000);
		 BlckWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Boil Worker")) {
		 Thread.sleep(2000);
		 BoilWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Boiler")) {
		 Thread.sleep(2000);
		 Boiler.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Checker")) {
		 Thread.sleep(2000);
		 Checker.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Chef")) {
		 Thread.sleep(2000);
		 Chef.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Cleaving Manager")) {
		 Thread.sleep(2000);
		 ClevMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Cleaving Worker")) {
		 Thread.sleep(2000);
		 ClevWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("CMO")) {
		 Thread.sleep(2000);
		 CMO.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Company Secretary")) {
		 Thread.sleep(2000);
		 CmpSec.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Data Entry Operator")) {
		 Thread.sleep(2000);
		 DtaEtryOptr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Deputy Manager - Lab")) {
		 Thread.sleep(2000);
		 DptyMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Design Engineer")) {
		 Thread.sleep(2000);
		 DsgnEng.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Diamond Polishing Worker")) {
		 Thread.sleep(2000);
		 DiamdPolshWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Diploma Engineer Trainee")) {
		 Thread.sleep(2000);
		 DiplmaEngTrain.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Driver")) {
		 Thread.sleep(2000);
		 Driver.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Ecommerce Executive")) {
		 Thread.sleep(2000);
		 EcomExec.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Engineer")) {
		 Thread.sleep(2000);
		 Engineer.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Engineering Technologist")) {
		 Thread.sleep(2000);
		 EngiTech.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Executive Account")) {
		 Thread.sleep(2000);
		 ExecAcc.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Executive Assistant")) {
		 Thread.sleep(2000);
		 ExecAssnt.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Executive Store")) {
		 Thread.sleep(2000);
		 ExecStore.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Facility Technologist")) {
		 Thread.sleep(2000);
		 FacTech.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Graduate Engineer Trainee")) {
		 Thread.sleep(2000);
		 GradEngiTrain.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Head, Sales & Marketing")) {
		 Thread.sleep(2000);
		 HeadSalesMarkt.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Helper")) {
		 Thread.sleep(2000);
		 Helper.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Jr. Engineer")) {
		 Thread.sleep(2000);
		 JnrEngi.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Jr. Engineer - Maintenance")) {
		 Thread.sleep(2000);
		 JnrEngiMaint.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Jr. Lab Maintenance")) {
		 Thread.sleep(2000);
		 JnrLabMaint.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Junior Engineer")) {
		 Thread.sleep(2000);
		 JuniorEngi.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("LAB ASSISTANT")) {
		 Thread.sleep(2000);
		 LabAsst.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Lab Technician")) {
		 Thread.sleep(2000);
		 LabTech.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Laser Manager")) {
		 Thread.sleep(2000);
		 LasMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Laser Operator")) {
		 Thread.sleep(2000);
		 LaserOptr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Lot Checker")) {
		 Thread.sleep(2000);
		 LotChkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Lotting Manager")) {
		 Thread.sleep(2000);
		 LotingMngr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Machine Operator")) {
		 Thread.sleep(2000);
		 MachOptr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Manager")) {
		 Thread.sleep(2000);
		 Manager.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Manager - HR")) {
		 Thread.sleep(2000);
		 MngrHr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Manager Maintenance")) {
		 Thread.sleep(2000);
		 MngrMaint.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Managing Director")) {
		 Thread.sleep(2000);
		 MangDirctr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Marker")) {
		 Thread.sleep(2000);
		 Marker.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("MATERIAL SCIENTIST")) {
		 Thread.sleep(2000);
		 MaterScint.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Microscope Operator")) {
		 Thread.sleep(2000);
		 MicroOptr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Operation Manager")) {
		 Thread.sleep(2000);
		 OpManager.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Peon")) {
		 Thread.sleep(2000);
		 Peon.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Principal Scientist")) {
		 Thread.sleep(2000);
		 PrincipScients.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("PROCESS ENGINEER")) {
		 Thread.sleep(2000);
		 ProcessEngi.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Product Design Engineer")) {
		 Thread.sleep(2000);
		 PrdtDesgnEngi.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Product Development Engineer")) {
		 Thread.sleep(2000);
		 PrdtDevlopEngi.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Production Worker")) {
		 Thread.sleep(2000);
		 ProdctionWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Purchase Executive")) {
		 Thread.sleep(2000);
		 PurchseExec.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Resarch Scientist")) {
		 Thread.sleep(2000);
		 ResrchSci.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Round Worker")) {
		 Thread.sleep(2000);
		 RoundWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Russian Bruter Worker")) {
		 Thread.sleep(2000);
		 RussianBrutWrkr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Sales & Marketing")) {
		 Thread.sleep(2000);
		 SalesMarketing.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Sales Coordinator")) {
		 Thread.sleep(2000);
		 SalesCoord.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Sales Executive")) {
		 Thread.sleep(2000);
		 SalesExec.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Sales Officer")) {
		 Thread.sleep(2000);
		 SalesOffcr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Sarin Operator")) {
		 Thread.sleep(2000);
		 SarinOptr.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Security Guard")) {
		 Thread.sleep(2000);
		 SecurityGuard.click();
		 }
		else if (Designationrolevalue.equalsIgnoreCase("Site Supervisor")) {
		 Thread.sleep(2000);
		 SiteSupervisr.click();
		 }else if (Designationrolevalue.equalsIgnoreCase("Sr. Engineer")) {
			Thread.sleep(2000);
			SnrEngi.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sr. Engineer - Quality")) {
			Thread.sleep(2000);
			SnrEngiQua.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sr. Engineer Maintenance Lab")) {
			Thread.sleep(2000);
			SnrEngiMaintLab.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sr. Executive Banking")) {
			Thread.sleep(2000);
			SnrExecBank.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sr. Executive HR")) {
			Thread.sleep(2000);
			SnrExecHr.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sr. Manager")) {
			Thread.sleep(2000);
			SnrMngr.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sticking")) {
			Thread.sleep(2000);
			Sticking.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Sticking Operator")) {
			Thread.sleep(2000);
			StickOptr.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Stitching worker")) {
			Thread.sleep(2000);
			StickWrkr.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Stock Manager")) {
			Thread.sleep(2000);
			StockManager.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Taliya Worker")) {
			Thread.sleep(2000);
			TaliyaWrkr.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Technician")) {
			Thread.sleep(2000);
			Technician.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Trainee")) {
			Thread.sleep(2000);
			Traineee.click();
		}else if (Designationrolevalue.equalsIgnoreCase("Weight Operator")) {
			Thread.sleep(2000);
			WeightOptr.click();
		}
			
			
			
//			WebElement AT = driver.findElement(By.xpath("//*[text()='Automation_Tester']"));
//			WebElement TL = driver.findElement(By.xpath("//*[text()='Team Lead']"));
//
//			String Designationrolevalue = designation.getStringCellValue();
//
//			System.out.println(Designationrolevalue);
//
//			if (Designationrolevalue.equalsIgnoreCase("Automation_Tester")) {
//				Thread.sleep(2000);
//				AT.click();
//			} else if (Designationrolevalue.equalsIgnoreCase("Team Lead")) {
//				Thread.sleep(2000);
//				TL.click();
//			}

			//repotingmanager.click();             // enter report manager 

			//WebElement vijaybhai = driver.findElement(By.xpath("//*[text()='Vijaybhai']"));
			//WebElement Hemansu = driver.findElement(By.xpath("//*[text()='Hemansu']"));
			

			//String repotinmanagervalue = reportingmaneger.getStringCellValue();

			//System.out.println(repotinmanagervalue);

			//if (repotinmanagervalue.equalsIgnoreCase("Vijaybhai")) {
			//	Thread.sleep(2000);
			//	vijaybhai.click();
			//} else if (repotinmanagervalue.equalsIgnoreCase("Hemansu")) {
			//	Thread.sleep(2000);
			//	Hemansu.click();
			//}

			Thread.sleep(2000);
			zonebtn.click();                                 // enter zone 
			
			WebElement zonee = driver.findElement(By.xpath("//*[text()='West']"));
			
			String zonevalue = zone.getStringCellValue();
			System.out.println(zonevalue);
			if (zonevalue.equalsIgnoreCase("West")) {
				Thread.sleep(2000);
				zonee.click();
			}
			// else if (zonevalue.equalsIgnoreCase("Team Lead"))
			// {
			// Thread.sleep(2000);
			// TL.click();
			// }

			Thread.sleep(2000);

			regionbtn.click(); 								// enter Region 

			WebElement WestRegion = driver.findElement(By.xpath("//*[text()='West India']"));
			// WebElement eastzone = driver.findElement(By.xpath("//*[text()='Team
			// Lead']"));

			String regionvalue = region.getStringCellValue();

			System.out.println(regionvalue);

			if (regionvalue.equalsIgnoreCase("West India")) {
				Thread.sleep(2000);
				WestRegion.click();
			}

			Thread.sleep(2000);
			
			statebtn.click();								// enter state 
			
			
			WebElement Gujarat = driver.findElement(By.xpath("//*[text()='Gujarat']"));
			// WebElement eastzone = driver.findElement(By.xpath("//*[text()='Team
			// Lead']"));

			String statevalue = state.getStringCellValue();

			System.out.println(statevalue);

			if (statevalue.equalsIgnoreCase("Gujarat")) {
				Thread.sleep(2000);
				Gujarat.click();
			}

			
			
			citybtn.click();						        // enter City
			
			
			WebElement Surat = driver.findElement(By.xpath("//*[text()='Surat']"));
			// WebElement eastzone = driver.findElement(By.xpath("//*[text()='Team
			// Lead']"));

			String cityvalue = city.getStringCellValue();

			System.out.println(cityvalue);

			if (cityvalue.equalsIgnoreCase("Surat")) {
				Thread.sleep(1000);
				Surat.click();
			}

			Thread.sleep(1000);
			
			branchbtn.click();									// enter Branch 
			
			WebElement branchname = driver.findElement(By.xpath("//*[@role='option']"));
			// WebElement eastzone = driver.findElement(By.xpath("//*[text()='Team
			// Lead']"));

			String branchvalue = branch.getStringCellValue();

			System.out.println(branchvalue);

			if (branchvalue.equalsIgnoreCase("Surat")) {
				Thread.sleep(1000);
				branchname.click();
			}

			addressbtn.sendKeys(address.getStringCellValue());      // enter address 
			
			emailbtn.sendKeys(email.getStringCellValue());           // enter email 
			
			passwordbtn.sendKeys(password.getStringCellValue());     // enter password
			
			confirmpassword.sendKeys(cpassword.getStringCellValue());   // enter confirm password 
			

			driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();  // click save 
			Thread.sleep(1000);
		}
	}
}
