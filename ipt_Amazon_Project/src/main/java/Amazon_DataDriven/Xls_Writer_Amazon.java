package Amazon_DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Writer_Amazon {

	public static void particulardata() throws Throwable {
		File f = new File("C:\\Users\\shakt\\OneDrive\\Desktop\\project class\\pro.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		w.createSheet("sheet").createRow(0).createCell(0).setCellValue("username");
//		Sheet s = w.createSheet("sheet");
//		Row r = s.createRow(0);
//		Cell c = r.createCell(0);
//		c.setCellValue("username");
		w.getSheet("sheet").getRow(0).createCell(1).setCellValue("password");

		w.getSheet("sheet").createRow(1).createCell(0).setCellValue("nandha");
		w.getSheet("sheet").getRow(1).createCell(1).setCellValue("nan@123");
		
		w.getSheet("sheet").createRow(2).createCell(0).setCellValue("Shakthi");
		w.getSheet("sheet").getRow(2).createCell(1).setCellValue("sha@456");
		
		w.getSheet("sheet").createRow(3).createCell(0).setCellValue("mahaa");
		w.getSheet("sheet").getRow(3).createCell(1).setCellValue("maha@678");
		
		//w.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);

		w.write(fo);

		w.close();

		System.out.println("closed");

	}

	public static void main(String[] args) throws Throwable {
		particulardata();
	}
}
