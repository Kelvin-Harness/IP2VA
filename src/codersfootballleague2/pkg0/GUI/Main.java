
package codersfootballleague2.pkg0.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
          
    private static Stage palco;
    
    private static Scene sceneLogin;
    
    private static Scene sceneNovaEquipe;
    
    private static Scene sceneNovoCampeonato;
    
    private static Scene sceneGerenciarCampeonato;
    
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        palco = primaryStage;
                
        Parent login = FXMLLoader.load(this.getClass().getResource("CodersFootballLeagueGUI.fxml"));
        sceneLogin =  new Scene(login);
           
        Parent novaEquipe = FXMLLoader.load(this.getClass().getResource("CodersFootballLeagueGUI3_NovaEquipe.fxml"));
        sceneNovaEquipe = new Scene(novaEquipe);
        
        Parent novoCampeonato = FXMLLoader.load(this.getClass().getResource("CodersFootballLeagueGUI2_NovoCampeonato.fxml")); 
        sceneNovoCampeonato = new Scene(novoCampeonato);
        
        Parent gerenciadorCampeonato = FXMLLoader.load(this.getClass().getResource("CodersFootballLeagueGUI4_PartidasCampeonato.fxml")); 
        sceneGerenciarCampeonato = new Scene(gerenciadorCampeonato);        

        
        primaryStage.setScene(sceneLogin);
        primaryStage.setTitle("Football League");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void changeScene(String src){
        switch(src){
            case"CodersFootballLeagueGUI":
                palco.setScene(sceneLogin);
                    break;
                    
            case"CodersFootballLeagueGUI3_NovaEquipe":
                palco.setScene(sceneNovaEquipe);
                    break;
                 
            case"CodersFootballLeagueGUI2_NovoCampeonato":
                palco.setScene(sceneNovoCampeonato);
                    break;
            
            case"CodersFootballLeagueGUI4_PartidasCampeonato":
                palco.setScene(sceneGerenciarCampeonato);
                    break;
                     
        }
               
    }
    public static void main(String[] args) {
        launch(args);
    } 
}
