import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
//import main.Keyboard;

public class Enemyship {
	
	
public Enemyship (){
	if (number == 1 && number != 2) {
		right=true;
	}

	else {
		left = true;
		}
		
	}
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.WHITE);
		gc.save();
		
		double X [] = {shipX,shipX+20,shipX-20};
	//	int x = (int) X;
	//	Integer x = X.intValue();
	//	Double d = 5.25;
	//	Integer i = d.intValue(); 
		
		double Y [] = {shipY+20,shipY-20,shipY-20};
		gc.fillPolygon(X, Y, 3);
		gc.restore();
		
		
		
		
	
		double X2 [] = {ship2X,ship2X+20,ship2X-20};
		double Y2[] = {ship2Y+20,ship2Y-20,ship2Y-20};
		gc.fillPolygon(X2, Y2, 3);
		gc.restore();
	
		double X3 [] = {ship3X,ship3X+20,ship3X-20};
		double Y3[] = {ship3Y+20,ship3Y-20,ship3Y-20};
		gc.fillPolygon(X3, Y3, 3);
		gc.restore();
	
		double X4 [] = {ship4X,ship4X+20,ship4X-20};
		double Y4[] = {ship4Y+20,ship4Y-20,ship4Y-20};
		gc.fillPolygon(X4, Y4, 3);
		gc.restore();
		

		double X22 [] = {shipX22,shipX22+20,shipX22-20};
		double Y22 [] = {shipY22+20,shipY22-20,shipY22-20};
		gc.fillPolygon(X22, Y22, 3);
		gc.restore();
	
		double X23 [] = {shipX23,shipX23+20,shipX23-20};
		double Y23[] = {shipY23+20,shipY23-20,shipY23-20};
		gc.fillPolygon(X23, Y23, 3);
		gc.restore();
	
		double X34 [] = {shipX34,shipX34+20,shipX34-20};
		double Y34[] = {shipY34+20,shipY34-20,shipY34-20};
		gc.fillPolygon(X34, Y34, 3);
		gc.restore();
	
		double X45 [] = {shipX45,shipX45+20,shipX45-20};
		double Y45[] = {shipY45+20,shipY45-20,shipY45-20};
		gc.fillPolygon(X45, Y45, 3);
		gc.restore();
		
		
		
		
		
	}
	//	double shipX = 37.5;

	double shipX = 75;

	//	double shipY = 25;

	double shipY = 50;

	//double ship2X = 112.5;
	
	
	double ship2X = 225;
	

//	double ship2Y = 25;
	
	double ship2Y = 50;

	//double ship3X = 187.5;
	
	double ship3X = 375;
	
	double ship3Y = 50;
//	double ship3Y = 25;

	
	//double ship4X = 262.5;
	
	double ship4X = 525;
	
	double ship4Y = 50;

//	double ship4Y = 25;

	
	
	// Next row of ships
	
	
	double shipX22 = 75;

	double shipY22 = 110;

	//////////////////////
	double shipX23 = 225;

	double shipY23 = 110;

	/////////////////////
	
	double shipX34 = 375;
	
	double shipY34 = 110;
	//////////////////////
		
	double shipX45 = 525;
	
	double shipY45 = 110;

	
	Random generator = new Random();
	int number = generator.nextInt(2) + 1;
	
	
	
	boolean right = false;	
	boolean left = false;
	
	
	
	public void update(Keyboard key,GraphicsContext gc) {

		 int width =(int) gc.getCanvas().getWidth();
			
		 int height= (int) gc.getCanvas().getHeight();
			
		//	System.out.println(number);

		
			// Update
			if (right == true) {
				shipX++;
				}

			else {
				left = true;
				shipX--;
			}

					
////////////   ship2X   ////////////		
			if (right == true) {
				ship2X++;
				}

			else {
				left = true;
				ship2X--;
			}


////////////   ship3X   ////////////			
			if (right == true) {
				ship3X++;
				}

			else {
				left = true;
				ship3X--;
			}

			
			
////////////   ship4X   ////////////			
			if (right == true) {
				ship4X++;
				}

			else {
				left = true;
				ship4X--;
			}

	
////////////////////  SET DOS  //////////////////////////////////			
			
			
			// shipx22
			if (right == true) {
				shipX22++;
				}

			else {
				left = true;
				shipX22--;
			}

					
////////////   ship23X   ////////////		
			if (right == true) {
				shipX23++;
				}

			else {
				left = true;
				shipX23--;
			}


////////////   shipX34   ////////////			
			if (right == true) {
				shipX34++;
				}

			else {
				left = true;
				shipX34--;
			}

			
			
////////////   shipX45   ////////////			
			if (right == true) {
				shipX45++;
				}

			else {
				left = true;
				shipX45--;
			}


			
			
			
			
			
			
//////////////  ShipX  ///////////// 
			
			if( shipX <= 0 ) {
				right=true;
				left=false;
			}
			
			if(shipX >= width ) {
				right=false;
				left=true;
				}
////////////   Ship2X  ///////////// 	
			
			if( ship2X <= 0 ) {
				right=true;
				left=false;
			}
			
			if(ship2X >= width ) {
				right=false;
				left=true;
			
			}
////////////  Ship3X  /////////////
			
			if( ship3X <= 0 ) {
				right=true;
				left=false;
			}
			
			if(ship3X >= width ) {
				right=false;
				left=true;
			
			}

			
////////////   Ship4X  /////////////
			
			if( ship4X <= 0 ) {
				right=true;
				left=false;
			}
			
			if(ship4X >= width ) {
				right=false;
				left=true;
			
			}

	}
	
	
	
	
}
