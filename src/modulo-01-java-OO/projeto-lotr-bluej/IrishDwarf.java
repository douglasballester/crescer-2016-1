import java.util.*;
public class IrishDwarf extends Dwarf{

    
    public IrishDwarf(String nome){
        super(nome);
    }
    
    public IrishDwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome, dataNascimento);
    }
    
    
    public void tentarSorte(){
        double muitaSorte = getNumeroSorte();
        
        if(muitaSorte == -3333.0){
                
            bag.irishDwarfGanhaMuitasUnidades();
            
        }
    }
}