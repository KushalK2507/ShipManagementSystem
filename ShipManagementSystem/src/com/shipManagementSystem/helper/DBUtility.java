package com.shipManagementSystem.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shipManagementSystem.model.entity.UserDetails;

public class DBUtility {

	private DBUtility() {
	}

	public static Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}

	public static UserDetails getUserDetails(String id) {

		return null;
	}

	public static String insertUser(UserDetails user) throws SQLException {
		Connection conn = getConnection();
		conn.setAutoCommit(false);
		try {

			String sqlUser = "Insert into user(name,address,email) values (?,?,?)";

			PreparedStatement userStatement = conn.prepareStatement(sqlUser, Statement.RETURN_GENERATED_KEYS);
			userStatement.setString(1, user.getName());
			userStatement.setString(2, user.getAddress());
			userStatement.setString(3, user.getEmail());

			userStatement.execute();
			ResultSet userResult = userStatement.getGeneratedKeys();

			int userId = 0;
			if (userResult.next()) {
				userId = Integer.parseInt(userResult.getString(1));
			}

			String sqlEmployee = "Insert into employee values (?,?,?,?,?,?)";
			PreparedStatement employeeStatement = conn.prepareStatement(sqlEmployee);
			employeeStatement.setInt(1, userId);
			employeeStatement.setString(2, user.getName());
			employeeStatement.setString(3, user.getAddress());
			employeeStatement.setString(4, user.getEmail());
			employeeStatement.setString(5, null);
			employeeStatement.setString(6, null);

			employeeStatement.execute();
			conn.commit();
			return String.valueOf(userId);
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			return null;
		}

	}

	public static String deleteUser(String Id) {
		return null;
	}

	public static UserDetails updateUser(UserDetails user, String id) {
		return null;
	}

}
