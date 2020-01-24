package academy.lesson05.HW_L05;

public class DateTest {
    public static void main(String[] args){
        Date date = new Date(10, 5, 2019);
        Date date1 = new Date();
        //date.printDate();
        date.set(15,7,2000);
        //date.printDate();

        //date1.printDate();
        //date1.printDateLine();

        date.printDateLineFormat(DateFormat.RU);
        date.printDateLineFormat(DateFormat.ENG);
        date.printDateLineFormat(DateFormat.USA);
        date.printDateLineFormat(DateFormat.UK);
        date.printDateLineFormat(DateFormat.CUSTOM);

      /*  System.out.println(date.toString());

        DateTime dateTime = new DateTime(15, 5, 2015, 10, 10 ,10);
        DateTime dateTime1 = new DateTime();
        dateTime.printDateLine();
        dateTime1.printDateLine();
        System.out.println(dateTime.toString());

        dateTime1.set(12,12,1917, 25, 30, 30);
        dateTime1.printDateLine();

        DateTimeExt dateTimeExt = new DateTimeExt(15, 5, 2015, 10, 10 ,10, 20);
        DateTimeExt dateTimeExt1 = new DateTimeExt();
        dateTimeExt.printDateLine();
        dateTimeExt1.printDateLine();
        System.out.println(dateTimeExt.toString());

       */

    }

}
