import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
//import main.Keyboard;

public class Ship extends Keyboard {
	
	public Ship (){
		
		
	}
	
	int degrees=0;
	
	public void draw(GraphicsContext gc) {
		
		
		gc.setFill(Color.AQUA);
		gc.save();
		gc.transform(new Affine(new Rotate(degrees, shipX, shipY )));
		
		double X [] = {shipX,shipX-20,shipX+20};
		double Y [] = {shipY-20,shipY+20,shipY+20};
		gc.fillPolygon(X, Y, 3);
		gc.restore();
	
	}

	double shipX = 150;
	double shipY = 275;

	int edge = 280;
	
	int firstedge = 20;
	
	public void update(Keyboard key,GraphicsContext gc) {
		
		if (key.left) {
			shipX--;
		}
		if (key.right) {
			shipX++;

		}
		
		
		if (shipX == edge ) {
			shipX--;

		}
				
		if (shipX == firstedge ) {
			shipX++;

		}
		
	// use axis aligned bounding box 
	
	
	
	
}

	
	
	
	
}