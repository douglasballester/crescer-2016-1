import java.util.*;
public class EstrategiaUm implements EstrategiaGuerra{
    
    private ArrayList<Elfo> ordemDoUltimoAtaque = new ArrayList<>();
    
    public void atacar(ArrayList<Elfo> elfos, ArrayList<Dwarf> dwarves){
        this.ordemDoUltimoAtaque.clear();
        int intencoesDeAtaque = (elfos.size() * dwarves.size());
        int ataqueElfoNoturno = (int)(intencoesDeAtaque * 0.3);
        for(Elfo elfo : elfos){
            if(elfo.getStatus() == Status.VIVO){
                for(Dwarf dwarf : dwarves){
                    if((elfo instanceof ElfoNoturno) && (ataqueElfoNoturno > 0)){
                        elfo.atirarFlecha(dwarf);
                        ataqueElfoNoturno--;
                        ordemDoUltimoAtaque.add(elfo);
                        }
                    if (elfo instanceof ElfoVerde){
                        elfo.atirarFlecha(dwarf);
                        ordemDoUltimoAtaque.add(elfo);
                    }
                }
            }
        }
    }
    
    
    
   public ArrayList<Elfo> ordemDeAtaque(){
       return ordemDoUltimoAtaque;
   }
}

