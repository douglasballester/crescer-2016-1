

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ElfoTest
{
    @Test
    public void criarElfoCom42Flechas(){
        Elfo teste = new Elfo("Haldir");
        int esperado = 42;
        int obtido = teste.getFlecha();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void elfoAtiraFlechaEmUmDwarf() {
        Elfo arwen = new Elfo("Arwen");
        arwen.atirarFlecha(new Dwarf("Gimli"));
        assertEquals(41, arwen.getFlecha());
        assertEquals(1, arwen.getExperiencia());
    }
    
    @Test
    public void elfoAtiraFlechaEmDoisDwarves() {
        Elfo arwen = new Elfo("Arwen");
        arwen.atirarFlecha(new Dwarf("Gimli"));
        arwen.atirarFlecha(new Dwarf("Dunga"));
        assertEquals(40, arwen.getFlecha());
        assertEquals(2, arwen.getExperiencia());
    }
    
    @Test
    public void elfoComNomeEFlechasInformadasToString() {
        Elfo elfo1 = new Elfo("Acabaram os nomes", 1000);
        String textoEsperado = "Acabaram os nomes possui 1000 flechas e 0 níveis de experiência.";

        assertEquals(textoEsperado, elfo1.toString());
    }
    
     @Test
    public void elfoComUmaFlechaInformadaToString() {
        Elfo elfo1 = new Elfo("Monoflecha", 1);
        String textoEsperado = "Monoflecha possui 1 flecha e 0 níveis de experiência.";
        assertEquals(textoEsperado, elfo1.toString());
    }

    @Test
    public void elfoComUmDeExperienciaToString() {
        Elfo elfo1 = new Elfo(null);
        elfo1.atirarFlecha(new Dwarf("Gimli"));
        String textoEsperado = "null possui 41 flechas e 1 nível de experiência.";
        assertEquals(textoEsperado, elfo1.toString());
    }
    
    @Test
    public void contadorDeElfos(){
        int esperado = Elfo.getContElfo() + 3;
        Elfo a1 = new ElfoNoturno("teste");
        Elfo a3 = new Elfo("teste");
        Elfo a2 = new ElfoVerde("teste");
        assertEquals(esperado, Elfo.getContElfo());
    }
    
    @Test
    public void equalsElfos(){
        Elfo a1 = new Elfo("Teste");
        Elfo a2 = new Elfo("Teste");
        
        assertEquals(a1,a2);
    }
    
    @Test
    public void equalsElfosVerdes(){
        Elfo a1 = new ElfoVerde("Teste");
        Elfo a2 = new ElfoVerde("Teste");
        
        assertEquals(a1,a2);
        
    }
}