
public class ElfoVerde extends Elfo
{
    public ElfoVerde(String nome){
        super(nome);        
    }
    
    public ElfoVerde(String nome, int flecha){
        super(nome, flecha);
        this.vida = 100;
    } 
    
    @Override
    public void atirarFlecha(Dwarf dwarf)
    {
        experiencia += 2;
        flecha--;
        dwarf.perdeVida();
    }
    
    @Override
    public void adicionarItem(Item itens){
        if(itens.getDescricao().equalsIgnoreCase("Espada de Aço valiriano") ||
        itens.getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro"))
        bag.adicionarItem(itens);
    }
    
}
