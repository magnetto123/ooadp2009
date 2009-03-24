package dk.aau.imi.med4.ooadp2009.javainter.lesson02;

/**
 * Illustrates use of final field. A final field is one that cannot be changed
 * after it has been initialized.
 */
public class Fooble {
	public static final double pi = 3.141;

	public final double ip = 1.413;

	public final double beep;

	/**
	 * Here's the no-args constructor for the Fooble class
	 */
	public Fooble() {

		// beep hasn't been initialized so we can set its value in the
		// constructor
		beep = 1.1111;

		// ip has been initialized when it was declared so we can't set its
		// value in the constructor
		// ip = 3.3333;
	}

	public static void main(String[] args) {

		// Let's print out the value of the final static field, pi.
		System.out.println("Fooble.pi = " + Fooble.pi);

		// Now try to change value of pi field in Fooble
		// Fooble.pi = 22.0/7;
		// Can't do it because the pi field is final and it has already been
		// assigned.

		// Now we create a Fooble object. It's final ip field is
		// initialized to 1.413 in the declaration of the ip field.
		Fooble f = new Fooble();
		System.out.println("f.ip = " + f.ip);
		System.out.println("f.beep = " + f.beep);
	}
}
