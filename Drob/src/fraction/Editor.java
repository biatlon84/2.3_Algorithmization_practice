package fraction;

public class Editor {
	public static Fracti[] getM(Fracti[] fr, long minC) {
		long x;
		Fracti f;
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
