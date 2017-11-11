package Mamanq12Q2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class MyShape extends JPanel implements Cloneable {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color myColor;

	public MyShape() {}
	public MyShape(int x1, int y1, int x2, int y2, Color myColor) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.myColor = myColor;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result =true;
		MyShape o =(MyShape) obj;
		if(this.getX1()!=o.getX1()){result=false;};
		if(this.getX2()!=o.getX2()){result=false;};
		if(this.getY1()!=o.getY1()){result=false;};
		if(this.getY2()!=o.getY2()){result=false;};
		if(this.getColor()!=o.getColor()){result=false;};
		return result;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public void setX1(int x) {
		x1 = x;
	}
	public void setY1(int y) {
		y1 = y;
	}
	public void setX2(int x) {
		x2 = x;
	}
	public void setY2(int y) {
		y2 = y;
	}
	public void setColor(Color color) {
		myColor = color;
	}
	public int getX1() {
		return x1;
	}
	public int getX2() {
		return x2;
	}
	public int getY1() {
		return y1;
	}
	public int getY2() {
		return y2;
	}
	public Color getColor() {
		return myColor;
	}

	public abstract void draw(Graphics g);
}