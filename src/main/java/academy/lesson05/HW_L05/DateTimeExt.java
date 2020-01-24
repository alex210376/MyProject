package academy.lesson05.HW_L05;

public class DateTimeExt extends DateTime {
    private int ms;

    public DateTimeExt() {
        super();
        ms = 10;
    }
    public DateTimeExt(int day, int month, int year, int hour, int minute, int second, int ms) {
        super(day, month, year, hour, minute, second);
        this.ms = ms;
    }
    public void set(int day, int month, int year, int hour, int minute, int second, int ms) {
        super.set(day, month, year, hour, minute, second);
        if(0 <= ms && ms <= 999)
            this.ms = ms;
        else System.out.println("Неверное значение миллисекунды");
    }
    public void printDateLine(){
        System.out.println(this.getDay()+"."+this.getMonth()+"."+this.getYear()+" "+this.getHour()
        +"."+this.getMinute()+"."+this.getSecond()+"."+this.ms);
    }
    @Override
    public String toString() {
        return "DateTimeExt{" +
                "day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear() +
                ", hour=" + getHour() +
                ", minute=" + getMinute() +
                ", second=" + getSecond() +
                ", ms=" + ms +
                '}';
    }

}
