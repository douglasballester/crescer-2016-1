public class DataTerceiraEra{
    private int dia;
    private int mes;
    private int ano;


    public DataTerceiraEra(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    public boolean ehBissexto(){
        if(ano % 400 == 0){
            return true;
        }else if(ano % 4 == 0 && ano % 100 != 0){
            return true;
        }else{
            return false;
        }
    }
}