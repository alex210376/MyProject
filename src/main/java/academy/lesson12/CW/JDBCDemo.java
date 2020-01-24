package academy.lesson12.CW;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/subscriber?user=root&password=root&serverTimezone=UTC");
        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("SELECT * FROM abonent");
        while (rs.next()) { // указатель на первую строку данных
            int id = rs.getInt("id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String gender = rs.getString("gender");
            int age = rs.getInt("age");
            System.out.println("id: " + id + ", firstName: " + firstName + ", lastName: " + lastName
            + ", gender:" + gender + ", age:" + age);
        }

        statement.executeUpdate("INSERT INTO subscriber VALUES(8, 'Наливайченко', 'Петр', 'm', 40)");
        //statement.executeUpdate("UPDATE abonent SET first_name='Петр', last_name='Наливайченко' WHERE id=8");
        //statement.executeUpdate("delete from abonent WHERE id=8");

        rs.close();
    }
}
