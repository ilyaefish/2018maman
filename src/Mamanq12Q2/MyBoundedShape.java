package Mamanq12Q2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape {
	boolean fill;

	public MyBoundedShape() {
		super();

	}

	public MyBoundedShape(int x1, int y1, int x2, int y2, Color color, boolean full) {
		super(x1, y1, x2, y2, color);
		setFill(full);

	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return (super.equals(obj) && this.isFill() == ((MyBoundedShape) obj).isFill());

	}

}
