import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class practice1 {
    public static void main(String[] args) {
        int i=1;
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoJDBC","root","Mayankjain@6377");
//   String query="insert into table10 (teacher_name ,teacher_city) values ()";
   String query="select * from table10;";
    Statement stmt=con.createStatement();
   ResultSet set= stmt.executeQuery(query);
   while(set.next()){

      int id= set.getInt("teacher_id");
      String name=set.getString("teacher_name");
      String city=set.getString("teacher_city");
       System.out.println( (i)+ " employee "+" data");
       i++;
      System.out.println("ID : "+id);
       System.out.println("Name : "+name);
       System.out.println("city : "+city);
       System.out.println("=====================");
   }
   con.close();
}catch (Exception e)
{
    System.out.println(  e.getMessage());
}    }
}
