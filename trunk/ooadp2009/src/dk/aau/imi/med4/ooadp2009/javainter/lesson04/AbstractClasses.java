package dk.aau.imi.med4.ooadp2009.javainter.lesson04;

/**
 * This package illustrates the use of abstract classes.
 * 
 * An abstract method is one that is not implemented.
 * 
 * An abstract class is one that contains at least one abstract method.
 * 
 * An abstract class cannot be instantiated because not all of its methods are
 * implemented.
 */
public class AbstractClasses {
	public static void main(String[] args) {
		
		//Cannot instantiate a Shape object because it is abstract
//		Shape s = new Shape();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.5,new Point(3.0,3.0));
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(new Point(1.0,4.0), new Point(4.0,1.0));
		
		Shape[] shapes = {c1, c2, r1, r2};
		
		for (Shape s : shapes) {
			for (int i = 0; i < 2; i++) {
				System.out.print(s);
				System.out.println(" height = " + s.getHeight());
				System.out.println(" width = " + s.getWidth());
				System.out.println(" area = " + s.getArea());
				System.out.println(" topLeft = " + s.getTopLeft());
				System.out.println(" bottomRight = " + s.getBottomRight());
				s.translate(new Vec(3.0,2.0));
			}
		}
		
		

		
	}
}
