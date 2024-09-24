import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC02_Insert {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/DemoJDBC";
            String Username = "root";
            String password = "Mayankjain@6377";
            Connection con = DriverManager.getConnection(URL, Username, password);
            String q = "create table table10(teacher_id int primary key auto_increment, teacher_name varchar(20) not null, teacher_city varchar(20))";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            q="insert into table10(teacher_name,teacher_city) values (?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,"Akash jain");
            pstmt.setString(2,"Pali");
            pstmt.executeUpdate();
            System.out.println("itemis inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }


    }
}
