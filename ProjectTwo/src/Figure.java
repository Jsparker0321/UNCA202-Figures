import java.awt.Color;

public abstract class Figure {

	BoundingBox box;
	private String color;
	private boolean visible;
	
	public Figure(BoundingBox box, String color, boolean visible) {
		this.box = box;
		this.color = color;
		this.visible = visible;
	}
	
	public void makeVisible() {
		
	}
	
	public void makeInvisible() {
		
	}
	
	public void setColor() {
		
	}
	
	//public abstract double area();
	
	public void dilate() {
		
	}
	
	public void translate() {
		
	}
	
	public static void larger() {
		
	}
}
