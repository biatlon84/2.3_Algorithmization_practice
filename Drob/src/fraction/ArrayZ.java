package fraction;

public class ArrayZ {

	public ArrayZ(int z) {
		super();
		this.z = z;
		dr = new Fraction[z];
	}

	public int z;
	public Fraction[] dr;

	public Fraction getO(int i) {
		return dr[i];
	}

	public int size() {
		return z;
	}
}
