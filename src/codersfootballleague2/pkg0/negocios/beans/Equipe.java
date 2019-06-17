
package codersfootballleague2.pkg0.negocios.beans;

import java.util.HashMap;
import java.util.Map;


public class Equipe {
    private String nome;
    private Map<Integer, String> jogadores;
    int NUM_MAX_JOGADORES = 11;
    
    
    private Equipe(String nome) {

        this.nome = nome;
        this.jogadores = new HashMap();
    }

    public String getNome() {
        return nome;
    }
    
    public void adcJogador(String nome, Integer numCamisa){
        boolean retorno = false;
        
         if( jogadores.size() < NUM_MAX_JOGADORES){
             
             if(!jogadores.containsKey(numCamisa)){
                 
                  if(!jogadores.containsValue(nome)){
                      
                        jogadores.put(numCamisa, nome);
                        
                  }
             }
         }
            
    }
    
    public void rmvJogador(String nome, Integer numCamisa){
         
        if( jogadores.size() > 0){
             
             if(jogadores.containsKey(numCamisa)){
                 
                  if(jogadores.containsValue(nome)){
                      
                        jogadores.remove(numCamisa);
                        
                  }
             }
        
        }
    }
}
