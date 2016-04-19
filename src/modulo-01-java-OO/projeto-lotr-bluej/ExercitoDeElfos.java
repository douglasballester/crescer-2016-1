import java.util.*;
public class ExercitoDeElfos{
    private HashMap<String, Elfo> exercito = new HashMap<>();
    private HashMap<Status, ArrayList<Elfo>> elfosAgrupadosPorStatus = new HashMap<>();
    private EstrategiaGuerra estrategia = new EstrategiaUm();
    
    public void alistarElfo (Elfo elfo) throws NaoPodeAlistarException{
        if(elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno){
            exercito.put(elfo.getNome(), elfo);
        }
    }
    
    public Elfo buscarPorNome(String nome){
        return exercito.get(nome);
    }
    
    public HashMap getExercitoDeElfos(){
        return exercito;
    }
    
    public void agruparPorStatus(){
        for (Elfo elfo : exercito.values()){
            if (!elfosAgrupadosPorStatus.containsKey(elfo.getStatus())){
                elfosAgrupadosPorStatus.put(elfo.getStatus(), new ArrayList<Elfo>()); 
            }
                elfosAgrupadosPorStatus.get(elfo.getStatus()).add(elfo);
        }
    }
    
    public HashMap getExercitoAgrupado(){
        return elfosAgrupadosPorStatus;
    }
    
      public ArrayList<Elfo> buscarPorStatus(Status status){
        return elfosAgrupadosPorStatus.get(status);
    }
    
     public ArrayList<Elfo> ordemDeAtaque() {
        return this.estrategia.ordemDeAtaque();
    }
    
    public void atacar(ArrayList <Dwarf> dwarves){
        estrategia.atacar(new ArrayList<Elfo>(exercito.values()), dwarves);
    }
    
    public void escolherEstrategia(EstrategiaGuerra estrategia) {
        this.estrategia = estrategia;
    }
}
