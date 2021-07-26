package fraction;

public class Editor {
	public static Fraction[] getM(Fraction[] fr, long minC) {
		long x;
		Fraction f;
		for (int i = 0; i < fr.length; i++) {
			f = fr[i];
			x = minC / f.den;
			f.numerator = f.numerator * x;
			f.den = minC;
			fr[i] = f;
		}
		return fr;
	}
}
