
package br.com.crescer.exerciciosaula01;

import java.util.Calendar;
import java.util.Date;

public class MeuCalendarioUtil {
    
    public String diaDaSemanaQueNasceu(Date dataNascimento){
        
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataNascimento);
       
        
        int diaSemana = calendario.DAY_OF_WEEK;
        
        switch (diaSemana){
        case 1:
            return "DOMINGO";
                
        case 2:
            return "Segunda";
                
        case 3:
            return "Terça";
            
        case 4:
            return "Quarta";
            
        case 5:
            return "Quinta";
            
        case 6:
            return "Sexta";
            
        case 7:
            return "Sabado";
            
        default:
            return "ASHEAUHEASUIE";
        }
    }
}
