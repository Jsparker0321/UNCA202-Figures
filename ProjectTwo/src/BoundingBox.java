
public class BoundingBox{

	Point leftCorner;
	final private double width;
	final private double height;
	
	BoundingBox(Point x, double width, double height) {
		this.leftCorner = x;
		this.width = width;
		this.height = height;
		
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
		hash = 31 * super.hashCode();
		hash = 31 * widthLong;
		hash = 31 * heightLong;
		return hash;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		if (!super.equals(obj)) return false;
		BoundingBox bb = (BoundingBox) obj;
		return Double.valueOf(width).equals(Double.valueOf(bb.width))  && Double.valueOf(height).equals(Double.valueOf(bb.height));
	}
	
	@Override
	public String toString() {
		return super.toString() + " Bounds: " + "( " + width + ", " + height + ") ";
	}

}
