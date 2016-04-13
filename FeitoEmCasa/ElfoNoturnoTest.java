import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ElfoNoturnoTest
{   
    @Test
    public void ElfoNoturnoAtiraNoDwarfPerdendo5DeVidaGanhando3DeExperiencia()
    {
        ElfoNoturno teste = new ElfoNoturno("Anub'arak");
        
        teste.atirarFlecha(new Dwarf ("Lich king"));
        
        assertEquals(teste.getExperiencia(), 3, 0.0);
        assertEquals(teste.getVida(), 95, 0.0);
    }
    
    @Test
    public void ElfoNoturnoAtiraNoDwarfEMorre()
    {
        ElfoNoturno teste = new ElfoNoturno("Anub'arak");
        Dwarf ajuda = new Dwarf ("Lich king");
        while(teste.getVida() > 1.0){
            teste.atirarFlecha(ajuda);
        };
        assertTrue(teste.getVida() < 1.0);
        assertEquals(Status.MORTO, teste.getStatus());
    }
    
    @Test
    public void equalsNightElfMorto(){
        Elfo darkElf = new ElfoNoturno("teste");
        ElfoNoturno darkElfJr = new ElfoNoturno("teste");
        Dwarf alvo = new IrishDwarf("Alvo");
        for(int i = 0; i < 90; i++){
            darkElf.atirarFlecha(alvo);
            darkElfJr.atirarFlecha(alvo);
        }
        assertEquals(darkElf,darkElfJr);
    }
    
}
