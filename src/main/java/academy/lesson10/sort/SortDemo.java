package academy.lesson10.sort;

import academy.lesson06.*;
import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(3L, "Sidor", Gender.MALE));
        persons.add(new Person(4L, "Mihail", Gender.MALE));
        persons.add(new Person(1L, "Peter", Gender.MALE));
        persons.add(new Person(2L, "Helen", Gender.FEMALE));
        persons.add(new Person(5L, "Elizabet", Gender.FEMALE));


       //Сортировка по умолчанию (по id по возрастанию)
        Collections.sort(persons);
        System.out.println(persons);

        // 1 спсособ Сортировка по id по убыванию
        persons.sort(new ComparatorImpl());
        System.out.println(persons);

        // 2 спсособ Сортировка по id по убыванию
        persons.sort((p1,p2) -> {

            if (p1.getId() < p2.getId())
                return 1;
            if (p2.getId() < p1.getId())
                return -1;
            return 0;
        });
        System.out.println(persons);

        // по алфавиту
        System.out.println("По алфавиту");
        persons.sort( (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println(persons);

        // по алфавиту обратный порядок
        System.out.println("По алфавиту обратный порядок");
        persons.sort(Comparator.comparing(Person::getFirstName));
        System.out.println(persons);





    }
}
