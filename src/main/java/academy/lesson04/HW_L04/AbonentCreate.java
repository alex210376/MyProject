package academy.lesson04.HW_L04;

public class AbonentCreate {
    public static void main(String[] args) {
        //Создание четырех объектов класса Abonent с использованием трех конструкторов
        Abonent abonent0 = new Abonent(001, "Tobias", "Carling", 35, "m");
        Abonent abonent1 = new Abonent(002, "Elizabeth", "Dahlen", 25, "f");
        Abonent abonent2 = new Abonent("Bruce", "Voss", 40, "m");
        Abonent abonent3 = new Abonent();

        //Вывод данных абонентов на консоль
        System.out.println("Данные абонента 1");
        abonent0.printAbon ();System.out.println();
        System.out.println("Данные абонента 2");
        abonent1.printAbon ();System.out.println();
        System.out.println("Данные абонента 3");
        abonent2.printAbon ();System.out.println();
        System.out.println("Данные абонента 4");
        abonent3.printAbon ();System.out.println();

        //Запись значений в поля объекта abonent3
        abonent3.setId(004);
        abonent3.setFirstName("Danial");
        abonent3.setLastName("Silverburg");
        abonent3.setAge(33);
        abonent3.setGender("m");
        System.out.println("Данные абонента 4 после ввода значений");
        abonent3.printAbon ();System.out.println();

        //Сравнение данных абонентов с использованием методов equals и Abonent.isEquals
        boolean b;
        b = abonent0.equals(abonent1);
        System.out.println("Результат сравнения методом equals: " + b);

        b = abonent0.isEquals(abonent1);
        System.out.println("Результат сравнения методом isEquals: " + b);

        abonent0 = abonent1;

        b = abonent0.equals(abonent1);
        System.out.println("Результат сравнения методом equals: " + b);

        b = abonent0.isEquals(abonent1);
        System.out.println("Результат сравнения методом isEquals: " + b);

    }

}
