package academy.lesson02;

public class Array {
    public static void main(String args[]){

        int ar[] = {45, 2, -3, 4, 5, 6, 7, 8, 126, 10};

        System.out.println("Размер массива: " + ar.length);

        // Вывод при помощи цикла for
        System.out.print("[");
        for (int i = 0; i < ar.length; i++)
            if (i==9)
                System.out.print(ar[i]);
            else
                System.out.print(ar[i] + ", ");
        System.out.print("]");

        // Вывод при помощи цикла while
        System.out.println();
        System.out.print("[");
        int i = 0;
        while (i<ar.length){
            if (i==9)
                System.out.print(ar[i]);
            else
                System.out.print(ar[i] + ", ");
            i++;}
        System.out.print("]");
    }
}
