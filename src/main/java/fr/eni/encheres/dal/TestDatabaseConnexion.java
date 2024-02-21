package fr.eni.encheres.dal;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SLF4JLog;
import org.apache.commons.logging.impl.SLF4JLogFactory;
import org.mariadb.jdbc.util.log.Slf4JLogger;
import org.slf4j.Logger;
import org.slf4j.spi.SLF4JServiceProvider;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabaseConnexion {
    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnector.getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("Connexion à la base de données réussie.");
                conn.close();
            } else {
                System.out.println("Échec de la connexion à la base de données.");
            }
        } catch (IOException | SQLException | ClassNotFoundException e) {
            System.err.println("Erreur lors du test de la connexion à la base de données :");
            e.printStackTrace();
        }
    }
}