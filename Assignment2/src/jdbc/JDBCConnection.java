package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String password = "Rechal@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Error:" + e);
        }
    }
}



