/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */
import java.awt.Color;

public class Square extends Rectangle {

	/**
	 * Takes in four parameters that define a Square and initialize variables
	 * @param x coordinate of upper left corner
	 * @param y coordinate of upper left corner
	 * @param side initialize length of side
	 * @param color initialize a color
	 */
	public Square(double x, double y, double side, Color color) {
		super(x, y, side, side, color);

	}

	/**
	 * Used to get length of side
	 * @return access bounding box and return width
	 */
	public double getSide() {
		return this.box.getvalueWidth();
	}

	/**
	 *Used to obtain the area of a Square
	 * @return double value representing the area of Square
	 */
	public double area() {

		return Math.pow(getSide(), 2);
	}

	/**
	 * Used to make equal comparison between two objects
	 * @return hash returns distinct integers for distinct objects
	 */
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 31 * hash + super.hashCode();
		return hash;
	}

	/**
	 * Used to determine equivalence between object instances
	 * @param obj used to compare objects of Square class
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
		Square s = (Square) obj;
		return super.equals(s);
	}

	/**
	 * @return width of bounding box in string format
	 */
	@Override
	public String toString() {
		return "Length of side: " + this.box.getvalueWidth();
	}

}
