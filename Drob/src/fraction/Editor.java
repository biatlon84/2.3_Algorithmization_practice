package fraction;

public class Editor {
	public static Fracti getM(Fracti fr, long l) {
		long x;
		// System.out.print(e);

		x = l / fr.den;
		fr.numerator = fr.numerator * x;
		fr.den = l;

		return fr;
	}
}
