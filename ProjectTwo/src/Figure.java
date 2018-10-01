import java.awt.Color;

public abstract class Figure {

	BoundingBox box;
	private Color color;
	private boolean visible;

	public Figure(BoundingBox box, Color color, boolean visible) {
		this.box = box;
		this.color = color;
		this.visible = visible;
	}

	public void makeVisible() {
		visible = true;
	}

	public void makeInvisible() {
		visible = false;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();

	public void dilate(double factor) {
		double width = this.box.getvalueWidth() * Math.sqrt(factor);
		double height = this.box.getvalueHeight() * Math.sqrt(factor);
		this.box = new BoundingBox(this.box.leftCorner, width, height);
	}

	public void translate(double horizontalMove, double verticalMove) {
		Point pointTwo;
		BoundingBox two;

		pointTwo = new Point(this.box.leftCorner.getvalueX() + horizontalMove,
				this.box.leftCorner.getvalueY() + verticalMove);
		this.box = new BoundingBox(pointTwo, this.box.getvalueHeight(), this.box.getvalueWidth());
	}

	public static boolean larger(Figure one, Figure two) {
		if (one.area() > two.area()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + color.hashCode();
		hash = 31 * hash + Boolean.hashCode(visible);
		hash = 31 * hash + box.hashCode();
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
		Figure f = (Figure) obj;
		return color.equals(f.color) && visible == f.visible && box.equals(f.box);
	}

	@Override
	public String toString() {
		return "Figure: " + "Color is: " + color + "Visibility: " + visible + "Box: " + box;
	}

}
