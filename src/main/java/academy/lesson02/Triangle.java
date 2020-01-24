package academy.lesson02;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер треугольника: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size+1; i++) {
            System.out.println();
               for (int k = 0; k < i; k++)
                   System.out.print("*");
        }
    }
}
