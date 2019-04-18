import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Bullet extends Keyboard {

	///// example code //////

	double X, Y;

	public Bullet(double X, double Y) {

		this.X = X;
		this.Y = Y;

	}

	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub

		gc.setFill(Color.RED);

		gc.fillRoundRect(X, Y, 20, 20, 20, 20);

	}
	// public boolean collision(Shape a) {
	// TODO Auto-generated method stub
	// return false;
	// }

	public void update(Keyboard key, GraphicsContext gc) {

		// Update
		Y--;

	}

}
