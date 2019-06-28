package _01_houses;

import java.awt.AWTException;
import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();

	public static void main(String[] args) {
		bob.setX(20);
		bob.setY(550);
		bob.setSpeed(50);
		bob.penDown();
		bob.setPenColor(Color.red);
		String height = "";
		Random rand = new Random();
		for (int x = 0; x < 10; x++) {
			int z = rand.nextInt(3);
			if (z == 0) {
				height = "small";
			} else if (z == 1) {
				height = "medium";
			} else {
				height = "large";
			}
			drawHouse(height);
		}

	}

	static int size1 = 60;

	static void drawHouse(String height) {
		bob.setPenColor(Color.red);
		if (height.equals("small")) {
			size1 = 60; drawflatroof();
		} else if (height.equals("medium")) {
			size1 = 120; drawflatroof();
		} else {
			size1 = 200; drawpointyroof();
			
		}
		
	}
	static void drawpointyroof() {
		bob.move(size1);
		bob.turn(45);
		bob.move(50);
		bob.turn(90);
		bob.move(50);
		bob.turn(45);
		bob.move(size1);
		bob.turn(-90);
		bob.setPenColor(Color.green);
		bob.move(30);
		bob.turn(-90);
		bob.setPenColor(Color.red);
	}
	static void drawflatroof() {
		bob.move(size1);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(size1);
		bob.turn(-90);
		bob.setPenColor(Color.green);
		bob.move(30);
		bob.turn(-90);
		bob.setPenColor(Color.red);
	}
}
