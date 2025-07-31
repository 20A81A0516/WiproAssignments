package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCStudentDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb"; 
        String user = "root";       
        String password = "Rechal@123";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");

            stmt = conn.createStatement();
            String sql = "SELECT * FROM Student";
            rs = stmt.executeQuery(sql);
            
            System.out.println("\nStudent Records:");
            System.out.println("ID\tName\t\tAge\tCourse\t\t\tMarks");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                float marks = rs.getFloat("marks");

                System.out.printf("%d\t%-10s\t%d\t%-20s\t%.2f\n", id, name, age, course, marks);
            }

        } catch (Exception e) {
            System.out.println("Database Error: " + e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("\nConnection closed.");
            } catch (Exception ex) {
                System.out.println("Error closing resources: " + ex);
            }
        }
    }
}



/*
Connected to the database.

Student Records:
ID	Name		Age	Course			Marks
1	Rachel    	20	Computer Science    	88.50
2	John      	21	Mathematics         	76.00
3	Alice     	22	Physics             	91.20

Connection closed.
*/
