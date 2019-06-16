/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codersfootballleague2.pkg0.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Marco 10
 */
public class CodersFootballLeagueGUI2_NovoCampeonatoController implements Initializable , EventHandler<Event> {
    @FXML
    private Button btnAddEquipe;
    @FXML
    private Button btnCriar;
    @FXML
    private TextField txtC;
    @FXML
    private TextField txtSenha;
    @FXML
    private TextField txtNomeEq;
    @FXML
    private TableView tblEquipesC;
            
            
            
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void handle(Event event) {
       
    }
    
}
