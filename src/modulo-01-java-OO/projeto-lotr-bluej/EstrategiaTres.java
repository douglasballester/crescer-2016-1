import java.util.*;
//ATAQUE INTERCALADO
public class EstrategiaTres implements EstrategiaGuerra{
    private ArrayList<Elfo> ordemDoUltimoAtaque = new ArrayList<>();
    
    public ArrayList<Elfo> ordemDeAtaque(){
        return ordemDoUltimoAtaque;
    }
    
    public void atacar(ArrayList<Elfo> elfos, ArrayList<Dwarf> dwarves){
        this.ordemDoUltimoAtaque.clear();
        int contVerde = 0;
        int contNoturno = 0;
        for(Elfo elfo : elfos){
            if(elfo instanceof ElfoNoturno && elfo.getStatus() == Status.VIVO){
                contNoturno++;
            }
            else if(elfo instanceof ElfoVerde && elfo.getStatus() == Status.VIVO){
                contVerde++;
            }
       }
       if(contVerde == contNoturno && !dwarves.isEmpty()){
           ordenarExercito(elfos);
           for(Elfo elfo : elfos){
               if(elfo.getStatus() == Status.VIVO){
                   for(Dwarf dwarf : dwarves){
                    elfo.atirarFlecha(dwarf);
                    ordemDoUltimoAtaque.add(elfo);   
                }
            }
            }
        }
    }
    
      private void ordenarExercito(ArrayList<Elfo> elfos) {
        for(int i = 0; i < elfos.size() - 1; i++) {
            if(elfos.get(i).getStatus() == Status.VIVO) {
                if(elfos.get(i).getClass().equals(elfos.get(i + 1).getClass())) {
                    for(int j = i+1; j < elfos.size(); j++) {
                            Elfo ajuda = elfos.get(i + 1);
                            elfos.set(i + 1, elfos.get(j));
                            elfos.set(j, ajuda);
                     }           
                 }
             }
         }    
       }
    }
