
package JDBCPack;

import java.sql.*;
import javax.sql.*;
public class DatabaseExample {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="hr";
        String password="hr";
        Connection con=DriverManager.getConnection(url,user,password);
        
        Statement stat=con.createStatement();
        
        String q="SELECT * FROM employees";
        
        ResultSet rs = stat.executeQuery(q);
        
        int empId;
        String empName;
        while(rs.next()){
            empId=rs.getInt("EMPLOYEE_ID");
            empName=rs.getString("FIRST_NAME")+" "+rs.getString("LAST_NAME");
            System.out.println("EMPLOYEE ID :"+ empId);
            System.out.println("EMPLOYEE NAME :"+ empName);
        }
        
        System.out.println("Successfull......");
    }
}
