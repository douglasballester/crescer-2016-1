import java.util.*;
public class EstrategiaDois implements EstrategiaGuerra{
    private ArrayList<Elfo> ordemDoUltimoAtaque = new ArrayList<>();
    
    public void atacar(ArrayList<Elfo> elfos, ArrayList<Dwarf> dwarves){
   this.ordemDoUltimoAtaque.clear();
    for(Elfo elfo : elfos){
        if(elfo instanceof ElfoVerde && elfo.getStatus() == Status.VIVO){
            ordemDoUltimoAtaque.add(elfo);
        }
   }
    for(Elfo elfo : elfos){
        if(elfo instanceof ElfoNoturno && elfo.getStatus() == Status.VIVO){
            ordemDoUltimoAtaque.add(elfo);
        }
    }
    if(!elfos.isEmpty()){
        for(Elfo elfo : elfos){
            for(Dwarf dwarf : dwarves){
                elfo.atirarFlecha(dwarf);
            }
        }    
    }
}
    
    
    public ArrayList<Elfo> ordemDeAtaque(){
        return ordemDoUltimoAtaque;
    }
}
