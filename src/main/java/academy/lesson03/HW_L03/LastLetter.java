package academy.lesson03.HW_L03;

import java.util.Arrays;
import java.util.Scanner;

public class LastLetter {
   public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
            //Ввод строки
            System.out.println("Введите строку для анализа: ");
            String str = scanner.nextLine();
            System.out.println("Введите подстроку, на которую должно заканчиваться слово: ");
            String subst = scanner.next();

            String[] str1 = split1(str); //Вызов метода деления строки на слова

            output(str1, subst); //Вывод результатов
   }
    // Метод деления строки на слова
    public static String[] split1(String str){
       String[] str2 = str.split(" ");
       System.out.println("Массив слов: " + Arrays.toString(str2));
       return str2;
    }
    // Метод анализа на наличие подстроки и вывод результатов
    public static void output (String[] str1, String subst){
            int k=0;
            for (int i = 0; i < str1.length; i++) {
                 if(str1[i].endsWith(subst)){
                 System.out.println(str1[i]);
                 k++; // Подсчет количества слов
                }
            }
            System.out.println("Количество строк заканчивающихся на " + subst + ": " + k);
    }
    }
