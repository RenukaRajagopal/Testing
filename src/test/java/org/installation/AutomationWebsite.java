package org.installation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationWebsite {
	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
		File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
		FileInputStream stream= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Testcase");
	
	    Row row = sheet.getRow(1);
	    Cell cell = row.getCell(0);
	    String Value = cell.getStringCellValue();
	    if(Value.equals("Siddharth")) {
		cell.setCellValue("GowriSiddhu");
	    }
	    FileOutputStream out=new FileOutputStream(file);
	    book.write(out);
	    String Value2 = cell.getStringCellValue();
	    System.out.println(Value2);
	}
		
		
		
	}


