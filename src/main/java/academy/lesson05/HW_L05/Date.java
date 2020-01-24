package academy.lesson05.HW_L05;

public class Date implements Comparable<Date>{
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 10;
        month = 10;
        year = 1975;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void set(int day, int month, int year) {
        if(0 < day && day <= 31)
            this.day = day; else System.out.println("Неверное значение дня");
        if(0 < month && month <= 12)
            this.month = month; else System.out.println("Неверное значение месяца");
        if(0 < year && year <= 2049)
            this.year = year; else System.out.println("Неверное значение года");
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void printDate(){
        System.out.println("День:" + this.day);
        System.out.println("Месяц:" + this.month);
        System.out.println("Год:" + this.year);
    }
    public void printDateLine(){
        System.out.println(this.day + "." + this.month + "." + this.year);
    }
    public String getFormattedDate() {
        return String.format("%02d.%02d.%02d", day, month, year);
        //return day + "." + month + "." + year;
    }

    public void printDateLineFormat(DateFormat format){
        switch (format){
            case RU:
                System.out.println(String.format("%02d.%02d.%02d", day, month, year));
                break;
            case USA:
                System.out.println(String.format("%02d-%02d-%02d", day, month, year));
                break;
            case UK:
                System.out.println(String.format("%02d/%02d/%02d", day, month, year));
                break;
            case CUSTOM:
                switch (this.month) {
                    case 1:
                        System.out.println(this.day + " января " + this.year + "г");
                        break;
                    case 2:
                        System.out.println(this.day + " Февраля " + this.year + "г");
                        break;
                    case 3:
                        System.out.println(this.day + " Марта " + this.year + "г");
                        break;
                    case 4:
                        System.out.println(this.day + " Апреля " + this.year + "г");
                        break;
                    case 5:
                        System.out.println(this.day + " Мая " + this.year + "г");
                        break;
                    case 6:
                        System.out.println(this.day + " Июня " + this.year + "г");
                        break;
                    case 7:
                        System.out.println(this.day + " Июля " + this.year + "г");
                        break;
                    case 8:
                        System.out.println(this.day + " Августа " + this.year + "г");
                        break;
                    case 9:
                        System.out.println(this.day + " Сентября " + this.year + "г");
                        break;
                    case 10:
                        System.out.println(this.day + " Октября " + this.year + "г");
                        break;
                    case 11:
                        System.out.println(this.day + " Ноября " + this.year + "г");
                        break;
                    case 12:
                        System.out.println(this.day + " Декабря " + this.year + "г");
                        break;
                }
            break;
        }
    }

    @Override
    public int compareTo(Date other) {
        if(this.year < other.year)
            return -1;
        if(this.year > other.year)
            return 1;
        if(this.month < other.month)
            return -1;
        if(this.month > other.month)
            return 1;
        if(this.day < other.day)
            return -1;
        if(this.day > other.day)
            return 1;
        return 0;
    }
}
