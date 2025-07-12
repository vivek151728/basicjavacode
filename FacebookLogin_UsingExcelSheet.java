package Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin_UsingExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream f = new FileInputStream("F:\\Eclipse29052025Workplace\\Selenium\\ExcelSheet\\Vivek.xlsx");
		
		Workbook wb =WorkbookFactory.create(f);
		
	String username =	wb.getSheet("FacebookData").getRow(1).getCell(0).getStringCellValue();
	System.out.println(username);
	
	String Password = wb.getSheet("FacebookData").getRow(1).getCell(1).getStringCellValue();
	
	 System.out.println(Password);
	
	 
	 
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("pass")).sendKeys(Password);
	 driver.findElement(By.name("login")).click();
		
		
		
		
	}}