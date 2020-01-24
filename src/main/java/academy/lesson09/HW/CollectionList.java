package academy.lesson09.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        String arrayNames[] = {"Peter", "Helen", "Andrew", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};
        List<String> listNames = new ArrayList<>(Arrays.asList(arrayNames));
        System.out.println(listNames);

        listNames.add("Philip");
        listNames.add("Joseph");
        listNames.add("Leon");
        System.out.println(listNames);

        //Удалить из списка имена: Veronica, Leonid
        listNames.remove("Veronica");
        listNames.remove("Leonid");
        System.out.println(listNames);

        //Поменять имя Helen на Elizabet
        listNames.set(1, "Elizabet");
        System.out.println(listNames);

        //Отсортировать имена по алфавиту
        Collections.sort(listNames);
        System.out.println(listNames);

        //Отсортировать имена в обратном порядке
        Collections.reverse(listNames);
        System.out.println(listNames);

        //Перевести все первые символы в верхний регистр

    }
}
