package com.hcl;

import com.hcl.*;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;

public class UsersDao {
	public Boolean Register(Users user) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			String addUserSql = "INSERT INTO User(name, blood_group, " + "city, password) " + "VALUES('"
					+ user.getName() + "','" + user.getBlood_group() + "','" + user.getCity() + "','"
					+ user.getPassword() + "')";

			st.executeUpdate(addUserSql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public int Login(Users user) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			String getUserSql = "SELECT * FROM User WHERE name = '" + user.getName() + "'";

			ResultSet rs = st.executeQuery(getUserSql);
			if (rs.next()) {
				if (user.getPassword().contentEquals(rs.getString("password")))
					return rs.getInt("id");
				else
					return 0;
			}
			st.close();
			return 0;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}