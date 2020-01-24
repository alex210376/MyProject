package academy.lesson08.HW;

import academy.lesson05.HW_L05.Date;

public class CorrectDate extends Date {

    public CorrectDate(int day, int month, int year) throws IllegalDateException{
        super(day, month, year);
        if ((0 < day && day <= 31) && (0 < month && month <= 12) && (0 < year && year <= 2049))
                {
                    setDay(day);
                    setMonth(month);
                    setYear(year);
                }
        else
            throw  new IllegalDateException("Неверная дата: "+day+"."+month+"."+year);
            }
        }

