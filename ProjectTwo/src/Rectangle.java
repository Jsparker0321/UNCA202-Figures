import java.awt.Color;

public class Rectangle extends Figure {
	
	static Point one;
	static BoundingBox two;
	private double x;
	private double y;
	private double width;
	private double height;

	
	public Rectangle(double x, double y, double width, double height, Color color) {
		super(two, color, true);
 
		this.one = new Point(x,y);
		this.two = new BoundingBox(one, width, height);
		
	}


	public double getvalueX() {
		return x;
	}
	
	
	public double getvalueY() {
		return y;
	}
	
	
	public double getvalueWidth() {
		return width;
	}
	
	public double getvalueHeight() {
		return height;
	}
	
	public double area() {
		
		return (width * height);
	}

}
