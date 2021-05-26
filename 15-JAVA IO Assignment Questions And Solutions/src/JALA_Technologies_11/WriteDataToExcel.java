/*
 11. Write a program to write data to excel.
 ----------------------------------------------
 */

package JALA_Technologies_11;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");

		// creating a row object
		XSSFRow row;

		Map<String, Object[]> studentData = new TreeMap<String, Object[]>();

		studentData.put("01", new Object[] { "Roll No", "NAME", "Year" });

		studentData.put("02", new Object[] { "15015111184", "Shamshad", "Final year" });

		studentData.put("03", new Object[] { "15015111185", "Trisha", "3nd year" });

		studentData.put("04", new Object[] { "15015111186", "Rahul", "2nd year" });

		studentData.put("05", new Object[] { "15015111187", "Radha", "2nd year" });

		studentData.put("06", new Object[] { "15015111188", "Gopal", "2nd year" });

		Set<String> keyid = studentData.keySet();

		int rowid = 0;

		for (String key : keyid) {

			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = studentData.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		FileOutputStream out = new FileOutputStream(new File("E:/savedexcel/Excelsheet.xlsx"));

		workbook.write(out);
		out.close();
	}
}