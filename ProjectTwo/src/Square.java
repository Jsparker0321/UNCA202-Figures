import java.awt.Color;

public class Square extends Rectangle {

	public Square(double x, double y, double side, Color color) {
		super(x, y, side, side, color);

	}

	public double getSide() {
		return this.box.getvalueWidth();
	}

	public double area() {

		return Math.pow(getSide(), 2);
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
		Square s = (Square) obj;
		return super.equals(s);
	}

	@Override
	public String toString() {
		return "Length of side: " + this.box.getvalueWidth();
	}

}
