
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
	
	
	public double getvalueY() {
		return y;
	}
	
	
	
	@Override
	public int hashCode() {
		int hash = 3;
		int xLong = Double.hashCode(x);
		int yLong = Double.hashCode(y);
		hash = 31 * hash + xLong;
		hash = 31 * hash + yLong;
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
