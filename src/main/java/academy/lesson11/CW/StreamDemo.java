package academy.lesson11.CW;

import academy.lesson05.HW_L05.Date;
import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(01, 01, 2019));
        dates.add(new Date(01, 01, 2017));
        dates.add(new Date(01, 02, 2018));
        dates.add(new Date(01, 01, 2018));
        dates.add(new Date(05, 01, 2018));

        long count = dates.stream()
                .filter(d -> d.getYear()==2018)
                .peek(d->d.setDay(12))
                .map(d -> d.getDay()+"."+d.getMonth()+"."+d.getYear())
                .peek(System.out::println)
                .count();

        System.out.println(dates);
        System.out.println(count);
    }
}
