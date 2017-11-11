package Mamanq12Q2;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape {
	public MyOval() {
		super();
	}

	public MyOval(int x1, int y1, int x2, int y2, Color color, boolean full) {
		super(x1, y1, x2, y2, color, full);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawOval(getX1(), getY1(), getX2(), getY2());
		if (this.fill){
			g.fillOval(getX1(), getY1(), getX2(), getY2());
		}
	}


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		MyOval cloned=  (MyOval)super.clone();
		return new  MyOval(cloned.getX1(),cloned.getY1(),cloned.getX2(),cloned.getY2(), cloned.getColor(),  cloned.fill);
	}

}
