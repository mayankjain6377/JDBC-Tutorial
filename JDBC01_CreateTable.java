import java.sql.*;

public class JDBC01_CreateTable {
    public static void main(String[] args) {

        //---------1------------
//try {
//    //load the driver
//    Class.forName("com.mysql.cj.jdbc.Driver");
//    //create a connection
//    String URL="jdbc:mysql://localhost:3306/DemoJDBC";
//    String Username="root";
//    String password ="Mayankjain@6377";
//
//    Connection con=DriverManager.getConnection(URL,Username,password);
//    if(con.isClosed()){
//        System.out.println("yes");
//    }
//    else
//        System.out.println("no");
//}
//catch(Exception e){
//    System.out.println("error handled" +e);
////    e.printStackTrace();
//}

    //-------------2------------
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/DemoJDBC";
            String Username = "root";
            String password = "Mayankjain@6377";
            Connection con = DriverManager.getConnection(URL, Username, password);
            String q = "create table table1(student_id int primary key auto_increment, student_name varchar(20) not null, student_city varchar(20))";
            Statement stmt=con.createStatement();
stmt.executeUpdate(q);

            System.out.println("tabel is created ");
       con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}






