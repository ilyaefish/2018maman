package Mamanq12Q2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

// this class inherits a panel and is responsible for drawing 10 random shapes
public class DrawPanel extends JPanel {
	private MyShape shapes[]; // array of shapes to be drawn
	private static final int NUM_OF_SHAPES = 6;
	private static final int NUM_OF_PIXEL_MOVE = 10;
	private static final int NUM_OF_RANDOM_SIZE = 200;
	private Random random;
	// creates a new instance of DrawPanel
	public DrawPanel() throws CloneNotSupportedException {
		random = new Random();
		//I will create 6 shapes and the clone it and move X1 and Y1 to 10 Pixe
		shapes = new MyShape[2 * NUM_OF_SHAPES];
		shapes[0] = new MyLine(random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		shapes[1] = new MyLine(random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		shapes[2] = new MyOval(random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)), true);
		shapes[3] = new MyOval(random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)), true);
		shapes[4] = new MyRectangle(random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)), true);
		shapes[5] = new MyRectangle(random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				random.nextInt(NUM_OF_RANDOM_SIZE), random.nextInt(NUM_OF_RANDOM_SIZE),
				new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)), true);
		// Now we will create the cloned shapes
		for (int i = NUM_OF_SHAPES; i < (NUM_OF_SHAPES * 2); i++) {
			if (shapes[i - NUM_OF_SHAPES] instanceof MyLine) {
				shapes[i] = (MyLine) shapes[i - NUM_OF_SHAPES].clone();
				shapes[i].setX1(shapes[i].getX1() + NUM_OF_PIXEL_MOVE);
				shapes[i].setY1(shapes[i].getY1() + NUM_OF_PIXEL_MOVE);
			} else {
				shapes[i] = (MyBoundedShape) shapes[i - NUM_OF_SHAPES].clone();
				shapes[i].setX1(shapes[i].getX1() + NUM_OF_PIXEL_MOVE);
				shapes[i].setY1(shapes[i].getY1() + NUM_OF_PIXEL_MOVE);
				((MyBoundedShape) shapes[i]).setFill(!((MyBoundedShape) shapes[i]).isFill());
			}
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (MyShape shape : shapes) {
			shape.draw(g);
		}
	}
}
