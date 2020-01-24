package academy.lesson12.HW.model;

import java.sql.*;
import java.util.Objects;

public class Subscriber implements Comparable {
        private long subscriberId;  // уникальный идентификатор
        private String firstName;   // имя
        private String lastName;  	// фамилия
        private int age; 			// возраст
        private String gender;      // пол

    public Subscriber(long subscriberId, String firstName, String lastName, int age, String gender) {
        this.subscriberId = subscriberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }


    public long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
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




    public void insertSubscriber() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mobile?user=root&password=root&serverTimezone=UTC");
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO subscriber (id, firstname, lastname, age, gender) VALUES (?,?,?,?,?)");

        statement.setLong(1,this.getSubscriberId());
                statement.setString(2,this.getFirstName());
                statement.setString(3, this.getLastName());
                statement.setInt(4, this.getAge());
                statement.setString(5, this.getGender());
        System.out.println(this.getFirstName());
        System.out.println(this.getLastName());
                statement.execute();

        statement.close();
        connection.close();
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriberId=" + subscriberId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;
        Subscriber that = (Subscriber) o;
        return subscriberId == that.subscriberId &&
                age == that.age &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriberId, firstName, lastName, age, gender);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
