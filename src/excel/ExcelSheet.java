package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

//	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
//		//Open the Excel sheet
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
				FileInputStream excel = new FileInputStream("C:/Users/REALDOTCOMP PVT.LTD/Desktop/rest.xlsx");
				
		       Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
				
				String b=a.getRow(0).getCell(0).getStringCellValue();
				String c=a.getRow(1).getCell(0).getStringCellValue();
				String d=a.getRow(2).getCell(0).getStringCellValue();
				
				Thread.sleep(2000);
				
				
				
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				

	}

}
