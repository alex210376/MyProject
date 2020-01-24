package academy.lesson08.CW;

public class Test2 {
    public static void main(String[] args) {
        Object[][] array2D = {{"Ivan", 34}, {"Kolya", 56}, {"Boris", 18}, {"Kolya", 18}, {"Peter", 15}, {"Helen", 45}, {"Kolya", 32}};
        for (int i = 0; i < array2D.length; i++)
            System.out.println(array2D[i][0]);
        for (Object[] pair : array2D)
            System.out.println(pair[1]);

    }
}
