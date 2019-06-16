
package codersfootballleague2.pkg0.negocios.beans;

import java.time.LocalDateTime;


public abstract class Partida {
    
    Equipe equipeVisitante; 
    Equipe equipeDaCasa;
    LocalDateTime dataHoraInicio;
    short placarEquipeVisitante;
    short placarEquipeDaCasa;

    
    public double calcularRenda(int ingressos){
      
        double lucro = 0;
        
        PartidaOficial calculo = new PartidaOficial();
        
        lucro = calculo.getPreco() * calculo.getQtdPagantes();
                   

         return lucro; 
        
    }
    
    public boolean equals(Partida partida ){
        return false;
    }
    
    
}
