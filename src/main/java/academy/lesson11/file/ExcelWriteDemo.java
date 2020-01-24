package academy.lesson11.file;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteDemo {
    public static void main(String[] args) throws IOException {
        String pathOut = "d:/QA-JA-08/Files/excel names.xls";
        FileOutputStream fos = new FileOutputStream(new File(pathOut));

        XSSFWorkbook workbook = new XSSFWorkbook();
        //Наполним данными
        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Ашот");

        // Физически запись в файл
        workbook.write(fos);
        fos.close();
        workbook.close();

    }
}
