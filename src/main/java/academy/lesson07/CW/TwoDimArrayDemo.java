package academy.lesson07.CW;

import static academy.lesson06.Gender.*;
import static java.util.Arrays.deepToString;

public class TwoDimArrayDemo {
    public static void main(String[] args){
    Object[][] array = {
            {"Peter", 23, MALE},
            {12, 34, 56, "Hello", "world"},
            {MALE, FEMALE, 34, "!!!"}
    };
    for (int row = 0; row < array.length; row++) {
        System.out.println();
        for (int col = 0; col < array[row].length; col++) {
            System.out.print(array[row][col] + " ");
        }
    }

    System.out.println("***");
        System.out.println(deepToString(array));
}
}
