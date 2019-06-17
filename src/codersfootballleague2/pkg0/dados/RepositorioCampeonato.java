/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codersfootballleague2.pkg0.dados;

import codersfootballleague2.pkg0.negocios.beans.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RepositorioCampeonato {
   
        ArrayList<Campeonato>campeonatos;
	
    private static RepositorioCampeonato instancia;
    
    public RepositorioCampeonato() {
	campeonatos = new ArrayList();
    }
	
    public static RepositorioCampeonato getInstancia() {
		
	if(instancia == null) {
		instancia = new RepositorioCampeonato();
	}
	return instancia;
	
    }
    
    public void Inserir(Campeonato campeonato){
            
        if (!this.campeonatos.contains(campeonato)){
              if(!this.campeonatos.equals(campeonato)){
                  
                this.campeonatos.add(campeonato);
                
 
            }

        }
    }
    
    public void Remover(Campeonato campeonato){
        if (this.campeonatos.contains(campeonato)){
              if(this.campeonatos.equals(campeonato)){
                  
                campeonatos.remove(campeonato);
                 
        }
      }
    }
        
        public List ListarRep(){
             
            return Collections.unmodifiableList(campeonatos);
        }
    
}
