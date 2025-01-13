package HybrdenFrameWork;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;


public class Lib implements IAutoConstant{
	
	public static Workbook wb;
	
	public static String getProperty(String CONFIG_PATH, String key) {
		String property="";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			property=prop.getProperty(key);
		}
		catch(Exception e) {
			
		}
		return property;
	}
	
	public static String getCellsValue(String EXCEL_PATH, String sheet, int row, int colmun) {
		String value ="";
		try {
			wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			value=wb.getSheet(sheet).getRow(row).getCell(colmun).toString();
		}
		catch(Exception e) {
			
		}
		return value;
	}
}
