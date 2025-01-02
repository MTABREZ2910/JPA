package com.jdbc_practice.JDBC.jdbcPracrtice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task4 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		String url=
				"jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="Microcaredb3";
		String query=
				"delete from flipkart where order_id='Od202'";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeQuery(query);
		
		System.out.println("Row deleted");
		
		st.close();
		con.close();
}
}
