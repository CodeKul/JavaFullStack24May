package jdbc;

import java.sql.*;

public class JdbcSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FullStack4May","root","password");
            Statement statement = connection.createStatement();

            String select= "select * from student";
            ResultSet rs = statement.executeQuery(select);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println(id+" "+name+" "+address);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
