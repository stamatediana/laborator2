package ro.ulbs.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class Prob2 {

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Grades");


        XSSFCellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        XSSFFont boldFont = workbook.createFont();
        boldFont.setBold(true);
        headerStyle.setFont(boldFont);


        XSSFCellStyle yellowStyle = workbook.createCellStyle();
        yellowStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);


        String[] headers = {"Name", "Surname", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Max", "Average"};
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerStyle);
        }


        Map<String, Object[]> data = new TreeMap<>();
        data.put("2", new Object[]{"Amit", "Shukla", 9, 8, 7, 5});
        data.put("3", new Object[]{"Lokesh", "Gupta", 8, 9, 6, 7});
        data.put("4", new Object[]{"John", "Adwards", 8, 8, 7, 6});
        data.put("5", new Object[]{"Brian", "Schultz", 7, 6, 8, 9});

        int rowNum = 1;
        for (Map.Entry<String, Object[]> entry : data.entrySet()) {
            Row row = sheet.createRow(rowNum);
            Object[] values = entry.getValue();
            int colNum = 0;


            for (Object val : values) {
                Cell cell = row.createCell(colNum++);
                if (val instanceof String)
                    cell.setCellValue((String) val);
                else if (val instanceof Integer)
                    cell.setCellValue((Integer) val);
            }


            Cell maxCell = row.createCell(6);
            String maxFormula = String.format("MAX(D%d:G%d)", rowNum + 1, rowNum + 1);
            maxCell.setCellFormula(maxFormula);
            maxCell.setCellStyle(yellowStyle);


            Cell avgCell = row.createCell(7);
            String avgFormula = String.format("AVERAGE(D%d:G%d)", rowNum + 1, rowNum + 1);
            avgCell.setCellFormula(avgFormula);
            avgCell.setCellStyle(yellowStyle);

            rowNum++;
        }


        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }

        try (FileOutputStream out = new FileOutputStream("output8.xlsx")) {
            workbook.write(out);
            workbook.close();
            System.out.println("Fisierul 'output8.xlsx' a fost generat cu succes.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
