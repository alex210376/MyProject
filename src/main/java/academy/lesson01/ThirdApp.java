package academy.lesson01;

import java.util.Scanner;

public class ThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.println("Введите отчество: ");
        String lastName_2 = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Введите пол: ");
        String male = scanner.next();

        System.out.println("Введите номер: ");
        int num = scanner.nextInt();

        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Отчество: " + lastName_2);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + male);
        System.out.println("Номер: " + num);
    }

}
