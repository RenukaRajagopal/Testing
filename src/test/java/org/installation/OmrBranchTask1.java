package org.installation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OmrBranchTask1 {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
		//Get the data from excel
		FileInputStream stream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(stream);       //Workbook-sheet-row-cell
		Sheet sheet = book.getSheet("Testcase");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) { 
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					String value = cell.getStringCellValue();
					System.out.println(value+"\t");
					break;
				case NUMERIC:
					
					if(DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yyyy");
						String format = dateformat.format(date);
						System.out.print(format+"\t");
		
					}else {
					
					double value2 = cell.getNumericCellValue();
					 BigDecimal decimal = BigDecimal.valueOf(value2);
					String string = decimal.toString();
					System.out.println(string+"\t");

					

					}
					break;
				default:
					break;
				}
			}
			System.out.println();
		}
		
	} 
}
