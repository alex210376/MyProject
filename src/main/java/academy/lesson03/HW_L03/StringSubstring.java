package academy.lesson03.HW_L03;

import java.util.Scanner;

public class StringSubstring {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Ввод строки
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        //Ввод подстроки, количество вхождений которой в строку, необходимо вывести
        System.out.println("Введите подстроку: ");
        String substr = scanner.nextLine();
        //Вывод количество вхождений путем вызова метода count
        System.out.println("Количество вхождений подстроки \""+substr+"\": "+count(str, substr));
    }
    /*Метод подсчета количества вхождений подстроки путем разбиения строки на элементы
    с последующим подсчетом элементов, которое и равно искомому количеству минус один*/
    public static int count(String str, String substr){
        if(str.endsWith(substr)){
            return str.split(substr).length; /*Если строка оканчивается на искомую подстроку,
            то возвращается количество элементов*/
        }
            else return str.split(substr).length-1; // Иначе возвращается количество элементов минус 1
    }
}
