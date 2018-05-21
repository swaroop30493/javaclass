package com.javaclass_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runnable2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File file = new File("\"B:\\java\\Data.xlsx\"");
		try {
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
			XSSFSheet s = workBook.getSheet("Sheet1");
			String cellValue[][] = new String[42][3];

			for (int i = 22; i <= 41; i++) {
				Row r = s.getRow(i);
				if (r != null) {
					for (int j = 0; j < 3; j++) {
						Cell cell = r.getCell(j);
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							cellValue[i][j] = String.valueOf(cell.getNumericCellValue());
							if (Double.parseDouble((cellValue[i][j])) > 700) {
								System.out.println(cellValue[i][j]);
							}
							break;
							case Cell.CELL_TYPE_STRING:
							cellValue[i][j] = cell.getStringCellValue();
							break;
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
