package academy.lesson03;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        //Создание массива
        String[] all = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};
        //Создание массива путем копирования первых 4 элементов исходного массива
        String[] group1 = Arrays.copyOf(all, 4);
        //Создание массива путем копирования элементов от 5-го и до 8-го
        String[] group2 = Arrays.copyOfRange(all, 4, 8);

        //System.out.println(Arrays.toString(all));
        //System.out.println(Arrays.toString(group1));
        //System.out.println(Arrays.toString(group2));
        //System.out.println(Arrays.equals(group1, group2));

        // Выведем на консоль
        print(all, group1, group2);
        // сравнить группы
        checkGroups(group1, group2);
    }
    public static void print(String[] all, String[] group1, String[] group2) {
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));
    }

    public static void checkGroups(String[] group1, String[] group2) {
        Arrays.sort(group1);
        Arrays.sort(group2);

        System.out.println(group1 == group2); // так не работает
        System.out.println("Group1 and Group2 are equal - " + Arrays.equals(group1, group2));
    }

}

