import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class SortExcelSheet {

    public static void sortExcelFile(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Get the last row number to determine the range for sorting
        int lastRowNum = sheet.getLastRowNum() ;

        // Create a custom comparator based on the values in column B
        Comparator<Row> rowComparator = Comparator.comparing(row -> {
            Cell cell = row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            return cell.toString();
        });

        List<Row> rows = new ArrayList<>();
        for (int i = 0; i <= lastRowNum; i++) { 
            rows.add(sheet.getRow(i));
        }

        rows.sort(rowComparator);

        for (Row row : rows) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        fileInputStream.close();
    }

    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\DishaSingh\\Downloads\\ExcelSorting.xlsx";
            sortExcelFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
