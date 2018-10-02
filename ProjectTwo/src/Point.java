/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */
public class Point {

	final double x;
	final double y;

	/**
	 * Takes in two parameters and initializes variables 
	 * @param x initializes x value
	 * @param y initializes y value
	 */
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Used to get X value
	 * @return x value of point
	 */
	public double getvalueX() {
		return x;
	}

	/**
	 * Used to get Y value
	 * @return y value of point
	 */
	public double getvalueY() {
		return y;
	}

	/**
	 * Used to make equal comparison between two objects
	 * @return hash returns distinct integers for distinct objects
	 */
	@Override
	public int hashCode() {
		int hash = 3;
		int xLong = Double.hashCode(x);
		int yLong = Double.hashCode(y);
		hash = 31 * hash + xLong;
		hash = 31 * hash + yLong;
		return hash;
	}

	/**
	 * Used to determine equivalence between object instances
	 * @param obj used to compare objects of Point class
	 * @return if the objects are equal 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point p = (Point) obj;
		return x == p.x && y == p.y;
	}

	/**
	 * @return x and y points in string format
	 */
	@Override
	public String toString() {
		return "Value x: " + x + " Value y: " + y;
	}
}
