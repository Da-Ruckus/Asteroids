
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class main extends Application {

    public void start(Stage stage) {
    	
    	Canvas canvas = new Canvas(300,300);//sets canvas that game is on
		BorderPane game = new BorderPane();
		game.setCenter(canvas);
    	
    	
  
       
    	Scene scene = new Scene(game,300,300,Color.BLACK );//sets Window size
        stage.setScene(scene);
        stage.setTitle("Asteroids");
        stage.show();
       
    } // end start();
    
    
    public static void main(String[] args) {
        launch(args);  // Run this Application.
    }
    
}