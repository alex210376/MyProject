package academy.lesson02;

import java.util.Scanner;

public class DivisionResult {
    public static void main(String args[]) {
        int n1, n2;
        if (args.length == 2) {
            //System.out.println("первое число= " + args[0]);
            //System.out.println("второе число= " + args[1]);
            n1 = Integer.parseInt (args[0]);
            n2 = Integer.parseInt (args[1]);
        } else {
            Scanner scanner = new Scanner(System.in);
            //Ввод числа 1
            System.out.println("Введите первое число: ");
            n1 = scanner.nextInt();
            //Ввод числа 2
            System.out.println("Введите второе число: ");
            n2 = scanner.nextInt();
        }
        System.out.println("Первое число: " + n1);
        System.out.println("Второе число: " + n2);
        System.out.println("Результат целочисленного деления: " + n1/n2);
        System.out.println("Остаток от деления: " + n1%n2);
    }
}