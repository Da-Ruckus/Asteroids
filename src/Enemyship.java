import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Enemyship {

	public Enemyship() {
		if (number == 1 && number != 2) {
			right = true;
		}

		else {
			left = true;
		}

	}

	boolean drawShip = true;
	boolean drawShip2 = true;
	boolean drawShip3 = true;
	boolean drawShip4 = true;

	boolean drawShip22 = true;
	boolean drawShip23 = true;
	boolean drawShip34 = true;
	boolean drawShip45 = true;

	public void draw(GraphicsContext gc) {
		gc.setFill(Color.WHITE);
		gc.save();

		if (drawShip) {
			double X[] = { shipX, shipX + 20, shipX - 20 };//40
			double Y[] = { shipY + 20, shipY - 20, shipY - 20 };//40
			gc.fillPolygon(X, Y, 3);
			gc.restore();
			
		}

		if (drawShip2) {
			double X2[] = { ship2X, ship2X + 20, ship2X - 20 };
			double Y2[] = { ship2Y + 20, ship2Y - 20, ship2Y - 20 };
			gc.fillPolygon(X2, Y2, 3);
			gc.restore();
		}

		if (drawShip3) {
			double X3[] = { ship3X, ship3X + 20, ship3X - 20 };
			double Y3[] = { ship3Y + 20, ship3Y - 20, ship3Y - 20 };
			gc.fillPolygon(X3, Y3, 3);
			gc.restore();
		}

		if (drawShip4) {
			double X4[] = { ship4X, ship4X + 20, ship4X - 20 };
			double Y4[] = { ship4Y + 20, ship4Y - 20, ship4Y - 20 };
			gc.fillPolygon(X4, Y4, 3);
			gc.restore();
		}

		if (drawShip22) {

			double X22[] = { shipX22, shipX22 + 20, shipX22 - 20 };
			double Y22[] = { shipY22 + 20, shipY22 - 20, shipY22 - 20 };
			gc.fillPolygon(X22, Y22, 3);
			gc.restore();

		}
		if (drawShip23) {

			double X23[] = { shipX23, shipX23 + 20, shipX23 - 20 };
			double Y23[] = { shipY23 + 20, shipY23 - 20, shipY23 - 20 };
			gc.fillPolygon(X23, Y23, 3);
			gc.restore();
		}

		if (drawShip34) {

			double X34[] = { shipX34, shipX34 + 20, shipX34 - 20 };
			double Y34[] = { shipY34 + 20, shipY34 - 20, shipY34 - 20 };
			gc.fillPolygon(X34, Y34, 3);
			gc.restore();
		}

		if (drawShip45) {

			double X45[] = { shipX45, shipX45 + 20, shipX45 - 20 };
			double Y45[] = { shipY45 + 20, shipY45 - 20, shipY45 - 20 };
			gc.fillPolygon(X45, Y45, 3);
			gc.restore();
		}

	}

	double shipX = 75;

	double shipY = 50;

	double ship2X = 225;

	double ship2Y = 50;

	double ship3X = 375;

	double ship3Y = 50;

	double ship4X = 525;

	double ship4Y = 50;
	

	// Next row of ships

	
	double shipX22 = 75;

	double shipY22 = 110;

	double shipX23 = 225;

	double shipY23 = 110;

	double shipX34 = 375;

	double shipY34 = 110;

	double shipX45 = 525;

	double shipY45 = 110;

	Random generator = new Random();
	int number = generator.nextInt(2) + 1;

	boolean right = false;
	boolean left = false;

	public void update(Keyboard key, GraphicsContext gc) {

		int edge = 575;

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

		
////////////////////  SET SECOND ROW  //////////////////////////////////			

		
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
		

//////////////  ShipX   Y axis      ///////////// 

		
		if (shipX <= 50) {
			right = true;
			left = false;

			if (right == true) {
				shipY += 20;
			}

		}

		if (shipX >= 100) {
			right = false;
			left = true;

			if (left == true) {
				shipY += 20;
			}
		}
////////////   Ship2X  ///////////// 	

		if (ship2X <= 200) {
			right = true;
			left = false;

			if (right == true) {
				ship2Y += 20;
			}

		}

		if (ship2X >= 250) {
			right = false;
			left = true;

			if (left == true) {
				ship2Y += 20;
			}

		}
////////////  Ship3X  /////////////

		if (ship3X <= 350) {
			right = true;
			left = false;

			if (right == true) {
				ship3Y += 20;
			}

		}

		if (ship3X >= 400) {
			right = false;
			left = true;

			if (left == true) {
				ship3Y += 20;
			}

		}

////////////   Ship4X  /////////////

		if (ship4X <= 500) {// 25
			right = true;
			left = false;

			if (right == true) {
				ship4Y += 20;
			}

		}

		if (ship4X >= 550) {// edge
			right = false;
			left = true;

			if (left == true) {
				ship4Y += 20;
			}

		}

////////////// ShipX22   Y axis      ///////////// 

		if (shipX22 <= 50) {
			right = true;
			left = false;

			if (right == true) {
				shipY22 += 20;
			}

		}

		if (shipX22 >= 100) {
			right = false;
			left = true;

			if (left == true) {
				shipY22 += 20;
			}

		}
		//////////// ShipX23 Y axis ////// 225 ////

		if (shipX23 <= 200) {
			right = true;
			left = false;

			if (right == true) {
				shipY23 += 20;
			}

		}

		if (shipX23 >= 250) {
			right = false;
			left = true;

			if (left == true) {
				shipY23 += 20;
			}

		}
		//////////// ShipX34 Y axis ///// 375 //////

		if (shipX34 <= 350) {
			right = true;
			left = false;

			if (right == true) {
				shipY34 += 20;
			}

		}

		if (shipX34 >= 400) {
			right = false;
			left = true;

			if (left == true) {
				shipY34 += 20;
			}

		}

		//////////// ShipX45 Y axis ////// 525 /////

		if (shipX45 <= 500) {
			right = true;
			left = false;

			if (right == true) {
				shipY45 += 20;
			}

		}

		if (shipX45 >= 550) {
			right = false;
			left = true;

			if (left == true) {
				shipY45 += 20;
			}

		}

	}

}
