package com.playedboxd.gameService.databaseTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@SpringBootTest
public class postgreSQLConnectionTest {

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Test
    public void testDatabaseConnection() {
        try {
            // JDBC sürücüsünü yükleme
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlantı oluşturma
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Bağlantı başarılı ise
            if (connection != null) {
                System.out.println("Veritabanına başarıyla bağlandı!");
                connection.close(); // Bağlantıyı kapat
            } else {
                System.err.println("Bağlantı başarısız!");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC sürücüsü bulunamadı!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Veritabanına bağlantı oluşturulurken hata oluştu!");
            e.printStackTrace();
        }
    }
}