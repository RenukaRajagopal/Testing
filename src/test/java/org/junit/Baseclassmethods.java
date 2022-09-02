package org.junit;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassmethods {
	public static WebDriver driver;
	String result="";
	public static void getDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void getUrl(String url) {
		driver.get(url);
     }
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}
	public void elementSendkeys(WebElement element,String text) {
		element.sendKeys(text);

	}
	public void elementClick(WebElement element) {
		element.click();

	}
	public String getappTitle() {
		String title=driver.getTitle();
        return title;
	}
	
	public String getcurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String getAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
   }
   
    public WebElement findByID(String text) {
	WebElement findElement = driver.findElement(By.id(text));
	return findElement;
    }
   public WebElement findByName(String text) {
		WebElement findElement = driver.findElement(By.name(text));
		return findElement;
	}
   public WebElement findByClassName(String text) {
		WebElement findElement = driver.findElement(By.className(text));
		return findElement;
	}
   public WebElement findByXpath(String text) {
		WebElement findElement = driver.findElement(By.xpath(text));
		return findElement;
	}
   public WebElement findByLinkText(String text) {
		WebElement findElement = driver.findElement(By.linkText(text));
		return findElement;
	}
   public WebElement findByPartialLinkText(String text) {
		WebElement findElement = driver.findElement(By.partialLinkText(text));
		return findElement;
   }
   public void moveToElement(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		
	}
   public void contextClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
	}
   public void dragandDrop(WebElement source,WebElement destination) {
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}
   public void doubleClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
   public void selectByIndex(WebElement element,int number) {
		Select select= new Select(element);
		select.selectByIndex(number);
	}
   public void selectByValue(WebElement element,String value) {
		Select select= new Select(element);
		select.selectByValue(value);
	}
   public void selectByVisibleText(WebElement element,String text) {
		Select select= new Select(element);
		select.selectByVisibleText(text);
	}

   public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
   public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
   public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
   
   public boolean robotclass(WebElement text) {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_'"+text+"');
	}
   
   public void alertAccept() {
		Alert alert= driver.switchTo().alert();
        alert.accept();
   }
   
   public void alertDismiss() {
		Alert alert= driver.switchTo().alert();
       alert.dismiss();
  }
   
   public void alertSendkeys(String text) {
		Alert alert= driver.switchTo().alert();
      alert.sendKeys(text);
  }
   public void jsSetAttribute(WebElement element,String text) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','"+text+"')", element);
 }
   public void jsgetAttribute(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("return argument[0].getAttribute('value')", element);
}
   public static void quitWindow() {
	   driver.quit();
   }
   public void closeWindow() {
	   driver.close();
   }
   public void clearText(WebElement element) {
	  element.clear();
   }
   public static void implicitWait(int time) {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	   }
   
   
  
   public String getDataExcel(String sheetname,int rowno,int cellno) throws IOException {  //Get the data from Excel
	   File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
	   FileInputStream input= new FileInputStream(file);
	   Workbook workbook= new XSSFWorkbook(input);
	   Sheet sheet = workbook.getSheet(sheetname);
	   Row row = sheet.getRow(rowno);
	   Cell cell = row.getCell(cellno);
	   CellType cellType = cell.getCellType();
	   switch (cellType) {
	case STRING:
		result = cell.getStringCellValue();
		
		break;
	   
   case NUMERIC:
	   if(DateUtil.isCellDateFormatted(cell)){
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat date= new SimpleDateFormat("dd/MM/YYYY");
		result = date.format(dateCellValue);	
	   }else {
		   double numericCellValue = cell.getNumericCellValue();
		   long round = Math.round(numericCellValue);
		   if(round==numericCellValue) {
			   result=String.valueOf(round);
		   }else {
		   result=String.valueOf(numericCellValue);   
	       }
	   break;
	   }
	default:
		break;
	}
   return result;
	   }
   
protected void updateDataExcel(String sheetname,int rowno,int cellno,String olddata,String newdata) throws IOException {
	
		   File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
		   FileInputStream input= new FileInputStream(file);
		   Workbook workbook= new XSSFWorkbook(input);
		   Sheet sheet = workbook.getSheet(sheetname);
		   Row row = sheet.getRow(rowno);
		   Cell cell = row.getCell(cellno);
		   String value = cell.getStringCellValue();
		   if(value.equals(olddata)) {
			   cell.setCellValue(newdata);
		   }
		   FileOutputStream out =new FileOutputStream(file);
		   workbook.write(out);
}

public void insertValueinCellExcel(String sheetname,int rowno,int cellno,String cellvalue) throws IOException {
	
	     File file= new File("C:\\Users\\Lenovo\\eclipse-workspace\\java\\FrameWorkSet\\Excel\\OmrbranchExcel.xlsx");
	     FileInputStream input= new FileInputStream(file);
	     Workbook workbook= new XSSFWorkbook(input);
	     Sheet sheet = workbook.getSheet(sheetname);
	     Row row = sheet.getRow(rowno);
	     Cell cell = row.createCell(cellno);
	     cell.setCellValue(cellvalue);
	     FileOutputStream out =new FileOutputStream(file);
	     workbook.write(out);
	     
}



public File screenShot() {
	TakesScreenshot shot= (TakesScreenshot) driver;
	File screenshotAs = shot.getScreenshotAs(OutputType.FILE);
	return screenshotAs;
}


public File elementscreenShot(WebElement element) {
	TakesScreenshot shot= (TakesScreenshot) driver;
	File screenshotAs = element.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	return screenshotAs;
}



















}
	   

	









