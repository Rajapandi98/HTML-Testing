package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
	
	String[][] data =null;
	FileInputStream fis=FileInputStream(new File(" C:\\Users\\Windows\\eclipse-workspace\\TestIOne\\Data\\Book1.xlsx"));
	XSSFWorkbook wb =new XSSFWorkbook(fis);
	XSSFSheet sh= wb.getSheetAt(0);
     int roecnt=sh.getLastRowNum();
   int colcnt=  sh.getRow(0).getLastCellNum();
   data =new String[roecnt][colcnt];
   
   
   try
    
   {
	for(int i=1; i<=roecnt;i++) {
		XSSFRow row = sh .getRow(i);
		for(int j=0; j<=colcnt;j++) {
			
			data [i-1][j]=row.getCell(j).getStringCellValue();
					System.out.print(data[i-1][j]+"\t");
		}
			System.out.println();
		}
		
	}
   catch(Exception e)
   {
	   System.out.println(e);
	   
   }
finally {
	fis.close();
	wb.close();
}
}

	private static FileInputStream FileInputStream(File file) {
		// TODO Auto-generated method stub
		return null;
	}
}
