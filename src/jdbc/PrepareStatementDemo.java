package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareStatementDemo {

    public static void main(String[] args) throws Exception{
        int id;
        String name;
        String address;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value for id");
        id = scanner.nextInt();
        System.out.println("enter value for Name");
        name = scanner.next();
        System.out.println("enter value for Address");
        address = scanner.next();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FullStack4May","root","password");
        String insert = "insert into student(id,name,address) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,address);

        int i = preparedStatement.executeUpdate();

        System.out.println("row inserted"+i);

    }
}
