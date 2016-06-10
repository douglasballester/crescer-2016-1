package br.com.crescer.exercicioaula3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
 
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final static String USER = "CRESCER16";
    private final static String PASS = "CRESCER16";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
}