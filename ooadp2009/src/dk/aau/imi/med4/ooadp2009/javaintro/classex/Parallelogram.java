package dk.aau.imi.med4.ooadp2009.javaintro.classex;

public class Parallelogram extends Rect {
	private double topRightX;
	
	public Parallelogram() {
		setTopRightX(getBottomRight().getX());
	}
	
	public Parallelogram(Point topLeft, Point bottomRight, double topRightX) {
		super(topLeft,bottomRight);
		setTopRightX(topRightX);
	}

	public double getTopRightX() {
		return topRightX;
	}

	public void setTopRightX(double topRightX) {
		this.topRightX = topRightX;
	}
	
	public double getWidth() {
		if (getTopRightX() > getBottomRight().getX())
			return 2*getTopRightX() - getBottomRight().getX() - getTopLeft().getX();
		else
			return getBottomRight().getX() - getTopLeft().getX();
	}
	
	public double getArea() {
		return (getTopRightX() - getTopLeft().getX()) * getHeight();
	}
	
	public String toString() {
		return "[" + getTopLeft() + "," + getBottomRight() + "," + getTopRightX() + "]";
	}
}
