
package codersfootballleague2.pkg0.GUI;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CodersFootballLeagueGUIController implements Initializable , EventHandler<Event>  {

    @FXML   
    private Button btnNovoC;
    @FXML
    private Button btnEntrar;  
    @FXML
    private TextField txtC; 
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Button btnNovaEq;

    @Override
    public void handle(Event event) {
        
        if(event.getSource().equals(btnNovoC)){
            
            Node node = (Node) event.getSource();

            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = null;
            try {
            root = FXMLLoader.load(getClass().getResource("CodersFootballLeagueGUI2_NovoCampeonato.fxml"));
            } catch (Exception ex) {
            
            }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
                
        if(event.getSource().equals(btnNovaEq)){
            
        }  
        
        
        if(event.getSource().equals(btnEntrar)){
            
            

            
        }
    
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
