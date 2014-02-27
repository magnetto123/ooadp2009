package dk.aau.imi.med4.ooadp2009.javainter.lesson01;

public class StaticFields {
	public static void main(String[] args) {
		Gizmo[] gizmoArray = new Gizmo[10];
		for (int i = 0; i < gizmoArray.length; i++)
			gizmoArray[i] = new Gizmo();
		for (Gizmo gizmo : gizmoArray)
			System.out.println(gizmo);

		System.out.println("numberOfGizmos = " + Gizmo.numG);

		// Following won't work because canIAlsoBeTheNumberOfGizmos is not
		// static and there is therefore a separate copy of this variable for
		// each object constructed.

		// System.out.println("canIAlsoBeTheNumberOfGizmos = " +
		// Gizmo.canIAlsoBeTheNumberOfGizmos);
	}

}
