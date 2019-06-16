
package codersfootballleague2.pkg0.dados;

import codersfootballleague2.pkg0.negocios.beans.Equipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RepositorioEquipe {
    	
    ArrayList<Equipe>equipes;
	
    private static RepositorioEquipe instancia;
    
    public RepositorioEquipe() {
	equipes = new ArrayList();
    }
	
    public static RepositorioEquipe getInstancia() {
		
	if(instancia == null) {
		instancia = new RepositorioEquipe();
	}
	return instancia;
	
    }
    
    public void Inserir(Equipe equipe){
            
        if (!this.equipes.contains(equipe)){
              if(!this.equipes.equals(equipe)){
                  
                this.equipes.add(equipe);
                
 
            }

        }
    }
    
    public void Remover(Equipe equipe){
        if (this.equipes.contains(equipe)){
              if(this.equipes.equals(equipe)){
                  
                equipes.remove(equipe);
                 
//              }else{
//                 throw new RemoverException(medalha);
        }
      }
    }
        
        public List ListarRep(){
             
            return Collections.unmodifiableList(equipes);
        }
    
}
