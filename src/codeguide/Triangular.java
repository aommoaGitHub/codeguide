package codeguide;

public class Triangular implements Shape {
	private Point vertexPoints;
	private double permitive;

	/**
	 * @see codeguide.Shape#constant(codeguide.Point)
	 */
	@Override
	public boolean constant(Point p) {
		// TODO code checking, Is point p on the border of this triangular?
		return false;
	}

	/**
	 * @see codeguide.Shape#perimeter(codeguide.Point[])
	 */
	@Override
	public double perimeter() {
		// TODO code for calculating this triangular's perimeter.
		return permitive;
	}

}
