import java.util.*;
public class EstrategiaUm implements EstrategiaGuerra{
    
    private ArrayList<Elfo> elfosVivos = new ArrayList<>();
   
    public void atacar(ExercitoDeElfos exercito, ArrayList<Dwarf> dwarves){
        elfosVivos = exercito.buscarPorStatus(Status.VIVO);
        int intencoesDeAtaque = (elfosVivos.size() * dwarves.size());
        int ataqueElfoNoturno = (int)(intencoesDeAtaque * 0.3);
        
        if (!elfosVivos.isEmpty()){
            for(Elfo elfosVivos : elfosVivos){
                for(Dwarf dwarf : dwarves){
                    if((elfosVivos instanceof ElfoNoturno) && (ataqueElfoNoturno > 0)){
                        elfosVivos.atirarFlecha(dwarf);
                        ataqueElfoNoturno--;
                    }
                    else{
                        elfosVivos.atirarFlecha(dwarf);
                    }
                }
            }
        }
    }
    
    
    
   public ArrayList<Elfo> ordemDeAtaque(){
       return elfosVivos;
   }
}

