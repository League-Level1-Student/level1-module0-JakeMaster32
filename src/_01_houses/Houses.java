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
    Random rand = new Random();
	for (int x = 0; x <10; x++) {
		 int z = rand.nextInt(150);
		 z = z+50;
		drawHouse(z);
	}
   
    
}
static void drawHouse(int height) {
	bob.move(height);
    bob.turn(90);
    bob.move(50);
    bob.turn(90);
    bob.move(height);
    bob.turn(-90);
    bob.setPenColor(Color.green);
    bob.move(30);
    bob.turn(-90);
    bob.setPenColor(Color.black);
}
}

