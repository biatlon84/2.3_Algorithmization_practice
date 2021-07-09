package fraction;

//finding a common denominator and sorting
public class Main {
	public static void main(String args[]) {
		int z = 2;
		long ev;
		long l = 0;
		ArOfFra arL = new ArOfFra(z);
		Fracti[] F = new Fracti[z];
		Denominator den = new Denominator();

		arL.generate(90); // Filling array of fractions
		for (int i = 0; i < z; i++) {
			F[i] = arL.getO(i);

		}

		ev = Evclid.getDen(den.getArr(F));
		l = Multiplier.getM(den.getArr(F));

		for (int i = 0; i < arL.size(); i++) {
			System.out.println(arL.getO(i));
		}

		System.out.println("" + l + " " + ev);
		Editor.getM(arL.dr, l / ev);

		for (int i = 0; i < arL.size(); i++) {
			System.out.println(arL.getO(i));
		}
		arL.sort();
		System.out.println("sort");
		for (int i = 0; i < arL.size(); i++) {
			System.out.println(arL.getO(i));
		}
		// Test_speed.start();
	}
}
