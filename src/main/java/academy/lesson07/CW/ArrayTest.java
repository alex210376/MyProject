package academy.lesson07.CW;

import static academy.lesson06.Gender.*;

public class ArrayTest {
    public static void main(String[] args){
        Object object[] = {"Peter", MALE, 23};
        System.out.println("Имя: " + object[0] + ", пол: " + object[1] + ", возраст: " + object[2]);

        Object listOfPeople[][] = new Object [4][3];
        listOfPeople[0] = object;
        listOfPeople[1] = new Object []{"Boris", MALE, 26};
        listOfPeople[2] = new Object []{"Helen", FEMALE, 43};
        listOfPeople[3] = new Object []{"Ivan", MALE, 88};

        System.out.println("*******************************");

        for (int i=0; i< listOfPeople.length; i++)
            System.out.println("Имя: " +  listOfPeople[i][0] + "," +
                    " пол: " +  listOfPeople[i][1] +
                    ", возраст: " +  listOfPeople[i][2]);
    }
}
