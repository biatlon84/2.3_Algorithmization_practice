package fraction;

public class ArrayZ {

	public ArrayZ(int z) {
		super();
		this.z = z;
		dr = new Fracti[z];
	}

	public int z;
	public Fracti[] dr;

	public Fracti getO(int i) {
		return dr[i];
	}

	public int size() {
		return z;
	}
}
