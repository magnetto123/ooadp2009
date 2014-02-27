package dk.aau.imi.med4.ooadp2009.javainter.lesson01;

/**
 * Explains use of a static field to store number of a particular type of object
 * that has been created.
 */
public class Gizmo {

	/**
	 * numG stores the number of Gizmos that have been constructed. It
	 * is static, which means that there is only one copy of this variable,
	 * stored in the class itself. Each Gizmo object does not have its own copy
	 * of this field.
	 */
	public static int numG = 0;

	/**
	 * NOTnumG cannot also be the number of Gizmos because
	 * it isn't static.
	 */
	public int NOTnumG = 0;

	/**
	 * id stores the id of this Gizmo
	 */
	public int id = 0;

	/**
	 * NOTid can't be the ID because it is set using
	 * NOTnumG which isn't static.
	 */
	public int NOTid = 0;

	public Gizmo() {
		// Increase static field numberOfGizmos before setting id.
		id = ++numG;

		// Following will always be set to 1.
		NOTid = ++NOTnumG;
	}

	public String toString() {
		return "Gizmo: id=" + id + "; canIAlsoBeTheId=" + NOTid
				+ "; canIAlsoBeTheNumberOfGizmos="
				+ NOTnumG;
	}


}
