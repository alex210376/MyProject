package academy.lesson02;

import java.util.Scanner;

//Расчет веса на Луне
public class WeightOnMoon {
    public static void main(String[] args) {
        int mg = 17; // Процент силы тяжести на Луне относительно Земли
        Scanner scanner = new Scanner(System.in);

        //Ввод веса
        System.out.println("Введите вес: ");
        double we = scanner.nextInt();

        //Расчет веса на Луне
        double wm = (we*mg)/100;

        //Вывод рассчитанных данных
        System.out.println("Вес на Земле: " + we);
        System.out.println("Вес на Луне: " + wm);
    }

}
