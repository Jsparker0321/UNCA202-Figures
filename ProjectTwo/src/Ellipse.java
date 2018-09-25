import java.awt.Color;

public class Ellipse extends Figure {

	static Point one;
	static BoundingBox two;
	private double x;
	private double y;
	private double horizontalAxis;
	private double verticalAxis;

	
	public Ellipse(double x, double y, double horizontalAxis, double verticalAxis, Color color) {
		super(two, color, true);
 
		
		this.one = new Point(x,y);
		this.two = new BoundingBox(one, horizontalAxis, verticalAxis);
		
	}

	public double getvalueX() {
		return x;
	}
	
	
	public double getvalueY() {
		return y;
	}
	
	public double gethorizontalAxis() {
		return horizontalAxis;
	}

	public double getverticalAxis() {
		return verticalAxis;
	}
	
	
	public double area() {
		
		return (horizontalAxis * verticalAxis);
	}
	
	
	
}
