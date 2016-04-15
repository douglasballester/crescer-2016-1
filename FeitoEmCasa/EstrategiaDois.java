import java.util.*;
public class EstrategiaDois implements EstrategiaGuerra{
    private ArrayList<Elfo> elfosVivos = new ArrayList<>();
    private ArrayList<Elfo> tipoElfo = new ArrayList<>();
    public void atacar(ExercitoDeElfos exercito, ArrayList<Dwarf> dwarves){
        
    elfosVivos = exercito.buscarPorStatus(Status.VIVO);
    for(Elfo elfosVivos : elfosVivos){
        if(elfosVivos instanceof ElfoVerde){
            tipoElfo.add(elfosVivos);
        }
    }
    for(Elfo elfosVivos : elfosVivos){
        if(elfosVivos instanceof ElfoNoturno){
            tipoElfo.add(elfosVivos);
        }
    }
    if(!elfosVivos.isEmpty()){
        for(Elfo elfosVivos : elfosVivos){
            for(Dwarf dwarf : dwarves){
                elfosVivos.atirarFlecha(dwarf);
            }
        }    
    }
}
    
    
    public ArrayList<Elfo> ordemDeAtaque(){
        return tipoElfo;
    }
}
