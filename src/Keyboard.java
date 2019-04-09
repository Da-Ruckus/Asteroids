import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Keyboard {
	
	

boolean left = false;
boolean right = false;

boolean space = false;

	public void KeyboardInput(KeyEvent key, GraphicsContext gc) {
		if (key.getEventType() == KeyEvent.KEY_PRESSED) {

			
			if (key.getCode() == KeyCode.SPACE) {
				space = true;
			}
			
			if (key.getCode() == KeyCode.E) {
				System.exit(0);
			}
			
			if (key.getCode() == KeyCode.LEFT) {
				left = true;
				
			}

				if (key.getCode() == KeyCode.RIGHT) {
				right = true;
				
			}
		}
		
		if (key.getEventType() == KeyEvent.KEY_RELEASED) {

			if (key.getCode() == KeyCode.SPACE) {
				space = true;
			}
			
			
			if (key.getCode() == KeyCode.LEFT) {
				left = false;
			}
			

				if (key.getCode() == KeyCode.RIGHT) {
				right = false;
			}

		}
	}	

}
