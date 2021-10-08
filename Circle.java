package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Comparable <Rectangle>{
	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	
	public Circle(int upperX, int upperY, int width, int height, Color shapeColor) {
		super();
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	/**
	 * Method to draw a rectangle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
		//form.fillRect(upperX, upperY, width, height);
		form.drawArc(upperX,upperY,width,height,0,-90);
		form.fillArc(upperX,upperY,width,height,0,360);
	}
	

	public int getUpperX() {
		return upperX;
	}

	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}

	public int getUpperY() {
		return upperY;
	}

	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getShapeColor() {
		return shapeColor;
	}

	public void setShapeColor(Color shapeColor) {
		this.shapeColor = shapeColor;
	}

	@Override
	public int compareTo(Rectangle o) {
		int rec=o.getWidth()*o.getHeight();
		double yuan = Math.PI*this.width*this.width;
		if (rec>yuan) {
			return 1;			
		}else {
			return -1;
		}
	}
}
