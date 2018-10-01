import java.awt.Color;
import java.lang.Math;

public class Circle extends Ellipse {

	public Circle(double x, double y, double circleRadius, Color color) {
		super(x, y, circleRadius, circleRadius, color);

	}

	public double getcircleRadius() {

		return this.box.getvalueHeight();

	}

	public double area() {

		return Math.PI * Math.pow(getcircleRadius(), 2);
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 31 * hash + super.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle c = (Circle) obj;
		return super.equals(c);
	}

	@Override
	public String toString() {
		return this.box.toString() + "Circle Radius: " + getcircleRadius();
	}
}
