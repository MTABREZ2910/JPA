package com.jdbc_practice.JDBC.jdbcPracrtice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		String url=
				"jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="Microcaredb3";
		String query=
				"select * from emp where emp_name='all' order by emp_id";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.print(rs.getInt("emp_id")+" ");
			System.out.print(rs.getString("emp_name")+" ");
			System.out.print(rs.getInt("emp_age")+" ");
			System.out.print(rs.getInt("emp_salary")+" ");
			System.out.println();
		}
		st.close();
		con.close();		
	}

}
