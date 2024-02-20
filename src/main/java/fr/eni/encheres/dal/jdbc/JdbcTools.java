package fr.eni.encheres.dal.jdbc;

import fr.eni.encheres.dal.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTools {
    private static String databaseURL;
    private static String username;
    private static String password;

    static {
        try {
            Class.forName(Settings.getProperty("driverdb"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        databaseURL = Settings.getProperty("databaseURL");
        username = Settings.getProperty("username");
        password = Settings.getProperty("password");
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(databaseURL, username, password);

        return connection;
    }
}
