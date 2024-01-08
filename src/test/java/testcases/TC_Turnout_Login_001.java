package testcases;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Turnout_Login_001 extends Baseclass{
	@Test(priority = 1)
	public void LOGIN() throws InterruptedException, IOException 
	{
		//driver.findElement(By.xpath(prop.getProperty("login_btn"))).click();
		//Reporter.log("click login button ");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath(prop.getProperty("username_field")));
		username.sendKeys(prop.getProperty("username"));
		Reporter.log("enter username");
		WebElement password=driver.findElement(By.xpath(prop.getProperty("pwd_field")));
		password.sendKeys(prop.getProperty("password"));
		Reporter.log("enter password ");
		driver.findElement(By.xpath(prop.getProperty("signin_btn"))).click();
		Reporter.log("click signin button");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//*[text()='Company']")).click();
		
		Thread.sleep(3000);

		WebElement departmentButton = driver.findElement(By.xpath("//*[@href='/employees']"));
		//WebElement departmentButton = driver.findElement(By.xpath("//*[@href='/departments']"));
		//WebElement departmentButton = driver.findElement(By.xpath("//*[@href='/designations']"));
		
		
		
		Thread.sleep(3000);
		departmentButton.click();	
		
		Thread.sleep(3000);
		
	}

}
