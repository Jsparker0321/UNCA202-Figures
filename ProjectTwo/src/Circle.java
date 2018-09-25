import java.awt.Color;

public class Circle extends Ellipse{

	static Point one;
	static BoundingBox two;
	private double x;
	private double y;
	private double circleRadius;
	
	public Circle(double x, double y, double circleRadius, Color color) {
		super(x, y, color);
		
		
		
	}

	
	public double getvalueX() {
		return x;
	}
	
	
	public double getvalueY() {
		return y;
	}
	
	public double getcircleRadius(){
		return circleRadius;
		
	}
	
	
}
