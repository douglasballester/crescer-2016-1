
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
    public void adicionarItem(Item item){
        if(item.getDescricao().equalsIgnoreCase("Espada de Aço valiriano") ||
        item.getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro"))
        bag.adicionarItem(item);
    }
    
    public boolean equals(Object obj){
        Elfo elfoVerde = (ElfoVerde)obj;
        return super.equals(elfoVerde) && this.flecha == elfoVerde.flecha;
    }
}
