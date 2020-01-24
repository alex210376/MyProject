package academy.lesson08.HW;

import academy.lesson05.HW_L05.DateTime;

public class CorrectTime extends DateTime {

    public CorrectTime(int hour, int minute, int second) throws IllegalDateException {
        super(hour, minute, second);
        if ((0 <= hour && hour <= 23) && (0 <= minute && minute <= 59) && (0 <= second && second <= 59))
        {
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        }
        else
            throw  new IllegalDateException("Неверное время: "+hour+":"+minute+":"+second);
    }

    public String getFormattedTime() {
        return String.format("%02d.%02d.%02d", getHour(), getMinute(), getSecond());
    }
}
