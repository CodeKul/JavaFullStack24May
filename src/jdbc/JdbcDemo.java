package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FullStack4May","root","password");
            Statement statement = connection.createStatement();

            String insert = "insert into student(id,name,address) values(2,'Akash','Nagpur')";
            String update = "update student set address = 'sangli' where name = 'Akash'";
            String delete = "delete from student where id =2";

            int i = statement.executeUpdate(insert);
            System.out.println("inserting record->"+i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
