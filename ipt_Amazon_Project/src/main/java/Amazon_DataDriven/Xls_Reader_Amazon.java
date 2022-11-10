package Amazon_DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader_Amazon {
	static String value;

	public static String particulardata(String sheet, int row, int cell) throws Exception {

		File f = new File("C:\\Users\\shakt\\eclipse-workspace\\ipt_Amazon_Project\\datadriven\\amazon.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi); // upcasting
		Sheet s = w.getSheet(sheet); // getsheetat(1) for index method
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType ce = c.getCellType();
		if (ce.equals(CellType.STRING)) {
			// String se = c.getStringCellValue();
			// System.out.print(se);
			value = c.getStringCellValue();

		} else if (ce.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int n = (int) d;
			value = Integer.toString(n);

			System.out.print(n);
		}

		System.out.println("***************");
		return value;
	}

	public static String alldata() throws Exception {

		File f = new File("C:\\Users\\shakt\\eclipse-workspace\\ipt_Amazon_Project\\datadriven\\amazon.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("amazon");
		int rowsize = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row r = s.getRow(i);
			int cellsize = r.getPhysicalNumberOfCells();

			for (int j = 0; j < cellsize; j++) {
				Cell c = r.getCell(j);
				CellType ce = c.getCellType();

				if (ce.equals(CellType.STRING)) {
					// value = c.getStringCellValue();
					String v = c.getStringCellValue();

					System.out.print(v);

				} else if (ce.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int n = (int) d;
					// value = c.getStringCellValue();
					System.out.print(n);

				}

				System.out.print("  |  ");
			}
			System.out.println();
		}
		return value;

	}

	public static void main(String[] args) throws Exception {
		particulardata("amazon", 1, 0);
		alldata();
	}

}
