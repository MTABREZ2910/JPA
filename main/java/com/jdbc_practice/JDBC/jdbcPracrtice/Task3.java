package com.jdbc_practice.JDBC.jdbcPracrtice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task3 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		String url=
				"jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="Microcaredb3";
		String query=
				"select * from flipkart where "
				+ "extract(month from order_date) "
				+ "between ? and ? order by "
				+ "extract(month from order_date) desc ";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,1);
		ps.setInt(2, 3);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("order_id")+" ");
			System.out.print(rs.getDate("order_date")+" ");
			System.out.print(rs.getString("first_name")+" ");
			System.out.print(rs.getLong("mobile_number")+" ");
			System.out.println();
			
			
		}
		ps.close();
		con.close();

	}

}
