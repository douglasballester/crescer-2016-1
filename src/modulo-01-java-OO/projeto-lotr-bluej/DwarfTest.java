import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    @Test
    public void DwarfPerdeVida(){
        Dwarf teste = new Dwarf("Thorin");
        double esperado = teste.getVida() - 10.0;
        double obtido = 100.0;
        assertEquals(esperado, obtido, 0.0);
    }
    
   @Test
   public void dwarfNasceComStatusVivo(){
       Dwarf dwarf = new Dwarf("testem");
       assertEquals(Status.VIVO, dwarf.getStatus());
    }
    
    @Test
    public void dwarfNasceComNomeVivoE110deVida(){
        Dwarf dwarf = new Dwarf("Balin");
        assertEquals(dwarf.getNome(),"Balin");
        assertEquals(dwarf.getVida(), 110.0, 0.0);
        assertEquals(dwarf.getStatus(), Status.VIVO); 
    }
    
    @Test
    public void dwarfGanhaExperienciaSemLevarFlechada(){
        Dwarf dwarf = new Dwarf("Thorin", new DataTerceiraEra(10,10,2016));
        dwarf.perdeVida();
        dwarf.perdeVida();
        
        dwarf.perdeVida();
        
        assertEquals(90, dwarf.getVida(), 0.0);
        assertEquals(2, dwarf.getExperiencia());
        //ano tem que ser bissexto e vida entre 80 - 90
    }
    
    @Test
    public void dwarfSeixasNaoGanhaExperiencia(){
        Dwarf seixas = new Dwarf("Seixas", new DataTerceiraEra(1,1,2015));
        
        seixas.getNumeroSorte();
        seixas.perdeVida();
        
        assertEquals(seixas.getExperiencia(), 0);
        //Dwarf nao ganha exp nem leva flechada, quando ano NAO for bissexto e
        //seu nome ser Seixas e seu numero da sorte estiver entre 0 e 100
    }
    
    
    @Test
    public void dwarfMeirelesNaoGanhaExperiencia(){
        Dwarf meireles = new Dwarf("Meireles", new DataTerceiraEra(1,1,2015));
        
        meireles.getNumeroSorte();
        meireles.perdeVida();
        
        assertEquals(meireles.getExperiencia(), 0, 0.0);
        //Dwarf nao ganha exp nem leva flechada, quando ano NAO for bissexto e
        //seu nome ser Seixas e seu numero da sorte estiver entre 0 e 100
    }
    
    //Acontece quando o numeroSorte dele for maior que 100, no caso 101
    @Test
    public void dwarfNaoLevaFlechadaNemGanhaExperiencia() {
        // Arrange
        Dwarf dwarf = new Dwarf("IronFoot");
        // Act
        double resultado = dwarf.getNumeroSorte();
        // Assert
        assertEquals(101.0, resultado, 0.0);
    }
    
    @Test
    public void dwarfMorreCom0DeVida(){
        Dwarf dwarf = new Dwarf("Thorin");
        
        for(int i=0; i < 11; i++){
            dwarf.perdeVida();
        }
        
        assertEquals(dwarf.getStatus(), Status.MORTO);
    }
    
    @Test
    public void dwarfNaoFicaCom20DeVidaNegativa(){
        Dwarf dwarf = new Dwarf("Thorin");
        
        for(int i=0; i < 13; i++){
            dwarf.perdeVida();
        }
        assertEquals(dwarf.getVida(), 0, 0.0);
    }
    
    @Test
    public void dwarfComDataDeNasimento(){
        Dwarf dwarf = new Dwarf("Balin", new DataTerceiraEra(2,2,2));
        assertEquals(dwarf.getDataNascimento().getDia(), 2); 
        assertEquals(dwarf.getDataNascimento().getDia(), 2);
        assertEquals(dwarf.getDataNascimento().getDia(), 2);
    
    }
    
    @Test
    public void dwarfSemDataDeNasimento(){
        Dwarf dwarf = new Dwarf("IronFoot");
        assertEquals(dwarf.getDataNascimento().getDia(), 1); 
        assertEquals(dwarf.getDataNascimento().getDia(), 1);
        assertEquals(dwarf.getDataNascimento().getDia(), 1);
    
    }
    
    @Test
    public void adicionarItemNaBag(){
        Dwarf dwarf = new Dwarf("IronFoot");
        Item itemAdicionado = new Item(2,"Cenouras");
        
        dwarf.adicionarItem(itemAdicionado);
        
        assertEquals(itemAdicionado, dwarf.getInventario().getInventarioItens().get(0));
        assertEquals(1, dwarf.getInventario().getInventarioItens().size());
        
    }
    
    @Test
    public void PerderItemDaBag(){
        Dwarf dwarf = new Dwarf("IronFoot");
        Item itemAdicionado = new Item(2,"Pepinos");
        dwarf.adicionarItem(itemAdicionado);
        dwarf.perderItem(itemAdicionado);
        
        assertEquals(0, dwarf.getInventario().getInventarioItens().size());
                  
    }
    
    @Test
    public void descobrirMenosVidaComDoisIgual(){
        Dwarf menor = Dwarf.descobrirMenosVida(new Dwarf ("d1"), new Dwarf ("D2"));
        assertEquals("D2", menor.getNome());
    }
    
    @Test
    public void descobrirMenosVidaComOPrimeiroMenor(){
        Dwarf d1 = new Dwarf("D1");
        Dwarf d2 = new Dwarf("D2");
        d1.perdeVida();
        assertEquals(d1, Dwarf.descobrirMenosVida(d1,d2));
    }
    
    @Test
    public void descobrirMenosVidaComOSegundoMenor(){
        Dwarf d1 = new Dwarf("D1");
        Dwarf d2 = new Dwarf("D2");
        d2.perdeVida();
        assertEquals(d2, Dwarf.descobrirMenosVida(d1,d2));
    }
    
    @Test
    public void equalsDwarf(){
       Dwarf a1 = new Dwarf("gimli");
       Dwarf a2 = new Dwarf("gimli");
       assertEquals(a1,a2);
    }
}
   
