package fraction;

public class Denominator {
	public long[] getArr(Fraction[] array) {
		long[] ar = new long[array.length];
		for (int i = 0; i < array.length; i++) {
			ar[i] = array[i].den;
		}
		return ar;
	}

}
