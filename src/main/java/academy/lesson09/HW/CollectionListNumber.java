package academy.lesson09.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionListNumber {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        //Наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
        for (int i=0; i<20; i++)
            listNumber.add(0 + (int) (Math.random() * 100));
        System.out.println(listNumber);

        //Вывести минимальное и максимально значения
        System.out.println("Максимально число: " + Collections.max(listNumber));
        System.out.println("Минимальное число: " + Collections.min(listNumber));

        //Вывести сумму чисел на экран
        int sum=0;
        for(int v: listNumber)
            sum += v;
        System.out.println("Сумма чисел = " + sum);
        }
    }

