import java.io.*;
import java.sql.*;
import java.util.*;

public class TestSQL{
  public static void main( String[] args ){
     Connection  conn = null;
      try {
          Class.forName ("com.mysql.jdbc.Driver").newInstance ();
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
          if (conn == null){
              System.err.println( "Returning NULL!!!" );
          }
          //создаем statement для запроса
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM phonebook");
          while(rs.next()){
              System.out.println(rs.getString("name"));
          }
          stmt.close();
          
      } catch(Exception e) {
          e.printStackTrace();
      }
  }
}                                                                         