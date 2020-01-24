package academy.lesson11.file;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadDemo {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String pathIn = "d:/QA-JA-08/Files/excel names.xls";
        // FileIntputStream fis = new FileInputStream(new File(pathOut));

        XSSFWorkbook workbook = new XSSFWorkbook(new File(pathIn));
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);
        String name = cell.getStringCellValue();
        System.out.println(name);

        workbook.close();

    }
}
