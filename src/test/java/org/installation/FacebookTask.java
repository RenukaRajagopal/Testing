package org.installation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FacebookTask {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
		FileInputStream stream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Testcase");
		Row row = sheet.getRow(2);
		for (int i = 0; i <row.getPhysicalNumberOfCells() ; i++) {
			Cell cell = row.getCell(i);
			System.out.println(cell);
			
		}
	}
}
