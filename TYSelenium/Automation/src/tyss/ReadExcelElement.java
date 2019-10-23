package tyss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;

import com.microsoft.schemas.office.x2006.encryption.impl.EncryptionDocumentImpl;

public class ReadExcelElement {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Tousif\\Desktop\\Selenium\\demo.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");
		Row firstRow = sh.getRow(0);
		int rowcount = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < firstRow.getLastCellNum(); j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl + "   ");
			}
			System.out.println();
		}
		System.out.println("_________________");
		sh.getRow(0).getLastCellNum();
		System.out.println(sh.getRow(1).getCell(0).toString());
		System.out.println(System.getProperty("user.dir"));

	}
}
