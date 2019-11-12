package br.com.ariadnemartines.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	private String path;

	private FileInputStream file;
	private FileOutputStream outFile;

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;
	
	
	
	public void planilha(String tipoPessoa, String sheetName) {

		setPath(".\\Recursos\\SampleAppData (3).xlsx");
		setPath(Paths.get(getPath()).toAbsolutePath().toString());
		try {
			file = new FileInputStream(new File(getPath()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			setWorkbook(new XSSFWorkbook(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setSheet(getWorkbook().getSheet(sheetName));
	}
	
	
	private void setPath(String path) {
		this.path = path;
	}

	private String getPath() {
		return this.path;
	}
	
	private void setWorkbook(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}

	private XSSFWorkbook getWorkbook() {
		return this.workbook;
	}
	
	private void setSheet(XSSFSheet sheet) {
		this.sheet = sheet;
	}
	
}
