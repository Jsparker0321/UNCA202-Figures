/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */
import java.awt.Color;

public class Ellipse extends Figure {


	/**
	 * Method takes in five parameters to define an Ellipse
	 * @param x  center coordinate of Ellipse
	 * @param y	 center coordiante of Ellipse
	 * @param horizontalAxis lengths 
	 * @param verticalAxis lenghts
	 * @param color defines a color
	 */
	public Ellipse(double x, double y, double horizontalAxis, double verticalAxis, Color color) {
		super(new BoundingBox(new Point(x, y), horizontalAxis, verticalAxis), color, true);

	}


	/**
	 *Gets the value of X
	 * @return access the x point from bounding box and returns x value
	 */
	public double getvalueX() {
		return this.box.leftCorner.getvalueX();
	}

	/**
	 *Gets the value of Y
	 * @return access the y point from bounding box and returns y value
	 */
	public double getvalueY() {
		return this.box.leftCorner.getvalueY();
	}

	/**
	 *Gets horizontalAxis of ellipse
	 * @return access the bounding box and returns width
	 */
	public double gethorizontalAxis() {
		return this.box.getvalueWidth();
	}

	/**
	 *Gets verticalAxis of ellipse
	 * @return access the bounding box and returns height
	 */
	public double getverticalAxis() {
		return this.box.getvalueHeight();
	}

	/**
	 *Used to obtain the area of an Ellipse
	 * @return double value representing the area of Ellipse
	 */
	public double area() {

		return Math.PI * (gethorizontalAxis() * getverticalAxis());
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
	 * @param obj used to compare objects of the Ellipse class
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
		Ellipse e = (Ellipse) obj;
		return super.equals(e);
	}

	/**
	 * @return BoundingBox toString, gethorizontalAxis(), and getVerticalAxis() in a string format 
	 */
	@Override
	public String toString() {
		return this.box.toString() + "Horizontal Axis: " + gethorizontalAxis() + "Vertical Axis: " + getverticalAxis();
	}

}
