package academy.lesson09.HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<>();
        persons.put("User01","qwerty");
        persons.put("User02","qqwerty");
        persons.put("User03","qwwerty");
        persons.put("User04","qweertyy");
        persons.put("User05","qwerrty");
        persons.put("User06","qwerrrrty");
        int passLength = 8;
        System.out.println("Список пользователей, длина пароля которых больше " + passLength + " символов:");
        printPersons(persons, passLength);

    }

    public static void printPersons(Map<String,String> persons, int passLength){
        Set<Map.Entry<String,String>> set = persons.entrySet();
        for(Map.Entry<String,String> m :set){
            String s = m.getValue();
            if(s.length()>passLength) {
                System.out.println("Логин: "+ m.getKey());
                System.out.println("Пароль: "+ m.getValue());
                System.out.println("****************");

            }
        }
    }
}

