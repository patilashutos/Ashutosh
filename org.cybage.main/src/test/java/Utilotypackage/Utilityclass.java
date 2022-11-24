package Utilotypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass {
	
	public static void capturescreenshot(TakesScreenshot driver) throws IOException {
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	    File distination= new File("C:\\Users\\HP\\Desktop\\Sreenshotselenium");
 		FileHandler.copy(source, distination);}
	
	
	public static void paramerization() {
		FileInputStream file=new FileInputStream("E:\\Test Cases\\MockProject.xlsx");
		Workbook excelfile=WorkbookFactory.create(file);
		Sheet sheet1=excelfile.getSheet("Sheet2");
		
		for(int i=0;i<=sheet1.getLastRowNum();i++) {
			Row row=sheet1.getRow(i);
			
		for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell=row.getCell(j);
				System.out.print(cell+" | ");}
				System.out.println();}}
 		
		
		
	}

}
