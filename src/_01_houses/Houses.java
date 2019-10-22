package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot Bigsad =  new Robot();
	public static void main(String[] args) {
			Bigsad.setX(20);
			Bigsad.setY(550);	
			Bigsad.setSpeed(10);		
			Bigsad.penDown();
			drawHouse("medium");
		
		}
	
		public static void drawHouse(String heightString) {
			String bob = JOptionPane.showInputDialog("What size?");
			int height = 0;
			if(bob.equals("small")) {
				height = 60;
				Bigsad.move(height);
				drawPointyRoof();
			} 
			if(bob.equals("meduim")) {
				height = 120;
				Bigsad.move(height);
				drawPointyRoof();
			}
			if(bob.equals("large")) {
				height = 250;
				Bigsad.move(height);
				drawFlatRoof();
			}
			//Bigsad.move(height);
			//Bigsad.turn(90);
			//Bigsad.move(20);
			//Bigsad.turn(90);
			//Bigsad.move(height); 
			//Bigsad.turn(270);
			//Bigsad.setPenColor(0,250,0);
			//Bigsad.move(30);
			//Bigsad.setPenColor(100,100,100);
			//Bigsad.turn(270);
		}
		public static void drawPointyRoof() {
			Bigsad.turn(45);
			Bigsad.move(25);
			Bigsad.turn(90);
			Bigsad.move(25);
			Bigsad.turn(45);
		}
		public static void drawFlatRoof() {
			Bigsad.turn(90);
			Bigsad.move(20);
			Bigsad.turn(90);
		}
		{
			
		
		} }

	 

