/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */

import java.awt.Color;

public abstract class Figure {

	BoundingBox box;
	private Color color;
	private boolean visible;


	/**
	 * Method takes in three parameters to define a Figure
	 * @param box creates a bounding box
	 * @param color initializes color
	 * @param visible initializes visibility
	 */
	public Figure(BoundingBox box, Color color, boolean visible) {
		this.box = box;
		this.color = color;
		this.visible = visible;
	}

	public void makeVisible() {
		visible = true;
	}

	public void makeInvisible() {
		visible = false;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Abstract method to be implemented in other classes
	 * @return double representing area of a figure
	 */
	public abstract double area();

	public void dilate(double factor) {
		double width = this.box.getvalueWidth() * Math.sqrt(factor);
		double height = this.box.getvalueHeight() * Math.sqrt(factor);
		this.box = new BoundingBox(this.box.leftCorner, width, height);
	}

	public void translate(double horizontalMove, double verticalMove) {
		Point pointTwo;
		BoundingBox two;

		pointTwo = new Point(this.box.leftCorner.getvalueX() + horizontalMove,
				this.box.leftCorner.getvalueY() + verticalMove);
		this.box = new BoundingBox(pointTwo, this.box.getvalueHeight(), this.box.getvalueWidth());
	}


	/**
	 * Method takes in two parameters to evaluate if one is bigger than the other
	 * @param one
	 * @param two
	 * @return true or false if the area of figure one is greater than the are of Figure two 
	 */
	public static boolean larger(Figure one, Figure two) {
		if (one.area() > two.area()) {
			return true;
		}
		return false;
	}

	/**
	 * Used to make equal comparison between two objects
	 * @return hash returns distinct integers for distinct objects
	 */
	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + color.hashCode();
		hash = 31 * hash + Boolean.hashCode(visible);
		hash = 31 * hash + box.hashCode();
		return hash;
	}

	/**
	 * Used to determine equivalence between object instances
	 * @param obj used to compare objects of Figure class
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
		Figure f = (Figure) obj;
		return color.equals(f.color) && visible == f.visible && box.equals(f.box);
	}

	/**
	 * @return color, visibility, and bounding box in a string format 
	 */
	@Override
	public String toString() {
		return "Figure: " + "Color is: " + color + "Visibility: " + visible + "Box: " + box;
	}

}
