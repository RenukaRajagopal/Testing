package org.installation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
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

public class CreateExcel {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
	File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\CreateExcel.xlsx");
	
	Workbook book= new XSSFWorkbook();
	Sheet sheet = book.createSheet("siddhu");
	
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement element = driver.findElement(By.id("Skills"));
	Select select =new Select(element);
	List<WebElement> options = select.getOptions();
	for (int i = 0;i <options.size(); i++) {
		WebElement elements = options.get(i);
		String text = elements.getText();
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(text);
		System.out.println(text);	
		}
	
	FileOutputStream out=new FileOutputStream(file);
	book.write(out);				
		
			}
	
	
		
	
		}
		
		
			
		
	
	

