package br.com.crescer.exercicioaula3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class MeuSqlUtils {
    
    public static BufferedReader getReader(String Path) throws FileNotFoundException, IOException {
        File file = new File(Path);
        file.createNewFile();
        return new BufferedReader(new FileReader(file));
    }
    
    public static String comandoSQL(String nomeArquivo) throws IOException{
        String comando = "";
        if(nomeArquivo.lastIndexOf(".sql") != -1 ){
            BufferedReader reader = null;
            try{
                reader = getReader(nomeArquivo);
            }catch(Exception e){
                
            }
            
            while(true){
                String readLine = reader.readLine();
                if(readLine != null && !readLine.isEmpty()){
                    comando += comando + readLine;
                }else{
                    break;
                }
            }
           
        }else{
            System.out.println("ERRADO!");
        }
        
        return comando;
    }
    
    public static void executarSQL(String nomeArquivo) throws IOException{
        String meuComando = comandoSQL(nomeArquivo);
        try (final Connection connection = ConnectionUtil.getConnection()) {
            try (final Statement statement = connection.createStatement()) {
                statement.executeUpdate(meuComando);
                
            } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
            }
        } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
        }
    }
    
    public static void main(String[] args) throws IOException {
        MeuSqlUtils.executarSQL("teste.sql");
    }
}
