package academy.lesson09.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Helen");
        names.add("Peter");
        names.add("Bill");
        names.add("Николай");
        names.add("Алексей");
        names.add("Евгений");

        System.out.println(names);

        for(int i=0; i< names.size(); i++)
            System.out.println(names.get(i));

        System.out.println(names.contains("Peter"));
        Collections.sort(names);
        System.out.println(names);
        names.remove("Евгений");  System.out.println(names);

        //List из массива
        String[] brands = {"BMW", "Lexus", "Apple"};
        List<String> listBrands = new ArrayList<>(Arrays.asList(brands));
        System.out.println(listBrands);
        //Массив из List
        String[] brandsFromList = listBrands.toArray(new String[0]);
        System.out.println(Arrays.toString(brandsFromList));
    }
}
