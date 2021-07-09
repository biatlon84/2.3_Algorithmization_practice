package fraction;

public class Multiplier {
	public static long getM(long[] array) {
		long mx = 1;
		for (int i = 0; i < array.length; i++) {
			mx *= array[i];
		}
		return mx;
	}
}
