
public class Point {

	final double x;
	final double y;
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getvalueX() {
		return x;
	}
	
	public void setvalueX(double x) {
		this.x = x;
	}
	
	public double getvalueY() {
		return y;
	}
	
	public void setvalueY(double y) {
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		int hash = 3;
		long xLong = Double.doubleToLongBits(x);
		long yLong = Double.doubleToLongBits(y);
		hash = 31 * hash + x;
		hash = 31 * hash + y.hashCode();
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Point p = (Point) obj;
		return Double.valueOf(x).equals(Double.valueOf(p.x))  && Double.valueOf(y).equals(Double.valueOf(p.y));
	}
	
	@Override
	public String toString() {
		return "Value x: " + x + " Value y: " + y;
	}
}
