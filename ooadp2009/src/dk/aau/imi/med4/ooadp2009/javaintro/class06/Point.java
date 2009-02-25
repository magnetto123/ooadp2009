package dk.aau.imi.med4.ooadp2009.javaintro.class06;

public class Point {

	private double x, y;

	public Point() {
		setX(0.0);
		setY(0.0);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

	/*
	 * Every class in Java is a subclass of the Object class. The Object class
	 * has a method whose signature is
	 * 
	 * public String toString()
	 * 
	 * This method returns a String that represents the object on which it is
	 * called. For example,
	 * 
	 * t.toString();
	 * 
	 * should return an appropriate String description of the object t.
	 * 
	 * Every class you create therefore inherits a toString method from its
	 * superclass (which might be the Object class if the class does not have an
	 * explicit superclass). This inherited method should be overridden in every
	 * class you create so that it generates a String that appropriately
	 * represents objects of the class.
	 * 
	 * The definition of the toString method should return an appropriate
	 * description of an instance of the class.
	 * 
	 * This toString method overrides the one defined in the Object class.
	 */

	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}

}