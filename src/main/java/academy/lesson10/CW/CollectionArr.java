package academy.lesson10.CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionArr {
        public static void main(String[] args) {
            List<String> nameList = new ArrayList<>();

            nameList.add("Philip");
            nameList.add("Joseph");
            nameList.add("Andrew");
            nameList.add("yakov");
            nameList.add("nataly");
            nameList.add("ivan");
            nameList.add(3, "ашот");
            System.out.println(nameList);

           for (int i =0; i< nameList.size(); i++){
                String name = nameList.get(i);
                nameList.set(i, firstToUpperCase(name));
            }

            Collections.sort(nameList);
            System.out.println(nameList);
        }

        private static String firstToUpperCase(String value){
            char ch1 = value.charAt(0);
            ch1 = Character.toUpperCase(ch1);
            String lastLetters = value.substring(1);
            String modifiedName = ch1 + lastLetters;
            return modifiedName;
        }
}