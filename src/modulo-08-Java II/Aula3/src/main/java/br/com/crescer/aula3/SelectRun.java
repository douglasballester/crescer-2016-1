package br.com.crescer.aula3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectRun {
    public static void main(String[] args) {

        final String ddl = "CREATE TABLE PESSOA ("
                + " ID_PESSOA NUMBER(19,0) NOT NULL, "
                + " NM_PESSOA VARCHAR(50) NOT NULL, "
                + " PRIMARY KEY (ID_PESSOA) "
                + ")";
        
        final String dml = "INSERT INTO PESSOA (ID_PESSOA, NM_PESSOA)"
                + " VALUES(1,'DOUGLAS')";
        
        try (final Connection connection = ConnectionUtil.getConnection()) {
            try(final Statement statement = connection.createStatement()){
                statement.executeUpdate(ddl);
                
                statement.executeUpdate(dml);
            } catch (final SQLException e){
                System.err.format("SQLException %s ", e);
            }
        } catch (SQLException e) {
             System.err.format("SQLException: %s", e);
        }
    }
}
