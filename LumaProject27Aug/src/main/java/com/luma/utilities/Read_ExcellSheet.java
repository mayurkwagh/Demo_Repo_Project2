package com.luma.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcellSheet
{
	private String path="C:\\velocitytraining\\Luma projects\\LumaProject27Aug\\src\\test\\resources\\testData\\test data.xlsx\\";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public String readdata(String sheet_index, int row_number, int cell_number) 
	{

		try 
		{
			file=new File(path);
			fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheet(sheet_index);
		} 
		catch (IOException e) 
		{
			System.out.println("please select path");
			e.printStackTrace();
		}
		
		//String data=sheet.getRow(row_number).getCell(cell_number).getStringCellValue();
		
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(sheet.getRow(row_number).getCell(cell_number));
		return data;

	}

}
