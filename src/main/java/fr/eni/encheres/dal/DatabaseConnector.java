package fr.eni.encheres.dal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnector {
    private static final String PROPERTIES_FILEPATH = "db.properties";

    public static Connection getConnection() throws IOException, SQLException, ClassNotFoundException {

        Properties properties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        properties.load(loader.getResourceAsStream(PROPERTIES_FILEPATH));

        Class.forName(properties.getProperty("driverClassName"));

        System.out.println("URL de connexion : " + properties.getProperty("databaseURL"));
        System.out.println("username de connexion : " + properties.getProperty("username"));
        System.out.println("password de connexion : " + properties.getProperty("password"));
        System.out.println("driverClassName de connexion : " + properties.getProperty("driverClassName"));

        return DriverManager.getConnection(
                properties.getProperty("databaseURL"),
                properties.getProperty("username"),
                properties.getProperty("password")
        );
    }
}