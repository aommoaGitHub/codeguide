package codeguide;

public class Point {
	private int x;
	private int y;
	
	/**
	 * initialize a point to an origin (0,0)
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * initialize a point to an (x,y)
	 * @param x input coordinate
	 * @param y input coordinate
	 */
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Accessor of x value
	 * @return x value of this point
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Accessor of y value
	 * @return y value of this point
	 */
	public int getY() {
		return y;
	}
}
