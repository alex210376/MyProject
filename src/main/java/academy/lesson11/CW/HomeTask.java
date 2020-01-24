package academy.lesson11.CW;

import academy.lesson05.HW_L05.Date;
import academy.lesson05.HW_L05.DateFormat;
import java.util.ArrayList;
import java.util.List;

import static academy.lesson05.HW_L05.DateFormat.RU;

public class HomeTask {
    public static void main(String[] args) {
        //> 01.01.2019, 01.01.2018, 01.02.2018, 02.02.2018, 01.01.2017
        //Выполнить сортировку
        //		по годам по убыванию
        //		по месяцам по возрастанию
        //		по дням по возрастанию

        List<Date> dates = new ArrayList<>();
        dates.add(new Date(01, 01, 2019));
        dates.add(new Date(01, 01, 2017));
        dates.add(new Date(01, 02, 2018));
        dates.add(new Date(01, 01, 2018));
        dates.add(new Date(05, 01, 2018));

        System.out.println(dates);
        printDate(dates, RU);

        dates.sort((d1, d2) ->{
            if(d1.getYear() > d2.getYear())
                return -1;
            if(d1.getYear() < d2.getYear())
                return 1;

            //Года равны
            if(d1.getMonth() < d2.getMonth())
                return -1;
            if(d1.getMonth() > d2.getMonth())
                return 1;

            //Года и месяца равны
            if(d1.getDay() < d2.getDay())
                return -1;
            if(d1.getDay() > d2.getDay())
                return 1;
            //Года, месяца и дни равны
            return 0;
        });
        System.out.println("**********************");
        printDate(dates, RU);
    }

    public static void printDate (List<Date> dateList, DateFormat format) {
        for (int i = 0; i < dateList.size(); i++)
            dateList.get(i).printDateLineFormat(format);
    }
}
