
package codersfootballleague2.pkg0.GUI;



import codersfootballleague2.pkg0.dados.RepositorioCampeonato;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CodersFootballLeagueGUIController implements Initializable , EventHandler<Event>  {

    @FXML   
    private Button btnNovoC;
    @FXML
    private Button btnEntrar;  
    @FXML
    private TextField txtC; 
    @FXML
    private Button btnNovaEq;

    @Override
    public void handle(Event event) {
        
        if(event.getSource().equals(btnNovoC)){
            
            Main.changeScene("CodersFootballLeagueGUI2_NovoCampeonato");
        }
                
        if(event.getSource().equals(btnNovaEq)){
            
            Main.changeScene("CodersFootballLeagueGUI3_NovaEquipe");
            
        }  
              
        if(event.getSource().equals(btnEntrar)){
            
            
            Main.changeScene("CodersFootballLeagueGUI4_PartidasCampeonato");  
                   
        }
    
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
