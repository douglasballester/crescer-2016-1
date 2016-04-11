public class Item{
    private int quantidade;
    private String descricao;
    
    public Item(){}
    public Item(int quantidade, String descricao){
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
    
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void ganhar1000Unidades(){
        this.quantidade += 1000;
    }
    
    public void irishDwarfGanhaUnidades(){
        int quantAux = 0;
        for(int i = 1; i <= quantidade; i++){
            quantAux += i;
        }
        quantidade += (quantAux * 1000);
    }
}

//P.A quantidade * (quantidade + 1)/2