package fraction;

public class Fracti {

	public long den = 1;
	public long numerator = 1;

	public Fracti(int x, int y) {
		den = x;
		numerator = y;
	}

	@Override
	public String toString() {
		return "Fracti [den=" + den + ", numerator=" + numerator + "]";
	}

}
