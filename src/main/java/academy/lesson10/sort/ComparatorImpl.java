package academy.lesson10.sort;

import academy.lesson06.Person;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {

        if (p1.getId() < p2.getId())
        return 1;
        if (p2.getId() < p1.getId())
            return -1;
        return 0;
    }
}
