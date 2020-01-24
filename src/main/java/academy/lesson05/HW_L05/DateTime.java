package academy.lesson05.HW_L05;

public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime() {
        super();
        this.hour = 00;
        this.minute = 00;
        this.second = 00;
    }

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void set(int day, int month, int year, int hour, int minute, int second) {
        super.set(day, month, year);
        if(0 <= hour && hour <= 23)
            this.hour = hour; else System.out.println("Неверное значение часа");
        if(0 <= minute && minute <= 59)
            this.minute = minute; else System.out.println("Неверное значение минуты");
        if(0 <= second && second <= 59)
            this.second = second; else System.out.println("Неверное значение секунды");
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void printDateLine(){
        System.out.println(this.getDay()+"."+this.getMonth()+"."+this.getYear()+" "+this.hour+"."+this.minute+"."+this.second);
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear() +
                ", hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
