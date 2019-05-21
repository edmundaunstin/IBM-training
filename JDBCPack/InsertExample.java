/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCPack;

import java.sql.*;
import javax.sql.*;

public class InsertExample {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="hr";
        String password="hr";
        Connection con=DriverManager.getConnection(url,user,password);
        
        Statement stat=con.createStatement();
        
        int empId,sal,comId,magId,depId;
        String empName,email,phone,jobId;
        Date hire;
        
        String q="INSERT INTO employees(EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID) VALUES("+917+",'SUGNANA','sugnana@gmail.com','19-May-19','SH_CLERK')";
        
        stat.executeUpdate(q);
        con.close();
        
    }
}

