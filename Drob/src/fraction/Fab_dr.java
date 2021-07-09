package fraction;

import java.util.ArrayList;

public class Fab_dr {

	public Fab_dr(int z) {
		super();
		this.z = z;
	}

	private int z;
	private ArrayList<Fracti> dr = new ArrayList<Fracti>();

	public ArrayList<Fracti> get(int lim) {
		for (int i = 0; i < z; i++) {
			this.dr.add(new Fracti((int) (Math.random() * lim + 1), (int) (Math.random() * lim + 1)));

		}
		return dr;
	}
}
