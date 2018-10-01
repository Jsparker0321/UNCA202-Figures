
public class BoundingBox {

	protected final Point leftCorner;
	private final double width;
	private final double height;

	BoundingBox(Point leftCorner, double width, double height) {
		this.leftCorner = leftCorner;
		this.width = width;
		this.height = height;

	}

	public Point getvalueleftCorner() {
		return leftCorner;
	}

	public double getvalueWidth() {
		return width;
	}

	public double getvalueHeight() {
		return height;
	}

	@Override
	public int hashCode() {
		int hash = 1;
		int widthLong = Double.hashCode(width);
		int heightLong = Double.hashCode(height);
		hash = 31 * leftCorner.hashCode();
		hash = 31 * widthLong;
		hash = 31 * heightLong;
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
		BoundingBox bb = (BoundingBox) obj;
		return width == bb.width && height == bb.height && leftCorner.equals(bb.leftCorner);
	}

	@Override
	public String toString() {
		return leftCorner.toString() + " Bounds: " + "( " + width + ", " + height + ") ";
	}

}
