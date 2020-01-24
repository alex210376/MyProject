package academy.lesson03.HW_L03;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLetter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
         //Ввод строки
        System.out.println("Введите строку для анализа: ");
        String str = scanner.nextLine();
        System.out.println("Введите букву, на которую должно начинаться слово: ");
        String ltr = scanner.next();
        output(str, ltr); //Вывод результатов
    }
    // Метод для разделения строки на слова, анализа на наличие буквы и вывода результатов
    public static void output (String str, String ltr){
        int k=0;
        String[] str1 = str.split(" ");
        System.out.println("Массив слов: " + Arrays.toString(str1));
        for (int i = 0; i < str1.length; i++) {
             if(str1[i].startsWith(ltr)){
                 System.out.println(str1[i]);
                 k++; // Подсчет количества слов
             }
        }
        System.out.println("Количество строк нач на букву " + ltr + ": " + k);
      }
}


