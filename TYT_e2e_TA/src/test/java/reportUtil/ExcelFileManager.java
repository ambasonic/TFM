package reportUtil;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;


public class ExcelFileManager {

    private XSSFWorkbook workbook = new XSSFWorkbook();

    public ExcelFileManager(){
        createExcelReport(CountryReportFile.ITALY_OPERATION_REPORT, "Test results",1);
    }

    /**
     *
     * @param countryReportFile
     * @param sheetName
     * @param numberOfTest TODO change it to test Object list
     * @return
     */
    private Workbook createExcelReport(CountryReportFile countryReportFile, String sheetName, int numberOfTest){


        Path newFilePath = Paths.get("src/test/resources/excel/"+countryReportFile.toString()+".xlsx");

        // add a sheet to workbook TODO maybe give a list of sheets to add
        XSSFSheet sheet = addSheet(workbook, sheetName);
        int rowIndex = 0;
        // add items to test report
        for (int i = 0; i< 4; i++){
            // add basic items to test report
            addBasicRowDataToReport(sheet, rowIndex, "TestaCase ID:"+356+i);
            // for all new Test case add 5 to all index
            rowIndex = rowIndex+5;
        }

        try {
            try (OutputStream fileOut = new FileOutputStream(newFilePath.toFile())) {
                workbook.write(fileOut);
                workbook.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }

    private XSSFSheet addSheet(XSSFWorkbook workbook, String SheetName){
        return  workbook.createSheet(SheetName);
    }

    private void addBasicRowDataToReport(XSSFSheet sheet, int rowIndex, String testCaseID){
        addTestCaseDescription(sheet, rowIndex, testCaseID);

        XSSFRow xssfRow = sheet.createRow(rowIndex+1);
        addActualResult(xssfRow, sheet);

        xssfRow = sheet.createRow(rowIndex+2);
        addExpectedResult(xssfRow, sheet);

        //List of cell name with same layout
        String[] cellArray ={CellName.OPTION_ACCESSORIES.getDescription(), CellName.DISCOUNTED_PRICE.getDescription(),
        CellName.LEASE_PRICE.getDescription(), CellName.SERVICES.getDescription()};
        int cellIndex = 2;
        for (int i = 0; i < cellArray.length; i++) {
             // i start at C1 ... to F1
            addCellToSheet( sheet.getRow(rowIndex).createCell(cellIndex), sheet, cellArray[i]); // the row is already created i just need to get it
            cellIndex =  cellIndex +1;
        }

        //TODO make better ans save the Price as number not String
//        TODO put in red the field where the expected result is not ok

        addActualResult(sheet.getRow(rowIndex+1).createCell(2), "1500€");
        addActualResult(sheet.getRow(rowIndex+1).createCell(3), "210,0€");
        addActualResult(sheet.getRow(rowIndex+1).createCell(4), "220,0€");
        addActualResult(sheet.getRow(rowIndex+1).createCell(5), "320,0€");

        addExpectedResult(sheet.getRow(rowIndex+2).createCell(2), "320,0€");
        addExpectedResult(sheet.getRow(rowIndex+2).createCell(3), "1500€");
        addExpectedResult(sheet.getRow(rowIndex+2).createCell(4), "210,0€");
        addExpectedResult(sheet.getRow(rowIndex+2).createCell(5), "220,0€");


    }

    private void addExpectedResult(XSSFCell xssfCell, String result) {
        setResultStyle(xssfCell, result);
    }

    /**
     * this method fills the Actual result
     * @param xssfCell
     * @param result
     */
    private void addActualResult(XSSFCell xssfCell, String result) {
        setResultStyle(xssfCell, result);

    }

    private void setResultStyle(XSSFCell xssfCell, String result) {
        XSSFCellStyle style = workbook.createCellStyle();
        xssfCell.setCellValue(result);

        // set text font and alignment
        XSSFFont xssfFont = workbook.createFont();
        xssfFont.setFontHeight(14);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setAlignment(HorizontalAlignment.CENTER);
        xssfCell.setCellStyle(style);

        //Set Border
        style.setBorderTop(BorderStyle.MEDIUM);
        style.setBorderLeft(BorderStyle.MEDIUM);
        style.setBorderBottom(BorderStyle.MEDIUM);
    }

    private void addCellToSheet(XSSFCell xssfCell, XSSFSheet sheet, String cellName) {

        XSSFCellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(new XSSFColor(new java.awt.Color(32, 55, 100), new DefaultIndexedColorMap()));
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xssfCell.setCellValue(cellName);
        xssfCell.setCellStyle(style);

        // set text font and alignment
        XSSFFont xssfFont = workbook.createFont();
        xssfFont.setBold(true);
        xssfFont.setColor(IndexedColors.WHITE.getIndex());
        style.setFont(xssfFont);
        xssfFont.setFontHeight(14);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setAlignment(HorizontalAlignment.CENTER);
        xssfCell.setCellStyle(style);

        //Set Border
        style.setBorderTop(BorderStyle.MEDIUM);
        style.setBorderLeft(BorderStyle.MEDIUM);
        style.setBorderBottom(BorderStyle.MEDIUM);
        style.setBorderRight(BorderStyle.MEDIUM);

//        sheet.autoSizeColumn(xssfCell.getColumnIndex());
        sheet.setColumnWidth(xssfCell.getColumnIndex(), 8000);
    }

    /**
     * B3 Expected Result
     * @param xssfRow
     * @param sheet
     */
    private void addExpectedResult(XSSFRow xssfRow, XSSFSheet sheet) {
        setResultsStyle(sheet, xssfRow, CellName.EXPECTED_RESULT.getDescription());
    }

    /**
     * B2 Actual Result
     *  @param xssfRow
     * @param sheet
     */
    private void addActualResult(XSSFRow xssfRow, XSSFSheet sheet) {
        setResultsStyle(sheet, xssfRow, CellName.ACTUAL_RESULT.getDescription());
    }

    private void setResultsStyle(XSSFSheet sheet, XSSFRow xssfRow, String cellName) {
        XSSFCell xssfCell = xssfRow.createCell(1);
        XSSFCellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(new XSSFColor(new java.awt.Color(146, 208, 80), new DefaultIndexedColorMap()));
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xssfCell.setCellValue(cellName);
        xssfCell.setCellStyle(style);

        // set text font and alignment
        XSSFFont xssfFont = workbook.createFont();
        xssfFont.setBold(true);
        style.setFont(xssfFont);
        xssfFont.setFontHeight(12);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setAlignment(HorizontalAlignment.CENTER);
        xssfCell.setCellStyle(style);

        //Set Border
        style.setBorderTop(BorderStyle.MEDIUM);
        style.setBorderLeft(BorderStyle.MEDIUM);
        style.setBorderBottom(BorderStyle.MEDIUM);
        style.setBorderRight(BorderStyle.MEDIUM);

        sheet.setColumnWidth(xssfCell.getColumnIndex(), 7000);
    }

    /**
     *  A1 A2 A3 - Test Case + description
     *
     *  add a test case description to each test
     * @param sheet
     * @param rowIndex
     * @param testCaseID
     */
    private void addTestCaseDescription(XSSFSheet sheet, int rowIndex, String testCaseID) {

        XSSFRow xssfRow = sheet.createRow(rowIndex);
        XSSFCell xssfCell = xssfRow.createCell(0);
        sheet.addMergedRegion(new CellRangeAddress(
                rowIndex, //first row (0-based)
                rowIndex+2, //last row  (0-based)
                0, //first column (0-based)
                0  //last column  (0-based)
        ));

//      set cell background color
        XSSFCellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(new XSSFColor(new java.awt.Color(172, 185, 202), new DefaultIndexedColorMap()));
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        xssfCell.setCellValue(testCaseID);
        xssfCell.setCellStyle(style);

//      set text font and alignment
        XSSFFont xssfFont = workbook.createFont();
        style.setFont(xssfFont);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        xssfFont.setFontHeight(12);
        xssfCell.setCellStyle(style);

        sheet.autoSizeColumn(0, true);

    }

   public static void main(String[] arg) throws IOException {

//        ExcelFileManager excelFileManager = new ExcelFileManager();
   }
}
