import java.awt.Color;

public class Ellipse extends Figure {

	public Ellipse(double x, double y, double horizontalAxis, double verticalAxis, Color color) {
		super(new BoundingBox(new Point(x, y), horizontalAxis, verticalAxis), color, true);

	}

	public double getvalueX() {
		return this.box.leftCorner.getvalueX();
	}

	public double getvalueY() {
		return this.box.leftCorner.getvalueY();
	}

	public double gethorizontalAxis() {
		return this.box.getvalueWidth();
	}

	public double getverticalAxis() {
		return this.box.getvalueHeight();
	}

	public double area() {

		return Math.PI * (gethorizontalAxis() * getverticalAxis());
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
		Ellipse e = (Ellipse) obj;
		return super.equals(e);
	}

	@Override
	public String toString() {
		return this.box.toString() + "Horizontal Axis: " + gethorizontalAxis() + "Vertical Axis: " + getverticalAxis();
	}

}
