package GetExcelDataTest;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserDetails {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream(".//ExcelData//Exceldata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("sheet1");
		System.err.println("facebook details :");
		System.out.println("username -- " + sheet.getRow(0).getCell(0).toString());
		System.out.println("password -- " + sheet.getRow(0).getCell(1).toString());
		System.out.println("url site -- " + sheet.getRow(0).getCell(2).toString());
		System.err.println("instagram details :");
		System.out.println("username -- " + sheet.getRow(1).getCell(0).toString());
		System.out.println("password -- " + sheet.getRow(1).getCell(1).toString());
		System.out.println("url site -- " + sheet.getRow(1).getCell(2).toString());
		System.err.println("twitter details :");
		System.out.println("username -- " + sheet.getRow(2).getCell(0).toString());
		System.out.println("password -- " + sheet.getRow(2).getCell(1).toString());
		System.out.println("url site -- " + sheet.getRow(2).getCell(2).toString());
	}
}
