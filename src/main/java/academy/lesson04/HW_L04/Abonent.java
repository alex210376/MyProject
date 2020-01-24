package academy.lesson04.HW_L04;

public class Abonent {
    private long id;          // Идентификатор абонента
    private String firstName; // Имя абонета
    private String lastName;  // Фамилия абонента
    private int age;     // Возраст абонента
    private String gender; // Пол абонента'm' - male, 'f' - female

    // Конструктор, создающий объект со всеми заполненными полями
    public Abonent(long id, String firstName, String lastName, int age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    // Конструктор, создающий объект со всеми заполненными полями, кроме идентификатора
    public Abonent(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    // Конструктор, создающий объект со значениями по умолчанию
    public Abonent() {

    }
    // Методы для записи и чтения полей объектов класса Abonent
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Метод вывода на консоль данных абонента
    public void printAbon (){
        System.out.println("Идентификатор абонента: " + this.id);
        System.out.println("Имя абонента: " + this.firstName);
        System.out.println("Фамилия абонента: " + this.lastName);
        System.out.println("Возраст абонента: " + this.age);
        System.out.println("Пол абонента: " + this.gender);
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    //Метод сравнивающий поля двух объектов Abonent
    public boolean isEquals (Abonent abon){
        boolean a = this.id==abon.id;
        boolean b = this.firstName.equals(abon.firstName);
        boolean c = this.lastName.equals(abon.lastName);
        boolean d = this.age==abon.age;
        boolean e = this.gender==abon.gender;
          if (a & b & c & d & e) return true;
              else return false;
    }


}
