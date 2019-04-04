import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;

public class Ship {
	
	public Ship (){
		
		
	}
	
	int degrees=0;
	
	public void draw(GraphicsContext gc) {
		
		gc.setFill(Color.AQUA);
		gc.save();
		gc.transform(new Affine(new Rotate(degrees, 150,150 )));
		
		double X [] = {150,130,170};
		double Y [] = {130,170,170};
		gc.fillPolygon(X, Y, 3);
		gc.restore();
		
		
	}

	// use axis aligned bounding box 
	
}
