
package JDBCPack;

import java.sql.*;
import javax.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="hr";
        String password="hr";
        
        Connection con=DriverManager.getConnection(url,user,password);
        
        String q="Update employees SET salary=? , commission_pct=? where employee_id=?";
        
        PreparedStatement ps=con.prepareStatement(q);
        
        ps.setDouble(1, 3000.0);
        ps.setDouble(2, .24);
        ps.setInt(3, 100);
        
        ps.executeUpdate();
        
        con.close();
        
    }
}
