package fraction;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		int z = 3;
		long ev;
		long l = 0;
		Fab_dr arL = new Fab_dr(z);
		Fracti[] F = new Fracti[z];
		Denominator den = new Denominator();
		ArrayList<Fracti> list = new ArrayList<Fracti>();
		list = arL.get(90); // Create array of fractions
		for (int i = 0; i < z; i++) {
			F[i] = list.get(i);

		}

		ev = Evclid.getDen(den.getArr(F));
		l = Multiplier.getM(den.getArr(F));
		for (int i = 0; i < list.size(); i++) {
			// System.out.println(den.getArr(F)[i]);
			System.out.println(list.get(i));
		}
		System.out.println("" + l + " " + ev);
		for (int i = 0; i < z; i++) {
			list.set(i, Editor.getM(list.get(i), l / ev));
		}
		// Test_speed.start();
		for (int i = 0; i < list.size(); i++) {
			// System.out.println(den.getArr(F)[i]);
			System.out.println(list.get(i));
		}

	}
}
