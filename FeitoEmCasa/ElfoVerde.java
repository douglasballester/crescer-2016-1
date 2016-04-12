
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
        super.atirarFlecha(dwarf);    
        experiencia++;
    }
    
    @Override
    public void adicionarItem(Item inventarioItens){
        if(inventarioItens.getDescricao().equalsIgnoreCase("Espada de Aço valiriano") ||
        inventarioItens.getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro"))
        bag.adicionarItem(inventarioItens);
    }
}
