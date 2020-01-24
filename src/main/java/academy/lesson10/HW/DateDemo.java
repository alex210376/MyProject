package academy.lesson10.HW;

import java.util.*;
import academy.lesson05.HW_L05.Date;
import academy.lesson05.HW_L05.DateFormat;
import static academy.lesson05.HW_L05.DateFormat.*;

public class DateDemo {
    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(25, 8, 2019));
        dateList.add(new Date(1, 8, 2019));
        dateList.add(new Date(16, 10, 2019));
        dateList.add(new Date(10, 3, 1997));
        dateList.add(new Date(8, 12, 2019));
        dateList.add(new Date(31, 12, 2019));
        dateList.add(new Date(1, 12, 2020));
        dateList.add(new Date(30, 2, 2019));
        dateList.add(new Date(1, 1, 2020));
        dateList.add(new Date(11, 11, 2019));
        dateList.add(new Date(1, 3, 2019));
        System.out.println("Исходный список дат");
        printDate(dateList, RU); // Вывод исходного списка дат

        //Сортировка по умолчанию (год, месяц, день по возрастанию)
        Collections.sort(dateList);
        System.out.println("***************************************");
        System.out.println("Отсортированный по умолчанию список дат");
        printDate(dateList, RU);

        //Обратная сортировка (год, месяц, день по убыванию)
        Comparator<Date> reverseSort =
                (d1, d2)-> {
                    if(d1.getYear() > d2.getYear())
                        return -1;
                    if(d1.getYear() < d2.getYear())
                        return 1;
                    if(d1.getMonth() > d2.getMonth())
                        return -1;
                    if(d1.getMonth() < d2.getMonth())
                        return 1;
                    if(d1.getDay() > d2.getDay())
                        return -1;
                    if(d1.getDay() < d2.getDay())
                        return 1;
                    return 0;
                };
        dateList.sort(reverseSort);
        System.out.println("*********************************************");
        System.out.println("Отсортированный в обратном порядке список дат");
        printDate(dateList, RU);
    }

    //Метод для вывода дат в форматированном виде
    public static void printDate (List<Date> dateList, DateFormat format) {
        for (int i = 0; i < dateList.size(); i++)
            dateList.get(i).printDateLineFormat(format);
    }
}
