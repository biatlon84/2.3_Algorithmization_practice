package fraction;

public class NonEvclid {
	public static long getDen(long y, long a, long b, long x) {
		long i = 1;
		long o = 0;

		i = x < y ? x : y;
		o = a < b ? a : b;
		i = i < o ? i : o;
		i++;
		boolean w = true;
		try {
			while (w) {
				i--;
				w = false;
				if (y % i != 0) {
					w = true;
				}
				if (a % i != 0) {
					w = true;
				}
				if (b % i != 0) {
					w = true;
				}
				if (x % i != 0) {
					w = true;
				}
			}
		} catch (ArithmeticException e) {
			System.out.println("zero");
		}
		return i;
	}
}