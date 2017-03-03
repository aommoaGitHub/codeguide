package codeguide;

public interface Shape {
	/**
	 * Checking this shape's border has input point or not.
	 * 
	 * @param p is point to check
	 * @return true if input point is on the shape's border, otherwise return false
	 */
	public boolean constant(Point p); 
	
	/**
	 * Calculate the perimeter of the shape
	 * @param points is array of all vertex points of this shape 
	 * @return shape's perimeter
	 */
	public double perimeter();
}
