package com.unitins.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDao {

	public static String buscarDado() {
		String url = "jdbc:h2:mem:banco";
		String username = "adm";
		String password = "adm";
		String dado = null;

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement()) {

			String sql = "SELECT * FROM primo where id = '1'";
			ResultSet resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				dado = resultSet.getString("sequencia");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dado;
	}
}
