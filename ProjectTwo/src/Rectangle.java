/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */
import java.awt.Color;

public class Rectangle extends Figure {

	/**
	 * Takes in five parameters that define a Rectangle
	 * @param x coordinate of upper left corner
	 * @param y coordinate of upper left corner
	 * @param width initialize width of rectangle
	 * @param height initialize height of rectangle
	 * @param color initialize a color
	 */
	public Rectangle(double x, double y, double width, double height, Color color) {
		super(new BoundingBox(new Point(x, y), width, height), color, true);

	}

	/**
	 * Used to get X value
	 * @return access the points from the bounding box and returns x value
	 */
	public double getvalueX() {
		return this.box.leftCorner.getvalueX();
	}
	
	
	/**
	 * Used to get Y value
	 * @return access the points from the bounding box and returns y value
	 */
	public double getvalueY() {
		return this.box.leftCorner.getvalueY();
	}

	/**
	 * Used to get width
	 * @return access the bounding box and returns the width
	 */
	public double getvalueWidth() {
		return this.box.getvalueWidth();
	}

	/**
	 * Used to get height
	 * @return access the bounding box and returns the height
	 */
	public double getvalueHeight() {
		return this.box.getvalueHeight();
	}

	/**
	 *Used to obtain the area of a Rectangle
	 * @return double value representing the area of Rectangle
	 */
	public double area() {

		return (this.box.getvalueWidth() * this.box.getvalueHeight());
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
	 * @param obj used to compare objects of Rectangle class
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
		Rectangle r = (Rectangle) obj;
		return super.equals(r);
	}

	/**
	 * @return the Figure toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}
