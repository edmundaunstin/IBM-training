
package JDBCPack;

import java.sql.*;
import javax.sql.*;

public class DeleteExample {
    public static void main(String[] args) throws Exception {
     
        Class.forName("oracle.jdbc.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="hr";
        String password="hr";
        
        Connection con=DriverManager.getConnection(url,user,password);
        
        Statement stmt=con.createStatement();
        
        String q="delete from employees where employee_id=140";
        
        stmt.executeUpdate(q);
        
        con.close();
        System.out.println("SUCCESSFULL.....");
    }
}
