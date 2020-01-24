package academy.lesson07.CW;

import academy.lesson05.HW_L05.Date;

public class LambdaTest {

    public static void main(String[] args) {
        StringFunction converterToUpperCase = s -> s.toUpperCase();
        String result = converterToUpperCase.convert("hello");
        System.out.println(result);

        DateTimeFunction dateTimeFunction = d -> {
            d.setDay(1);
            d.setMonth(1);
        };
        Date date = new Date(12, 2, 2019);
        dateTimeFunction.apply(date);
        System.out.println(date.getFormattedDate());
    }
}
