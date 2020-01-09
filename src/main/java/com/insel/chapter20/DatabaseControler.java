package com.insel.chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseControler {
	public static void main(String [] args) throws SQLException {
		String url = "jdbc:h2:file:~/Desktop/Experiments/JavaDB";
		try(Connection con = DriverManager.getConnection(url, "sa", ""); 
				Statement stmt = con.createStatement();) {
			
			// If table dosen't exist, create it
			if(!con.getMetaData().getTables(null, null, "CUSTOMER", null).next()) {
				String[] sqlStmts = {
						"CREATE TABLE CUSTOMER(ID INTEGER NOT NULL PRIMARY KEY, FIRSTNAME VARCHAR(255),"
						+ " LASTNAME VARCHAR(255), STREET VARCHAR(255), CITY VARCHAR(255))",
						"INSERT INTO CUSTOMER VALUES(0, 'Laura', 'Steel', '429 Seventh Av.', 'Dallas')"};
				for(String sql : sqlStmts) {
					stmt.execute(sql);
				}
				System.out.println("Tabeles and data created");
			}
			
			// Query table
			try(ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");) {
				while(rs.next()) {
					// Print data
					System.out.printf("%s %s %s", rs.getString(1), rs.getString(2), rs.getString(3));
				}
			}
		}
	}

}
