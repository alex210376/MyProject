package academy.lesson11.HW;

import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.*;

public class NameListExt {
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
        List<AbonentExt> abonents = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int nextInt = 10 + random.nextInt(50);
            if (random.nextBoolean()){
                abonents.add(new AbonentExt(i+1, surnameMale.get(i), nameMale.get(i), nextInt, "m",createPhoneNumberFull(),"Life"));
                if(abonents.get(i).getPhoneNumber().startsWith("38063")||abonents.get(i).getPhoneNumber().startsWith("38093")||abonents.get(i).getPhoneNumber().startsWith("38073"))
                    abonents.get(i).setPhoneCarrier("Life");
                if(abonents.get(i).getPhoneNumber().startsWith("38097")||abonents.get(i).getPhoneNumber().startsWith("38067")||abonents.get(i).getPhoneNumber().startsWith("38068"))
                    abonents.get(i).setPhoneCarrier("Kievstar");
                if(abonents.get(i).getPhoneNumber().startsWith("38050")||abonents.get(i).getPhoneNumber().startsWith("38066")||abonents.get(i).getPhoneNumber().startsWith("38095"))
                    abonents.get(i).setPhoneCarrier("Vodafone");
            }
            else{
                abonents.add(new AbonentExt(i+1, surnameFemale.get(i), nameFemale.get(i), nextInt, "f", createPhoneNumberFull(), "MTC"));
                if(abonents.get(i).getPhoneNumber().startsWith("38063")||abonents.get(i).getPhoneNumber().startsWith("38093")||abonents.get(i).getPhoneNumber().startsWith("38073"))
                    abonents.get(i).setPhoneCarrier("Life");
                if(abonents.get(i).getPhoneNumber().startsWith("38097")||abonents.get(i).getPhoneNumber().startsWith("38067")||abonents.get(i).getPhoneNumber().startsWith("38068"))
                    abonents.get(i).setPhoneCarrier("Kievstar");
                if(abonents.get(i).getPhoneNumber().startsWith("38050")||abonents.get(i).getPhoneNumber().startsWith("38066")||abonents.get(i).getPhoneNumber().startsWith("38095"))
                    abonents.get(i).setPhoneCarrier("Vodafone");
            }
        }
        System.out.println("Количество абонентов: "+abonents.size());

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
            XSSFCell cell5 = row.createCell(5);
            XSSFCell cell6 = row.createCell(6);
            cell.setCellValue(abonents.get(i).getId());
            cell1.setCellValue(abonents.get(i).getLastName());
            cell2.setCellValue(abonents.get(i).getFirstName());
            cell3.setCellValue(abonents.get(i).getAge());
            cell4.setCellValue(abonents.get(i).getGender());
            cell5.setCellValue(abonents.get(i).getPhoneNumber());
            cell6.setCellValue(abonents.get(i).getPhoneCarrier());
        }

        // Физически запись в файл
        workbook.write(fos);
        fos.close();
        workbook.close();
    }

    // Метод, который возвращает полный телефонный номер, включая префикс
    private static String createPhoneNumberFull() {
        Random random = new Random();
            int nextInt = random.nextInt(7);
            switch (random.nextInt(9)){
                case 0:
                    return "38063" + createPhoneNumber();
                case 1:
                    return "38093" + createPhoneNumber();
                case 2:
                    return "38073" + createPhoneNumber();
                case 3:
                    return "38097" + createPhoneNumber();
                case 4:
                    return "38067" + createPhoneNumber();
                case 5:
                    return "38098" + createPhoneNumber();
                case 6:
                    return "38050" + createPhoneNumber();
                case 7:
                    return "38066" + createPhoneNumber();
                case 8:
                    return "38095" + createPhoneNumber();
            }
            return "";
    }

    // Метод, который возвращает телефонный номер, который состоит из 7 случайных цифр
    private static String createPhoneNumber() {
        Random random = new Random();
        String str="";
        for (int i=0; i < 7; i++){
            int nextInt = random.nextInt(10);
            str += nextInt;
        }
        return str;
    }
}
