package br.com.crescer.aula3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaRepositorio implements IPessoa {
 
      @Override
    public void insert(Pessoa pessoa) {
        
        String insert = "INSERT INTO PESSOA("
               + "ID_PESSOA, NM_PESSOA ) "
               + "VALUES ((SELECT MAX(ID_PESSOA) + 1 FROM PESSOA), ?)";
        
       try (final Connection connection = ConnectionUtil.getConnection()) {
           try (final PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
                   preparedStatement.setString(1, pessoa.getNome());
                   preparedStatement.executeUpdate();
           } catch (final SQLException e) {
               System.err.format("SQLException: %s", e);
           }
       } catch (final SQLException e) {
           System.err.format("SQLException: %s", e);
       }
        
        
    }

    @Override
    public void update(Pessoa pessoa) {
        
        String update = "UPDATE PESSOA SET"
                + " NM_PESSOA = ?"
                + " where (ID_PESSOA = ?)";
        
       try (final Connection connection = ConnectionUtil.getConnection()) {
           try (final PreparedStatement preparedStatement = connection.prepareStatement(update)) {
               preparedStatement.setString(1, pessoa.getNome());    
               preparedStatement.setLong(2, pessoa.getId());
                   
               preparedStatement.executeUpdate();
           } catch (final SQLException e) {
               System.err.format("SQLException: %s", e);
           }
       } catch (final SQLException e) {
           System.err.format("SQLException: %s", e);
       }
        
    }

    @Override
    public void delete(Pessoa pessoa) {
         String delete = "DELETE FROM PESSOA WHERE"
                + " ID_PESSOA = ?";
                
        
       try (final Connection connection = ConnectionUtil.getConnection()) {
           try (final PreparedStatement preparedStatement = connection.prepareStatement(delete)) {
                   preparedStatement.setLong(1, pessoa.getId());
                   preparedStatement.executeUpdate();
           } catch (final SQLException e) {
               System.err.format("SQLException: %s", e);
           }
       } catch (final SQLException e) {
           System.err.format("SQLException: %s", e);
       }
    }

    @Override
    public List<Pessoa> listAll() {
        
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        
        final String query = "SELECT * FROM PESSOA";
        try (final Connection connection = ConnectionUtil.getConnection()) {
            try (final Statement statement = connection.createStatement()) {
                try (final ResultSet resultSet = statement.executeQuery(query)) {
                  while (resultSet.next()) {
                      listaPessoas.add(new Pessoa(resultSet.getLong("ID_PESSOA"), resultSet.getString("NM_PESSOA")));
                  }
                } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
             }
            } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
        }
            } catch (final SQLException e) {
           System.err.format("SQLException: %s", e);
       }
        
        return listaPessoas ;
    }

    @Override
   public List<Pessoa> findNome(String nome) {
       ArrayList<Pessoa> listPessoas = new ArrayList<>();

       final String QUERY = "SELECT * FROM PESSOA WHERE LOWER(NM_PESSOA) LIKE LOWER(?)";

       try (final Connection connection = ConnectionUtil.getConnection()) {
           try (final PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
               preparedStatement.setString(1, "%" + nome + "%");
               preparedStatement.executeUpdate();
               try (final ResultSet resultSet = preparedStatement.executeQuery(QUERY)) {
                   while (resultSet.next()) {
                       listPessoas.add(new Pessoa(resultSet.getInt("ID_PESSOA"),
                               resultSet.getString("NM_PESSOA")));
                   }
               } catch (final SQLException e) {
                   System.err.format("SQLException: %s", e);
               }
           } catch (final SQLException e) {
               System.err.format("SQLException: %s", e);
           }

       } catch (SQLException e) {
           System.err.format("SQLException: %s", e);
       }
       return listPessoas;
   }
    
    public static void main(String[] args) {
        PessoaRepositorio x = new PessoaRepositorio();
        List<Pessoa> r = new ArrayList<>();
        
        r = x.listAll();
        for(Pessoa pes : r){
            System.out.println(pes.getId() + " " + pes.getNome());
        }
        
        //x.insert(r);
        //x.delete(new Pessoa(4, "wjeioqwheuwqhiewq"));
        //x.update(new Pessoa(6, "bozo"));
       
    }
    
}
