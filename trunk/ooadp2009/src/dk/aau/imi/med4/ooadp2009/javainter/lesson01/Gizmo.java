package dk.aau.imi.med4.ooadp2009.javainter.lesson01;

/**
 * Explains use of a static field to store number of a particular type of object
 * that has been created.
 */
public class Gizmo {

	/**
	 * numberOfGizmos stores the number of Gizmos that have been constructed. It
	 * is static, which means that there is only one copy of this variable,
	 * stored in the class itself. Each Gizmo object does not have its own copy
	 * of this field.
	 */
	public static int numberOfGizmos = 0;

	/**
	 * canIAlsoBeTheNumberOfGizmos cannot also be the number of Gizmos because
	 * it isn't static.
	 */
	public int canIAlsoBeTheNumberOfGizmos = 0;

	/**
	 * id stores the id of this Gizmo
	 */
	public int id = 0;

	/**
	 * canIAlsoBeTheId can't be the ID because it is set using
	 * canIAlsoBeTheNumberOfGizmos which isn't static.
	 */
	public int canIAlsoBeTheId = 0;

	public Gizmo() {
		// Increase static field numberOfGizmos before setting id.
		id = ++numberOfGizmos;

		// Following will always be set to 1.
		canIAlsoBeTheId = ++canIAlsoBeTheNumberOfGizmos;
	}

	public String toString() {
		return "Gizmo: id=" + id + "; canIAlsoBeTheId=" + canIAlsoBeTheId
				+ "; canIAlsoBeTheNumberOfGizmos="
				+ canIAlsoBeTheNumberOfGizmos;
	}

	public static void main(String[] args) {
		Gizmo[] gizmoArray = new Gizmo[10];
		for (int i = 0; i < gizmoArray.length; i++)
			gizmoArray[i] = new Gizmo();
		for (Gizmo gizmo : gizmoArray)
			System.out.println(gizmo);

		System.out.println("numberOfGizmos = " + Gizmo.numberOfGizmos);

		// Following won't work because canIAlsoBeTheNumberOfGizmos is not
		// static and there is therefore a separate copy of this variable for
		// each object constructed.

		// System.out.println("canIAlsoBeTheNumberOfGizmos = " +
		// Gizmo.canIAlsoBeTheNumberOfGizmos);
	}

}
