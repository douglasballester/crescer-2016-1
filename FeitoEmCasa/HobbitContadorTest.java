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
        HobbitContador Teste = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        arrayDePares.add(new ArrayList<>(Arrays.asList(4,5)));
        assertEquals(0, Teste.calcularDiferenca(arrayDePares));
    }
   
  
    
    @Test
    public void calculaDiferencaComArrayVazio() {
        HobbitContador Teste = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        assertEquals(0, Teste.calcularDiferenca(arrayDePares));
    }
    
    /*@Test
    public void calculaDiferencaCom2Pares() {
        HobbitContador Teste = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        arrayDePares.add(new ArrayList<>(Arrays.asList(12,60)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(4,5)));
        assertEquals(660, Teste.calcularDiferenca(arrayDePares));
    }*/
    
    
    
 }
