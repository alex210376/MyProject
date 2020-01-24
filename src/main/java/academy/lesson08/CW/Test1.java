package academy.lesson08.CW;

public class Test1 {
    public static void main(String[] args) {
        Object array[] = {"Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris", 15};
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Number)
                System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof String)
                System.out.println(array[i]);
        }
    }
}
