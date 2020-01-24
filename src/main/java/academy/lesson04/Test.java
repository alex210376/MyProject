package academy.lesson04;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {

        String rawData = "petrov,Ivanov ,KiRill, Helen ";
        //[Petrov, Ivanov, Kirill, Helen]

        String[] str1 = rawData.split(",");
        System.out.println(Arrays.toString(str1));
        for (int i=0; i<str1.length; i++){
            str1[i] = str1[i].trim();
            str1[i] = str1[i].toLowerCase();
            char ch1 = str1[i].charAt(0);
            ch1 = Character.toUpperCase(ch1);
            String lastletters = str1[i].substring(1);
            str1[i] = ch1 + lastletters;
            System.out.println(str1[i]);
        }
    }
}

