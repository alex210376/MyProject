package academy.lesson01;

import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
       System.out.println("Hello World");
       Scanner scanner = new Scanner(System.in);

       System.out.println("Введите имя: ");
       String firstName = scanner.nextLine();

        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Имя %s, фамилия %s, возраст %d",
                firstName, lastName, age));
        }

}
