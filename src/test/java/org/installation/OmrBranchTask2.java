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

public class OmrBranchTask2 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Testcase");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String value = cell.getStringCellValue();
					System.out.print(value + "\t");
					break;

				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
						String format = dateformat.format(date);
						System.out.print(format + "\t");

					} else {

						double number = cell.getNumericCellValue();
						BigDecimal decimal = BigDecimal.valueOf(number);
						String string = decimal.toString();
						System.out.print(string + "\t");

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
