import java.awt.Color;
import java.lang.Math;

public class Circle extends Ellipse {

	private double circleRadius;

	public Circle(double x, double y, double circleRadius, Color color) {
		super(x, y, circleRadius, circleRadius, color);

		this.circleRadius = circleRadius;
	}

	public double getcircleRadius() {

		return circleRadius;

	}

	public double area() {

		return (Math.PI * circleRadius * circleRadius);
	}

}
