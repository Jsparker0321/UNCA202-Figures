import java.awt.Color;

public class Circle extends Ellipse{

	
	private double circleRadius;
	
	
	public Circle(double x, double y, double circleRadius, Color color) {
		super(x, y, circleRadius, circleRadius, color);
		
		this.circleRadius = circleRadius;
	}


	public double getcircleRadius(){
		
		return circleRadius;
		
	}
	
	
}
