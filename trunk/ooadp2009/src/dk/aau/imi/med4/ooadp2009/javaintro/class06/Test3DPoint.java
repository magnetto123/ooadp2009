package dk.aau.imi.med4.ooadp2009.javaintro.class06;

/**
 * Inheritance, "extends", "super", toString method.
 */
public class Test3DPoint {
	public static void main(String[] args) {
		
		// Let's create a ThreeDimensionalPoint using the no-args constructor.
		ThreeDimensionalPoint p = new ThreeDimensionalPoint();
		System.out.println("p.x = " + p.getX() // Inherited from Point
				+ ", p.y = " + p.getY() // Inherited from Point
				+ ", p.z = " + p.getZ() // Defined in ThreeDimensionalPoint
				);

		p.setX(2.0); // Inherited from Point
		p.setY(3.0); // Inherited from Point
		p.setZ(4.0); // Defined in ThreeDimensionalPoint
		System.out.println("p.x = " + p.getX() // Inherited from Point
				+ ", p.y = " + p.getY() // Inherited from Point
				+ ", p.z = " + p.getZ() // Defined in ThreeDimensionalPoint
				);
	}
}
