package academy.lesson08.HW;

public class DateDemo {
    public static void main(String[] args) {
        try {
            CorrectDate date1 = new CorrectDate(1, 1, 2012);
            System.out.println(date1.getFormattedDate());
            CorrectDate date2 = new CorrectDate(17, 2, 2019);
            System.out.println(date2.getFormattedDate());
            CorrectDate date3 = new CorrectDate(29, 2, 2020);
            System.out.println(date3.getFormattedDate());
            CorrectDate date4 = new CorrectDate(31, 1, 1999);
            System.out.println(date4.getFormattedDate());
            CorrectDate date5 = new CorrectDate(13, 6, 1681);
            System.out.println(date5.getFormattedDate());
            CorrectDate date6 = new CorrectDate(-1, 1, 2012);
            System.out.println(date6.getFormattedDate());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            CorrectDate date7 = new CorrectDate(2, 13, 2012);
            System.out.println(date7.getFormattedDate());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }
        try {
            CorrectDate date7 = new CorrectDate(0, 06, 1681);
            System.out.println(date7.getFormattedDate());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }

        System.out.println("********************************");
        System.out.println("Ввод времени");
        try {
            CorrectTime time1 = new CorrectTime(12, 12, 12);
            System.out.println(time1.getFormattedTime());
            CorrectTime time2 = new CorrectTime(23, 1, 1);
            System.out.println(time2.getFormattedTime());
            CorrectTime time3 = new CorrectTime(0, 0, 0);
            System.out.println(time3.getFormattedTime());
            CorrectTime time4 = new CorrectTime(23, 59, 59);
            System.out.println(time4.getFormattedTime());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            CorrectTime time1 = new CorrectTime(-12, 12, 12);
            System.out.println(time1.getFormattedTime());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            CorrectTime time1 = new CorrectTime(23, 1, 60);
            System.out.println(time1.getFormattedTime());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            CorrectTime time1 = new CorrectTime(24, 0, 0);
            System.out.println(time1.getFormattedTime());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            CorrectTime time1 = new CorrectTime(23, 60, 0);
            System.out.println(time1.getFormattedTime());
        } catch (IllegalDateException e) {
            //e.printStackTrace();
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
