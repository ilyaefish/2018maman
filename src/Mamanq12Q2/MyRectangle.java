package Mamanq12Q2;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public MyRectangle() {
		super();
	}

	public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean full) {
		super(x1, y1, x2, y2, color, full);
	}

	// This method was created in order to make the classes that extends this
	// class to implement paintComponent for their purposes
	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());

		g.drawRect(getX1(), getY1(), getX2(), getY2());
		if (this.fill) {
			g.fillRect(getX1(), getY1(), getX2(), getY2());
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MyRectangle cloned = (MyRectangle) super.clone();
		return new MyRectangle(cloned.getX1(), cloned.getY1(), cloned.getX2(), cloned.getY2(), cloned.getColor(),
				cloned.fill);
	}

}
