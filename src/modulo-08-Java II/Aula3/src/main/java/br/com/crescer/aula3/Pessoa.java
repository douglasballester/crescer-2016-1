package br.com.crescer.aula3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Pessoa{
    private long id;
    private String nome;

    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    
    public Pessoa(){};
    
    
    
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
