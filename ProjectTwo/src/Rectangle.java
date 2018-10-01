import java.awt.Color;

public class Rectangle extends Figure {

	public Rectangle(double x, double y, double width, double height, Color color) {
		super(new BoundingBox(new Point(x, y), width, height), color, true);

	}

	public double getvalueX() {
		return this.box.leftCorner.getvalueX();
	}

	public double getvalueY() {
		return this.box.leftCorner.getvalueY();
	}

	public double getvalueWidth() {
		return this.box.getvalueWidth();
	}

	public double getvalueHeight() {
		return this.box.getvalueWidth();
	}

	public double area() {

		return (this.box.getvalueWidth() * this.box.getvalueHeight());
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
		Rectangle r = (Rectangle) obj;
		return super.equals(r);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
