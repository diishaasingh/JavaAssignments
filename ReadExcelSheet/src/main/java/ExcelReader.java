import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\DishaSingh\\Downloads\\data.xlsx";

		try (FileInputStream fileInputStream = new FileInputStream(filePath);
				Workbook workbook = new XSSFWorkbook(fileInputStream)) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the cell number (example:- A1): ");
			String cellNumber = scanner.nextLine();

			Sheet sheet = workbook.getSheetAt(0);
			CellReference cellRef = new CellReference(cellNumber);
			Row row = sheet.getRow(cellRef.getRow());
			Cell cell = row.getCell(cellRef.getCol());

			if (cell != null) {
				CellValue cellValue = evaluateCell(cell);
				System.out.println("Cell " + cellNumber + " value: " + cellValue.getStringValue());
			} else {
				System.out.println("Cell " + cellNumber + " not found.");
			}

			// if I wanted to print the sheet as a whole then
//			for (Row row : sheet) {
//
//				for (Cell cell : row) {
//					CellValue cellValue = evaluateCell(cell);
//					System.out.print(cellValue.getStringValue() + "\t");// here "\t" means enter
//				}
//				System.out.println(); // Move to the next line after each row
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static CellValue evaluateCell(Cell cell) {
		FormulaEvaluator formulaEvaluator = cell.getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator();
		return formulaEvaluator.evaluate(cell);
	}
}
