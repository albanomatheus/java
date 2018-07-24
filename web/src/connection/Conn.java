package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static Connection CONNECTION;

    private Conn() {

    }

    public static Connection getConnection() {
        try {
            if (CONNECTION == null) {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                CONNECTION = DriverManager.getConnection("jdbc:mysql://localhost/javajdbc", "root", "root");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return CONNECTION;
    }
}