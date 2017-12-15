package com.zxd.usedcar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/usedcar", "root", "");
			PreparedStatement ps = conn
					.prepareStatement("insert into test(one_id,one_name,two_id,two_name,three_id,three_name) values(?,?,?,?,?,?)");
			for (int i = 1; i <= 5; i++) {
				ps.setInt(1, i);
				ps.setString(2, "" + i);
				for (int j = 1; j <= 5; j++) {
					ps.setInt(3, j);
					ps.setString(4, i + "_" + j);
					for (int k = 1; k <= 5; k++) {
						ps.setInt(5, k);
						ps.setString(6, i + "_" + j + "_" + k);
						ps.addBatch();
					}
				}
			}
			ps.executeBatch();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
