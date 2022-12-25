package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File 
{
	public static String uname,pwd,search1,search2,search3,search4;
	public void ExcelSheet() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\rishi\\eclipse-workspace\\AmazonAutomationProject\\src\\test\\resources\\AmazonCredentials.XLSX");  
	Workbook w1= WorkbookFactory.create(file);
	
	Sheet s1=w1.getSheet("Credentials");
	Row r1=s1.getRow(0);
	Cell c1=r1.getCell(1);
	uname= c1.getStringCellValue();
	Row r2=s1.getRow(1);
	Cell c2=r2.getCell(1);
	pwd=c2.getStringCellValue();
	
	Sheet s2=w1.getSheet("Search_op");
	Row r3=s2.getRow(0);
	Cell c3=r3.getCell(0);
	search1=c3.getStringCellValue();
	
	Row r4=s2.getRow(1);
	Cell c4=r4.getCell(0);
	search2=c4.getStringCellValue();
	
	Row r5=s2.getRow(2);
	Cell c5=r5.getCell(0);
	search3=c5.getStringCellValue();
	
	Row r6=s2.getRow(3);
	Cell c6=r6.getCell(0);
	search4=c6.getStringCellValue();
		
	}
}
