
package codersfootballleague2.pkg0.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application{
          

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent painel = FXMLLoader.load(this.getClass().getResource("CodersFootballLeagueGUI.fxml"));
        Scene scene =  new Scene(painel);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Football League");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    } 
}
