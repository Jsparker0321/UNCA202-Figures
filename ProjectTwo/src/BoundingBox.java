/**
 * @author Jessica Parker 
 * @version October 1st, 2018
 *			Abstract Classes and Inheritance
 *			CSCI 201
 */
public class BoundingBox {

	protected final Point leftCorner;
	private final double width;
	private final double height;

	/**
	 * Takes in three parameters and defines what a bounding box is and initializes variables
	 * @param leftCorner the x and y coordinates of the upper leftCorner (type is a Point)
	 * @param width initializes width of bounding box
	 * @param height initializes height of bounding box
	 */
	BoundingBox(Point leftCorner, double width, double height) {
		this.leftCorner = leftCorner;
		this.width = width;
		this.height = height;

	}

	/**
	 * gets the x and y point
	 * @return the point (x,y)
	 */
	public Point getvalueleftCorner() {
		return leftCorner;
	}

	/**
	 * Used to get width
	 * @return width of bounding box
	 */
	public double getvalueWidth() {
		return width;
	}

	/**
	 * Used to get height
	 * @return height of bounding box
	 */
	public double getvalueHeight() {
		return height;
	}

	/**
	 * Used to make equal comparison between two objects
	 * @return hash returns distinct integers for distinct objects
	 */
	@Override
	public int hashCode() {
		int hash = 1;
		int widthLong = Double.hashCode(width);
		int heightLong = Double.hashCode(height);
		hash = 31 * leftCorner.hashCode();
		hash = 31 * widthLong;
		hash = 31 * heightLong;
		return hash;
	}

	/**
	 * Used to determine equivalence between object instances
	 * @param obj used to compare objects of BoundingBox class
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
		BoundingBox bb = (BoundingBox) obj;
		return width == bb.width && height == bb.height && leftCorner.equals(bb.leftCorner);
	}

	/**
	 * Used to return values in string format
	 * @return leftCorner toString, width, and height
	 */
	@Override
	public String toString() {
		return leftCorner.toString() + " Bounds: " + "( " + width + ", " + height + ") ";
	}

}
