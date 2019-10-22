import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class House {
	static Robot Bigsad = new Robot();
public static void main(String[] args) {
	 Bigsad.setX(20);
	 Bigsad.setY(500);
	 Bigsad.setSpeed(5);
	 Bigsad.penDown();
	 	drawHouse("large");
	 	drawHouse("medium");
	 	drawHouse("small");
	 	
	}
	public static void drawHouse(String heightstring) {
		int height = 0;
		if(heightstring.equals("small")) {
			height = 60;
			 Bigsad.penDown();
			 Bigsad.move(height);
			Drawpointyroof();
			 Bigsad.turn(45);
			 Bigsad.move(height);
			 Bigsad.turn(270);
			 Bigsad.setPenColor(0, 150, 0);;
			 Bigsad.move(30);
			 Bigsad.setPenColor(100,100,100);
		}
		if(heightstring.equals("medium")) {
			height = 120;
			 Bigsad.penDown();
			 Bigsad.move(height);
			Drawpointyroof();
			 
			 Bigsad.move(height);
			 Bigsad.turn(270);
			 Bigsad.setPenColor(0, 150, 0);
			 Bigsad.move(30);
			 Bigsad.setPenColor(100,100,100);
		}
		if(heightstring.equals("large")) {
			height = 240;
			Drawflatroof();		
		}
			}
	public static void Drawpointyroof(){
		Bigsad.turn(45);
		Bigsad.move(30);
		Bigsad.turn(90);
		Bigsad.move(30);
		 Bigsad.move(45);
	
	}public static void Drawflatroof(){
		Bigsad.turn(90);
		Bigsad.move(20);
		Bigsad.turn(-90);
	}
}
