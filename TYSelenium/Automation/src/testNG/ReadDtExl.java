package testNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class ReadDtExl {
	@DataProvider
	public String[][] CreateUser() throws Exception{
		String [][] s;
		//String path="C:\\Users\\Tousif\\Desktop\\Selenium\\Demo11.xlsx";
		Workbook excel =WorkbookFactory.create(new FileInputStream("C:\\Users\\Tousif\\Desktop\\Selenium\\Demo11.xlsx"));
		Sheet sheet =excel.getSheet("Sheet1");
		s =new String[sheet.getPhysicalNumberOfRows() -1][sheet.getRow(0).getLastCellNum()];
		for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
			for(int j=1;j<sheet.getRow(i).getFirstCellNum();j++) {
				Cell value=sheet.getRow(i).getCell(j);
				s[i=1][j]=value.toString();
				Reporter.log(s[i-1][j]);

			}
		}
		return s;
	}
}



