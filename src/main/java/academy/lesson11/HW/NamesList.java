package academy.lesson11.HW;

import academy.lesson04.HW_L04.Abonent;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.*;

public class NamesList {
    public static void main(String[] args) throws IOException {

        // Чтение из файлов имен и фамилий
        String inPathNameMale = "d:/QA_Java/Files for lesson11/мужские имена.txt";
        String inPathSurnameMale = "d:/QA_Java/Files for lesson11/мужские фамилии.txt";
        BufferedReader brName = new BufferedReader(new FileReader(inPathNameMale));
        BufferedReader brSurname = new BufferedReader(new FileReader(inPathSurnameMale));
        String inPathNameFemale = "d:/QA_Java/Files for lesson11/женские имена.txt";
        String inPathSurnameFemale = "d:/QA_Java/Files for lesson11/женские фамилии.txt";
        BufferedReader brNameF = new BufferedReader(new FileReader(inPathNameFemale));
        BufferedReader brSurnameF = new BufferedReader(new FileReader(inPathSurnameFemale));

        //Создание коллекция для имен и фамилий
        List<String> nameMale = new ArrayList<>();
        List<String> surnameMale = new ArrayList<>();
        List<String> nameFemale = new ArrayList<>();
        List<String> surnameFemale = new ArrayList<>();

        //Наполнение коллекций имен и фамилий из файлов
        String nextName;
        while((nextName = brName.readLine())!=null) {
            nameMale.add(nextName);
        }
        while((nextName = brSurname.readLine())!=null) {
            surnameMale.add(nextName);
        }
        while((nextName = brNameF.readLine())!=null) {
            nameFemale.add(nextName);
        }
        while((nextName = brSurnameF.readLine())!=null) {
            surnameFemale.add(nextName);
        }
        brName.close();
        brSurname.close();

        //Вывод размера коллекций имен и фамилий
        System.out.println("Количество мужских имен: "+nameMale.size());
        System.out.println("Количество мужских фамилий: "+surnameMale.size());
        System.out.println("Количество женских имен: "+nameFemale.size());
        System.out.println("Количество женских фамилий: "+surnameFemale.size());

        //Создание коллекции типа "Абонент"
        List<Abonent> abonents = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int nextInt = 10 + random.nextInt(50);
            if (random.nextBoolean()){
                abonents.add(new Abonent(i, surnameMale.get(i), nameMale.get(i), nextInt, "m"));
            }
            else{
                abonents.add(new Abonent(i, surnameFemale.get(i), nameFemale.get(i), nextInt, "f"));
            }
        }
        System.out.println("Количество абонентов: "+abonents.size());
        System.out.println(abonents);

        //Вывод абонентов в файл Excel
        String pathOut = "d:/QA_Java/Files for lesson11/Abonents.xlsx";
        FileOutputStream fos = new FileOutputStream(new File(pathOut));

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();

        for(int i=0; i < abonents.size(); i++){
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell = row.createCell(0);
            XSSFCell cell1 = row.createCell(1);
            XSSFCell cell2 = row.createCell(2);
            XSSFCell cell3 = row.createCell(3);
            XSSFCell cell4 = row.createCell(4);
            cell.setCellValue(abonents.get(i).getId());
            cell1.setCellValue(abonents.get(i).getLastName());
            cell2.setCellValue(abonents.get(i).getFirstName());
            cell3.setCellValue(abonents.get(i).getAge());
            cell4.setCellValue(abonents.get(i).getGender());
        }

        // Физически запись в файл
        workbook.write(fos);
        fos.close();
        workbook.close();
    }

}
