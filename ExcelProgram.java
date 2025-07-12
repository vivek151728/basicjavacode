package Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelProgram {

	public static void main(String[] args) throws IOException , EncryptedDocumentException{
		
		FileInputStream f1 = new FileInputStream("F:\\Eclipse29052025Workplace\\Selenium\\ExcelSheet\\Vivek.xlsx");
		
		Workbook wb = WorkbookFactory.create(f1);
	String Username =	wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	
	System.out.println(Username);

	}

}
