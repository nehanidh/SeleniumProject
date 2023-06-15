package selenium_Example;

import java.io.FileInputStream; //READ

import java.io.FileOutputStream;//WRITE
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel_Sheet 
{
public static void main(String args[])throws Exception
{
	FileInputStream fileInput = new FileInputStream("C:\\Users\\Asus\\Downloads\\Excel read\\Book2.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating cell data "+sheet.getRow(2).getCell(1));
	
	//WRITE THE DATA TO EXCEL FILE
	XSSFCell cell = sheet.getRow(2).getCell(1);
	cell.setCellValue("mahesh");
	fileInput.close();
	FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Asus\\Downloads\\Excel read\\Book2.xlsx");
	workbook.write(fileOut);
	System.out.println("Updating data after write is done"+cell.getStringCellValue());
	fileOut.close();
	
}
}
