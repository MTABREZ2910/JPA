package com.jdbc_practice.JDBC.jdbcPracrtice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task2 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		String url=
				"jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="Microcaredb3";
		String query=
				"select * from flipkart where order_id='Od202'";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.print(rs.getString("order_id")+" ");
			System.out.print(rs.getDate("order_date")+" ");
			System.out.print(rs.getString("first_name")+" ");
			System.out.print(rs.getLong("mobile_number")+" ");
			System.out.println();
			
			
		}
		st.close();
		con.close();

	}

}
