import java.awt.Color;

public class Square extends Rectangle {

	private double side;
	
	public Square(double x, double y, double side, Color color) {
		super(x, y, side, side, color);
		
		this.side = side;
		
	}


	public double getSide() {
		return side;
	}

	
	
	
	
}
