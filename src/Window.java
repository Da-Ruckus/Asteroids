import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

public class Window extends Application {

	public void start(Stage stage) {

		Canvas canvas = new Canvas(600, 600);// sets canvas that game is on
		BorderPane game = new BorderPane();
		game.setCenter(canvas);

		GraphicsContext gc = canvas.getGraphicsContext2D();

		Scene scene = new Scene(game, 600, 600, Color.BLACK);// sets Window size
		scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> this.key.KeyboardInput(key, gc));
		scene.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> this.key.KeyboardInput(key, gc));

		stage.setScene(scene);
		stage.setTitle("Asteroids");
		stage.show();

		new AnimationTimer() {

			@Override
			public void handle(long now) {

				gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
				ship.draw(gc);
				ship.update(key, gc);
				ships.draw(gc);
				ships.update(key, gc);

				
				
				
				
				if (key.space) {
					Bullets.add(new Bullet(ship.shipX, ship.shipY));
					}
				
				// For every bullet
				
				
				Iterator<Bullet> iters = Bullets.iterator();
				while (iters.hasNext()) 
					
					// Get that bullet's top left x,y and bottom right x,y
								
				{
					Bullet temp = iters.next();
					
					double bulletX1 =  temp.X - 10;
					double bulletY1 =  temp.Y - 10;

					double bulletX2 =  temp.X + 10;
					double bulletY2 =  temp.Y + 10;
					
					
					
					double shipX1 =  ships.shipX - 20;
					double shipY1 = ships.shipY - 20 ;

					double shipX2 =  ships.shipX + 20;
					double shipY2 = ships.shipY + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX1 && bulletY2 >= shipY1 && shipX2 >= bulletX1 && shipY2 >= bulletY1) {
						
						ships.drawShip = false;
					}
					
					double shipX12 =  ships.ship2X - 20;
					double shipY12 = ships.ship2Y - 20 ;

					double shipX23 =  ships.ship2X + 20;
					double shipY23 = ships.ship2Y + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX12 && bulletY2 >= shipY12 && shipX23 >= bulletX1 && shipY23 >= bulletY1) {
						
						ships.drawShip2 = false;
					}
					

					double shipX123 =  ships.ship3X - 20;
					double shipY123 = ships.ship3Y - 20 ;

					double shipX234 =  ships.ship3X + 20;
					double shipY234 = ships.ship3Y + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX123 && bulletY2 >= shipY123 && shipX234 >= bulletX1 && shipY234 >= bulletY1) {
						
						ships.drawShip3 = false;
					}
					
					double shipX1234 =  ships.ship4X - 20;
					double shipY1234 = ships.ship4Y - 20 ;

					double shipX2345 =  ships.ship4X + 20;
					double shipY2345 = ships.ship4Y + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX1234 && bulletY2 >= shipY1234 && shipX2345 >= bulletX1 && shipY2345 >= bulletY1) {
						
						ships.drawShip4 = false;
					}

					double shipX12345 =  ships.shipX22 - 20;
					double shipY12345 = ships.shipY22 - 20 ;

					double shipX23456 =  ships.shipX22 + 20;
					double shipY23456 = ships.shipY22 + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX12345 && bulletY2 >= shipY12345 && shipX23456 >= bulletX1 && shipY23456 >= bulletY1) {
						
						ships.drawShip22 = false;
					}
					double shipX123456 =  ships.shipX23 - 20;
					double shipY123456 = ships.shipY23 - 20 ;

					double shipX234567 =  ships.shipX23 + 20;
					double shipY234567 = ships.shipY23 + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX123456 && bulletY2 >= shipY123456 && shipX234567 >= bulletX1 && shipY234567 >= bulletY1) {
						
						ships.drawShip23 = false;
					}

					double shipX1234567 =  ships.shipX34 - 20;
					double shipY1234567 = ships.shipY34 - 20 ;

					double shipX2345678 =  ships.shipX34 + 20;
					double shipY2345678 = ships.shipY34 + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX1234567 && bulletY2 >= shipY1234567 && shipX2345678 >= bulletX1 && shipY2345678 >= bulletY1) {
						
						ships.drawShip34 = false;
					}

					double shipX12345678 =  ships.shipX45 - 20;
					double shipY12345678 = ships.shipY45 - 20 ;

					double shipX23456789 =  ships.shipX45 + 20;
					double shipY23456789 = ships.shipY45 + 20; 

					// return (r.x2 >= s.x1 && r.y2 >= s.y1 &&//////// s.x2 >= r.x1 && s.y2 >= r.y1);
					
					if( bulletX2  >= shipX12345678 && bulletY2 >= shipY12345678 && shipX23456789 >= bulletX1 && shipY23456789 >= bulletY1) {
						
						ships.drawShip45 = false;
					}
					
						
				}
				
				Iterator<Bullet> iter = Bullets.iterator();
				while (iter.hasNext()) {
					Bullet temp = iter.next();
					temp.update(key, gc);
					temp.draw(gc);

					// iter.remove() 

				}

			}

		}.start();

	} // end start();

	Keyboard key = new Keyboard();
	Ship ship = new Ship();
	Enemyship ships = new Enemyship();
	List<Bullet> Bullets = new ArrayList<Bullet>();
}
