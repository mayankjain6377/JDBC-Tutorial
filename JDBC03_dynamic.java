import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC03_dynamic {
    public static void main(String[] args) {
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoJDBC","root","Mayankjain@6377");
    String q="insert into images (pic) values(?)";
    PreparedStatement ptsmt=con.prepareStatement(q);

    FileInputStream fis=new FileInputStream("myImage.jpg");
    ptsmt.setBinaryStream(1,fis,fis.available());
ptsmt.executeUpdate();
    System.out.println("image successfully inserted at database");
con.close();
}catch(Exception e)
{
    System.out.println("error is :"+e);
}

    }
}
