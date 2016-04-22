import java.util.*;
//ELFOS NOTURNOS POR ULTIMO
public class EstrategiaDois implements EstrategiaGuerra{
    private ArrayList<Elfo> ordemDoUltimoAtaque = new ArrayList<>();
    
   public void atacar(ArrayList<Elfo> elfos, ArrayList<Dwarf> dwarves){
       this.ordemDoUltimoAtaque.clear();
       
       for (int i = 0; i < elfos.size() - 1; i++){
           for(int j = 0 ; j < elfos.size() - 1; j++){
               Elfo atual = elfos.get(j);
               Elfo proximo = elfos.get(j+1);
               
               if(atual instanceof ElfoNoturno && proximo instanceof ElfoVerde){
                   elfos.set(j, proximo);
                   elfos.set(j+1, atual);
                }
           }
        }  
       if(!elfos.isEmpty() && !dwarves.isEmpty()){
           for(Elfo elfo : elfos){
               if(elfo.getStatus() == Status.VIVO){
                   ordemDoUltimoAtaque.add(elfo);
                   for(Dwarf dwarf : dwarves){
                       elfo.atirarFlecha(dwarf);
                    }
                }
            }
        }
   }
   
   public ArrayList<Elfo> ordemDeAtaque(){
       return ordemDoUltimoAtaque;
    }
}
