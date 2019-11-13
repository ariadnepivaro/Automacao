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

	
	private String path;
	private XSSFSheet aba;
	private FileInputStream file;
	private XSSFWorkbook planilha;

	public Excel(String path) {
		this.path = path;
	}

	private void abrirPlanilha(int aba) {
		try {
			this.file = new FileInputStream(new File(path));
			this.planilha = new XSSFWorkbook(this.file);
			this.aba = this.planilha.getSheetAt(aba);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void salvarPlanilha() {
		FileOutputStream newFile;
		try {
			newFile = new FileOutputStream(path);
			this.planilha.write(newFile);
		} catch (Exception e) {
			System.out.println("Erro em Salvar Planilha Excel");
		}
	}

	private void fecharPlanilha() {
		try {
			this.file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Map<String, String> lePlanilhaRetornandoMassaDeDados(int linha) {
		Map<String, String> massa = new HashMap<String, String>();
		int count =0;
		abrirPlanilha(0);
		Row linhaPlanilha = this.aba.getRow(0);
		Iterator<Cell> cellIterator = linhaPlanilha.cellIterator();
		while (cellIterator.hasNext()) {
			Cell cellChave = cellIterator.next();
			String chave = converteCellEmString(cellChave);
			Row rowValor = this.aba.getRow(linha);
			String valor = converteCellEmString(rowValor.getCell(count));
			if(chave.equals("OrderNumber")) { // guardar posicao da celula
				valor = linha + "-" + count;
			}
			System.out.println(chave + " : " + valor);
			massa.put(chave, valor);
			count++;
		}
		fecharPlanilha();
		return massa;
	}
	
	private String converteCellEmString(Cell cell) {
		String leituraString;
		if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			double valor =  cell.getNumericCellValue();
			leituraString= Double.toString(valor);
		}else if (cell.getCellType() == Cell.CELL_TYPE_STRING){
			leituraString= cell.getStringCellValue();
		}else if (cell.getCellType() == Cell.CELL_TYPE_BLANK){
			leituraString = "";
		}else {
			leituraString = null;
		}
		return leituraString;
	}

	public void gravaNumeroOrdem(String ordemPosicao, String ordem) {
		abrirPlanilha(0);
		int linha = Integer.parseInt(ordemPosicao.split("-")[0]);
		int coluna = Integer.parseInt(ordemPosicao.split("-")[1]);
		Row linhaPlanilha = this.aba.getRow(linha);
		Cell celulaOrdem = linhaPlanilha.createCell(coluna);
		celulaOrdem.setCellValue(ordem);
		salvarPlanilha();
		fecharPlanilha();
	}
}
