package academy.lesson12.HW.dao.jdbc;

import academy.lesson12.HW.model.Subscriber;
import java.sql.*;
import java.io.*;
import java.util. *;

public class SubscriberDaoImpl {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        // Чтение из файлов имен и фамилий
        String inPathNameMale = "d:/QA_Java/Files for lesson 11/мужские имена.txt";
        String inPathSurnameMale = "d:/QA_Java/Files for lesson 11/мужские фамилии.txt";
        BufferedReader brName = new BufferedReader(new FileReader(inPathNameMale));
        BufferedReader brSurname = new BufferedReader(new FileReader(inPathSurnameMale));
        String inPathNameFemale = "d:/QA_Java/Files for lesson 11/женские имена.txt";
        String inPathSurnameFemale = "d:/QA_Java/Files for lesson 11/женские фамилии.txt";
        BufferedReader brNameF = new BufferedReader(new FileReader(inPathNameFemale));
        BufferedReader brSurnameF = new BufferedReader(new FileReader(inPathSurnameFemale));

        //Создание коллекция для имен и фамилий
        List<String> nameMale = new ArrayList<>();
        List<String> surnameMale = new ArrayList<>();
        List<String> nameFemale = new ArrayList<>();
        List<String> surnameFemale = new ArrayList<>();

        //Наполнение коллекций имен и фамилий из файлов
        String nextName;
        while((nextName = brName.readLine())!=null) {
            nameMale.add(nextName);
        }
        while((nextName = brSurname.readLine())!=null) {
            surnameMale.add(nextName);
        }
        while((nextName = brNameF.readLine())!=null) {
            nameFemale.add(nextName);
        }
        while((nextName = brSurnameF.readLine())!=null) {
            surnameFemale.add(nextName);
        }
        brName.close();
        brSurname.close();

        //Вывод размера коллекций имен и фамилий
        System.out.println("Количество мужских имен: "+nameMale.size());
        System.out.println("Количество мужских фамилий: "+surnameMale.size());
        System.out.println("Количество женских имен: "+nameFemale.size());
        System.out.println("Количество женских фамилий: "+surnameFemale.size());

        //Создание коллекции типа "Абонент"
        List<Subscriber> subscribers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            Integer nextInt = 10 + random.nextInt(50);
            if (random.nextBoolean()){
                subscribers.add(new Subscriber(i, surnameMale.get(i), nameMale.get(i), nextInt, "MALE"));
            }
            else{
                subscribers.add(new Subscriber(i, surnameFemale.get(i), nameFemale.get(i), nextInt, "FEMALE"));
            }
        }


        //Запись коллекции Абонент в таблицу "subscriber" схемы "mobile"
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mobile?user=root&password=root&serverTimezone=UTC");
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO subscriber VALUES(?,?,?,?,?)");

        for(int i=0; i < subscribers.size(); i++) {
                statement.setLong(1, subscribers.get(i).getSubscriberId());
                statement.setString(2, subscribers.get(i).getFirstName());
                statement.setString(3, subscribers.get(i).getLastName());
                statement.setInt(4, subscribers.get(i).getAge());
                statement.setString(5, subscribers.get(i).getGender());
                statement.execute();
        }
        statement.close();
        connection.close();

        subscribers.get(10).setFirstName("Алексей");
        subscribers.get(10).setLastName("Алексеев");
        subscribers.get(10).setAge(33);
        subscribers.get(10).setGender("M");

        System.out.println(subscribers.get(10));
        subscribers.get(10).insertSubscriber();

    }
}
