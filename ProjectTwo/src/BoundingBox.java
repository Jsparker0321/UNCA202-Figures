
public class BoundingBox extends Point{

	Point leftCorner;
	final private double width;
	final private double height;
	
	BoundingBox(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
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
		long widthLong = Double.doubleToLongBits(width);
		long heightLong = Double.doubleToLongBits(height);
		hash = 31 * super.hashCode();
		hash = 31 * width.hashCode();
		hash = 31 * height.hashCode();
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
