import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.*;

public class HobbitContadorTest
{
   @Test
    public void calculaDiferenca1Par() {
        HobbitContador teste = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        arrayDePares.add(new ArrayList<>(Arrays.asList(4,5)));
        assertEquals(0, teste.calcularDiferenca(arrayDePares));
    }
    
    @Test
    public void calculaDiferencaComArrayVazio() {
        HobbitContador teste = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        assertEquals(0, teste.calcularDiferenca(arrayDePares));
    }
    
    /*@Test
    public void calculaDiferencaCom2Pares() {
        HobbitContador Teste = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        arrayDePares.add(new ArrayList<>(Arrays.asList(18,15)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(4,5)));
        assertEquals(180, Teste.calcularDiferenca(arrayDePares));
    }*/
    //270 + 20 == 290 - 110 == 180 
    //90 + 20 == 110
    
    @Test
    public void obterMaiorMultiploDeTresComNumero0() {
        HobbitContador teste = new HobbitContador();
        for(int i = 0; i <= 0; i++){
        }
        assertEquals(0, teste.obterMaiorMultiploDeTresAte(0));
    }
    
    @Test
    public void obterMaiorMultiploDeTresAte10() {
        HobbitContador teste = new HobbitContador();
        for(int i = 0; i <= 10; i++){
        }
        
        assertEquals(9, teste.obterMaiorMultiploDeTresAte(10));
    }
    
    @Test
    public void obterMaiorMultiploDeTresAte30() {
        HobbitContador teste = new HobbitContador();
        assertEquals(30, teste.obterMaiorMultiploDeTresAte(30));
    }
    
    @Test
    public void obterMaiorMultiploDeTresAte100(){
        HobbitContador teste = new HobbitContador();        
        assertEquals(99, teste.obterMaiorMultiploDeTresAte(100));
    }
    
    @Test
    public void obterTodosMultiploDeTresAte10(){
        HobbitContador teste = new HobbitContador();        
        ArrayList<Integer> testeMultiplos = new ArrayList<>(Arrays.asList(3,6,9));
        
        assertEquals(testeMultiplos, teste.obterMultiplosDeTresAte(10));
    }
    
    @Test
    public void obterTodosMultiploDeTresAte18(){
        HobbitContador teste = new HobbitContador();        
        ArrayList<Integer> testeMultiplos = new ArrayList<>(Arrays.asList(3,6,9,12,15,18));
        
        assertEquals(testeMultiplos, teste.obterMultiplosDeTresAte(18));
    }
 }
