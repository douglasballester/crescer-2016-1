import java.util.*;

public class Inventario{
    private ArrayList<Item> itens = new ArrayList<>() ;
    
    
    public Inventario(){
        itens = new ArrayList<Item>();
    }
    
     public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public void removerItem(Item item){
        itens.remove(item);
    }
    
    public ArrayList<Item> getItens(){
        return itens;
    }
    
    public String getDescricaoItens(){
        String listarItens = "";
        for(int i = 0; i < itens.size(); i++){
            listarItens += itens.get(i).getDescricao() + "," ;
        }   
        
        return !itens.isEmpty() ? listarItens.substring(0, listarItens.length() - 1) : listarItens;
    }
    
    public void ganhar1000UnidadesDeCadaItem(){
        for(int i=0; i < itens.size(); i++){
            itens.get(i).ganhar1000Unidades();
        }
        
    }
    //Irish dwarf ganha 1000 * a soma da quantidade do item (1+2+3 == 6)
    public void irishDwarfGanhaMuitasUnidades(){
        for(int i=0; i < itens.size(); i++){
            itens.get(i).irishDwarfGanhaUnidades();
        }
        
    }
    
    public Item getItemMaisPopular(){
        int indice = 0 ,maiorQtd = 0;
        for (int i = 0; i < itens.size(); i++){
            int qtdAtual = itens.get(i).getQuantidade();
            if (qtdAtual > maiorQtd){
                maiorQtd = qtdAtual;
                indice = i;
            }
        }
        
        return !this.itens.isEmpty() ? this.itens.get(indice) : null;
        /*retorna null se não tiver item. Para evitar que quando o metodo seja
        chamado aponte para uma posicao que nao exista ? Perguntar*/ 
    }
    
    
    public void ordenarItens(){
        Item aux; 
        if(!itens.isEmpty()){
            for(int medSize = 1; medSize <= itens.size(); medSize++){ // SIZE começa em 1, get() começa em 0
                int i = medSize - 1;
                for(int medSizeA = medSize + 1; medSizeA <= itens.size(); medSizeA++){
                    int j = medSizeA - 1;
                    if(itens.get(j).getQuantidade() < itens.get(i).getQuantidade()){
                        aux = itens.get(i);
                        this.itens.set(i, itens.get(j));
                        this.itens.set(j , aux);
      
                    }
                }
            }
        }
        
        
    }
}
        
 
            


        
        

    

   
