package org.installation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
		FileInputStream stream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Testcase");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		if(cell.equals("GowriSiddhu")) {
			cell.setCellValue("Renuka");
		}
		FileOutputStream out= new FileOutputStream(file);
		book.write(out);
		System.out.println(cell);
		
		}
		
			
		}
	
