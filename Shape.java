package shape;

public abstract class Shape {
	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	
	public Shape(int upperX, int upperY, int width, int height) {
		super();
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
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
	//Creat a rectangle
	abstract void fillRect(int x, int y, int width, int height);
	
	// creat a circle
	abstract void drawOval(int x, int y, int width, int height);
	//fill a circle
	abstract void fillOval(int x, int y, int width, int height);
}
