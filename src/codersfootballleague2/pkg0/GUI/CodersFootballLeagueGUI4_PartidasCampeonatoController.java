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
public class CodersFootballLeagueGUI4_PartidasCampeonatoController implements Initializable, EventHandler<Event> {
    
     @FXML
    private Button btnAddResult;
    @FXML
    private Button btnTelaInicial;
    @FXML
    private TextField txtPlc1;
    @FXML
    private TextField txtPlc2;
    
    @FXML
    private TableView tblTime1;
    @FXML
    private TableView tblTime2;
    @FXML
    private TableView tblPlacar;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @Override
    public void handle(Event event) {
           
    }
    
}
