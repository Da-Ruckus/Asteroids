import java.util.Iterator;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
//import main.Keyboard;


public class Window extends Application {
	
public void start(Stage stage) {
    	
    	Canvas canvas = new Canvas(300,300);//sets canvas that game is on
		BorderPane game = new BorderPane();
		game.setCenter(canvas);
    
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
    	Scene scene = new Scene(game,300,300,Color.BLACK );//sets Window size
    	scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> this.key.KeyboardInput(key, gc));
		scene.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> this.key.KeyboardInput(key, gc));
		
        stage.setScene(scene);
        stage.setTitle("Asteroids");
        stage.show();
    /*
        
        Group root = new Group();
        Group g = new Group();

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            0.0, 0.0,
            20.0, 10.0,
            10.0, 20.0 });

        g.getChildren().add(polygon);

        scene.setRoot(g);
        stage.show();
     */
        
        
        
        
        
        new AnimationTimer() {

			@Override
			public void handle(long now) {

				
				
				
				gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
				ship.draw(gc);
				ship.update(key, gc);
				
				}

			}.start();
        
        
    } // end start();
    

Keyboard key = new Keyboard();
Ship ship = new Ship();


}
