import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC05_SelectDataFromMySQL {
    public static void main(String[] args) {
try{
    Connection con=ConnectionProvider.getConnection();
    String q="select * from table10";
    Statement stmt=con.createStatement();
    ResultSet set=stmt.executeQuery(q);
    while(set.next()){
        int id=set.getInt(1);
        String teacher_name=set.getString(2);
        String  teacher_city=set.getString(3);
        System.out.println(id+ ":"+teacher_name+ ":"+teacher_city);
    }
}
 catch(Exception e ){
    System.out.println("errror occur"+e);
}

    }
}
