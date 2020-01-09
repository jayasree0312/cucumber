package org.resouces;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import feature.stepdefination.Hooks;

public class Base {
	public static void url(String s) {
		Hooks.driver.get(s);
		
	}
	public static void fill(WebElement W, String s) {
		W.sendKeys(s);
	}
	public static void click(WebElement W) {
		W.click();
	}
	public static void selecting(WebElement W, String s1) {
		Select s = new Select(W);
		s.selectByVisibleText(s1);
		
	}
	public static List<HashMap<String,String>> readValues() throws Exception {
		List<HashMap<String,String>> li=new ArrayList<HashMap<String,String>>();
		File f = new File("C:\\Users\\Shiyanz\\eclipse-workspace\\sree\\cucumbertry\\xlfile_readvalue\\sreexl.xlsx");
		FileInputStream streem = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(streem);
		Sheet s = w.getSheet("Sheet1");
		Row headerRow=s.getRow(0);
		for(int i=1;i<s.getPhysicalNumberOfRows();i++) {
			HashMap<String,String> mp=new HashMap<String,String>();
			Row r = s.getRow(i);
			for(int j=1;j<headerRow.getPhysicalNumberOfCells();j++) {
			Cell c = r.getCell(j);
			int type = c.getCellType();
			if(type==1) {
				String name = c.getStringCellValue();
				mp.put(headerRow.getCell(j).getStringCellValue(),name);
				
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				String name = String.valueOf(l);
				mp.put(headerRow.getCell(j).getStringCellValue(),name);
				
				
			}
			li.add(mp);
			
		}
	}
		return li;
}
}
				
	
