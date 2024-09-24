
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
  private static Connection con;
        public static Connection getConnection() {
            try {
                if (con == null) {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                     con= DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoJDBC","root","Mayankjain@6377");

                     }



            } catch (Exception e) {
                System.out.println("error handle");

            }
            return con;
        }
    }

