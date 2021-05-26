/*
   18. Write a program to generate SQLException.
   -----------------------------------------------
 */

package JALA_Technologies_18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class ConnTestApproach2 {
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String USER = "scott";
	static final String PASS = "tiger";
	static final String QUERY = "SELECT empno,ename,job FROM emp";

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORC", "scott", "tiger");
		if (con == null)
			System.out.println("Connection is not estabilshed");
		else
			System.out.println("Connection is estabilshed");
	}
}