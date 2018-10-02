/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */
import java.awt.Color;
import java.lang.Math;

public class Circle extends Ellipse {
	
	/**
	 * Method takes in four parameters to define a Circle and initializes variables
	 * @param x coordinate of Circle
	 * @param y coordinate of Circle
	 * @param circleRadius radius of circle
	 * @param color defines the color 
	 */
	public Circle(double x, double y, double circleRadius, Color color) {
		super(x, y, circleRadius, circleRadius, color);

	}

	/**
	 *Gets the value of circleRadius by return the value of height
	 * @return the height of the bounding box
	 */
	public double getcircleRadius() {

		return this.box.getvalueHeight();

	}
	
	/**
	 *Used to obtain the area of a Circle
	 * @return double value representing the area of Circle
	 */
	public double area() {

		return Math.PI * Math.pow(getcircleRadius(), 2);
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
	 * @param obj used to compare objects of Circle class
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
		Circle c = (Circle) obj;
		return super.equals(c);
	}

	/**
	 * @return getcircleRadius in a string format 
	 */
	@Override
	public String toString() {
		return this.box.toString() + "Circle Radius: " + getcircleRadius();
	}
}
