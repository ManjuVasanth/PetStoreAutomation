package api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtility {
	public FileInputStream inputStream;
	public FileOutputStream outputStream;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;

	String path;

	public XlUtility(String path) {
		this.path = path;
	}

	public int getRowCount(String sheetName) throws IOException {
		inputStream = new FileInputStream(path);
		workbook = new XSSFWorkbook(inputStream);
		sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		inputStream.close();
		return rowCount;

	}

	public int getCellCount(String sheetName, int rownum) throws IOException {
		inputStream = new FileInputStream(path);
		workbook = new XSSFWorkbook(inputStream);
		sheet = workbook.getSheetAt(0);
		row = sheet.getRow(rownum);
		int cellCount = row.getLastCellNum();
		workbook.close();
		inputStream.close();
		return cellCount;

	}

	public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
		inputStream = new FileInputStream(path);
		workbook = new XSSFWorkbook(inputStream);
		sheet = workbook.getSheetAt(0);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		DataFormatter formatter = new DataFormatter();
		String data;
		try {
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		workbook.close();
		inputStream.close();
		return data;

	}

	public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {
		File xlFile = new File(path);
		if (!xlFile.exists()) {
			workbook = new XSSFWorkbook();
			outputStream = new FileOutputStream(path);
			workbook.write(outputStream);
		}
		inputStream = new FileInputStream(path);
		workbook = new XSSFWorkbook(inputStream);

		if (workbook.getSheetIndex(sheetName) == 1)
			workbook.createSheet(sheetName);
		sheet = workbook.getSheet(sheetName);
		if (sheet.getRow(rownum) == null) // If row not exists then create new Row
			sheet.createRow(rownum);
		row = sheet.getRow(rownum);

		cell = row.createCell(colnum);
		cell.setCellValue(data);
		outputStream = new FileOutputStream(path);
		workbook.write(outputStream);
		workbook.close();
		inputStream.close();
		outputStream.close();

	}
}
