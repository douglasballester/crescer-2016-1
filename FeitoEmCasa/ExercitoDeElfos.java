import java.util.*;
public class ExercitoDeElfos
{
    private HashMap<String, Elfo> exercito = new HashMap<>();
    
    public void alistarElfo(Elfo elfo){
        //Aceitar somente Elfos Verdes e Elfos Noturnos
        if(elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno){
            exercito.put(elfo.getNome(), elfo);
        }
    }
    
    public Elfo buscarElfo(String nome){
        for (String chave : exercito.keySet()){
           if (chave.equals(nome)){
               return exercito.get(chave);
            }
        }
        return null;
    }
    
    public HashMap getExercitoDeElfos(){
        return exercito;
    }
}
