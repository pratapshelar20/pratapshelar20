package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("C:/Users/REALDOTCOMP PVT.LTD/Desktop/Sheet1.xlsx");
		  String a = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(a);
	}

}
