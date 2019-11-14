package br.com.ariadnemartines.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	private XSSFSheet planilha;	
	private String nomeArquivo;
	private XSSFWorkbook wb;
	private FileInputStream arquivo;
	
	public Excel(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		this.abrePlanilha(0);
	}

	public void abrePlanilha(int indicePlanilha) {
		try {
			this.arquivo = new FileInputStream(new File(this.getNomeArquivo()));
			this.wb = new XSSFWorkbook(this.arquivo);
		} catch (IOException ex) {
			System.out.println("Erro ao abrir a pasta de Excel em '" + this.getNomeArquivo() + "' ..." + ex);
		}
		this.planilha = this.getWorkBook().getSheetAt(indicePlanilha);
	}
	
	public String getTextoCelula(int linha, int coluna) {
		abrePlanilha(0);
		String textoCelula;
		try {
			textoCelula = this.getPlanilha().getRow(linha).getCell(coluna).getStringCellValue();
		} catch (Exception ex) {
			textoCelula = Integer.toString((int) this.getPlanilha().getRow(linha).getCell(coluna).getNumericCellValue());
		}
		// System.out.println(textoCelula);
		fechaPlanilha();
		return textoCelula;
	}
	
	private void fechaPlanilha() {
		try {
			this.arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setTextoCelula(int linha, int coluna, String value) {
		abrePlanilha(0);
		this.getPlanilha().getRow(linha).getCell(coluna).setCellValue(value);
		salvarPlanilha();
		fechaPlanilha();
	}
	
	public void salvarPlanilha() {
		try {
			this.wb.write(new FileOutputStream(this.getNomeArquivo()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public XSSFSheet getPlanilha() {
		return this.planilha;
	}
	
	public String getNomeArquivo() {
		return this.nomeArquivo;
	}
	
	public XSSFWorkbook getWorkBook() {
		return this.wb;
	}
}