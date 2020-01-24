package academy.lesson03.HW_L03;

import java.util.Scanner;

public class StringSubstringReg {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Ввод строки
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        deletedigits (str); // Вызов метода удаления цифр и вывода результатов
    }

    public static void deletedigits (String str) {
        System.out.println("Строка после удаления цифр: " + str.replaceAll("[\\d]", ""));
        System.out.println("Удаленные символы: " + str.replaceAll("[^\\d]", ""));
    }
}