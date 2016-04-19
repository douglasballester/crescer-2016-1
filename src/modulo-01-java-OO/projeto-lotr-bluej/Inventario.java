import java.util.*;

public class Inventario{
    private ArrayList<Item> inventarioItens = new ArrayList<>() ;
    
    
    public Inventario(){
        inventarioItens = new ArrayList<Item>();
    }
    
     public void adicionarItem(Item item){
        inventarioItens.add(item);
    }
    
    public void removerItem(Item item){
        inventarioItens.remove(item);
    }
    
    public ArrayList<Item> getInventarioItens(){
        return inventarioItens;
    }
    
    public boolean equals(Object obj){
        Inventario outro = (Inventario)obj;
         
        return this.inventarioItens.equals(outro.inventarioItens); 
    }
    
    public String getDescricaoItens(){
        String listarItens = "";
        for(int i = 0; i < inventarioItens.size(); i++){
            listarItens += inventarioItens.get(i).getDescricao() + "," ;
        }   
        
        return !inventarioItens.isEmpty() ? listarItens.substring(0, listarItens.length() - 1) : listarItens;
    }
    
    public void ganhar1000UnidadesDeCadaItem(){
        for(int i=0; i < inventarioItens.size(); i++){
            inventarioItens.get(i).ganhar1000Unidades();
        }
        
    }
    //Irish dwarf ganha 1000 * a soma da quantidade do item (1+2+3 == 6)
    public void irishDwarfGanhaMuitasUnidades(){
        for(int i=0; i < inventarioItens.size(); i++){
            inventarioItens.get(i).irishDwarfGanhaUnidades();
        }
        
    }
    
    public Item getItemMaisPopular(){
        int indice = 0 ,maiorQtd = 0;
        for (int i = 0; i < inventarioItens.size(); i++){
            int qtdAtual = inventarioItens.get(i).getQuantidade();
            if (qtdAtual > maiorQtd){
                maiorQtd = qtdAtual;
                indice = i;
            }
        }
        
        return !this.inventarioItens.isEmpty() ? this.inventarioItens.get(indice) : null;
        /*retorna null se não tiver item. Para evitar que quando o metodo seja
        chamado aponte para uma posicao que nao exista ? Perguntar*/ 
    }
    
    
    public void ordenarItens(){
        Item aux; 
        if(!inventarioItens.isEmpty()){
            for(int medSize = 1; medSize <= inventarioItens.size(); medSize++){ // SIZE começa em 1, get() começa em 0
                int i = medSize - 1;
                for(int medSizeA = medSize + 1; medSizeA <= inventarioItens.size(); medSizeA++){
                    int j = medSizeA - 1;
                    if(inventarioItens.get(j).getQuantidade() < inventarioItens.get(i).getQuantidade()){
                        aux = inventarioItens.get(i);
                        this.inventarioItens.set(i, inventarioItens.get(j));
                        this.inventarioItens.set(j , aux);
      
                    }
                }
            }
        }
    }
}
       
