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
				Iterator<Bullet> iter = Bullets.iterator();
				while (iter.hasNext()) {
					Bullet temp = iter.next();
					temp.update(key, gc);
					temp.draw(gc);

				}

			}

		}.start();

	} // end start();

	Keyboard key = new Keyboard();
	Ship ship = new Ship();
	Enemyship ships = new Enemyship();
	List<Bullet> Bullets = new ArrayList<Bullet>();
}
