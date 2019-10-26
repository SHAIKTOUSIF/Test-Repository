package testNG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadXmlData {
	@Test
	public static void createUser() throws Exception {
		int count = -1;
		FileInputStream ff = new FileInputStream("C:\\\\Users\\\\Tousif\\\\Desktop\\\\Selenium\\\\Read.xlsx");
		Workbook wb = WorkbookFactory.create(ff);
		int coll = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(coll);
		Row row = wb.getSheet("Sheet1").getRow(0);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);
			if (cell.toString().equalsIgnoreCase("Password")) {
				count = i;
				System.out.println(count);
			}
		}
		System.out.println(count);
		int j = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(j);
		int c = 1;
		for (int i = 0; i < coll; i++) {
			if (wb.getSheet("Sheet1").getRow(0).getCell(i).toString().equalsIgnoreCase("password"))
				;
			while (c <= j) {
				System.out.println(wb.getSheet("Sheet1").getRow(c).getCell(count));
				c++;
			}
		}
	}
}
