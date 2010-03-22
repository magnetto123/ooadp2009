package dk.aau.imi.med4.ooadp2009.javainter.lesson03;

public class StaticTest {
	
	private static void printHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		printHello();
		(new StaticTest()).printHello();
	}
}
