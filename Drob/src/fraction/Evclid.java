package fraction;

public class Evclid {
	public static long getDen(long[] ar) {
		if (ar.length < 2)
			return 0;
		long a = ar[0];
		long b = ar[1];
		try {
			while ((a != 0) && (b != 0)) {
				if (a > b) {
					a = a % b;
				} else {
					b = b % a;
				}
			}
			for (int i = 2; i < ar.length; i++) {
				b = a + b;
				a = ar[i];
				while ((a != 0) && (b != 0)) {
					if (a > b) {
						a = a % b;
					} else {
						b = b % a;
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println("zero");
		}
		return b + a;
	}

	public static long get(long a, long b) {
		long bu = 0;
		long x = a < b ? a : b;
		long y = a < b ? b : a;
		boolean w = true;
		try {
			while (w) {
				bu = y % x;
				if (bu != 0) {
					y = x;
					x = bu;
				} else {
					w = false;
				}
			}
		} catch (ArithmeticException e) {
			System.out.println("zero");
		}
		return x;
	}
}
