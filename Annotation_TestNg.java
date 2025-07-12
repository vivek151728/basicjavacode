package Basics;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotation_TestNg {
	@Test(priority=1)
	
	public void Testing() throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream("F:\\Eclipse29052025Workplace\\Selenium\\ExcelSheet\\Vivek.xlsx");
		
		Workbook wb=WorkbookFactory.create(f);
	String Username=	wb.getSheet("FacebookData").getRow(1).getCell(0).getStringCellValue();
	String Password=wb.getSheet("FacebookData").getRow(1).getCell(1).getStringCellValue();
	
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		driver.close();		
	}
	
	@Test(priority = -1)
	
	public void Login() {
		
		
	}
	
	@Test(priority=2)
	
	public void Logout() {
		
		
	}

}
