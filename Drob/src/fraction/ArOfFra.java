package fraction;

public class ArOfFra extends ArrayZ {

	public ArOfFra(int z) {
		super(z);
	}

	public void generate(int lim) {
		for (int i = 0; i < z; i++) {
			dr[i] = (new Fraction((int) (Math.random() * lim + 1), (int) (Math.random() * lim + 1)));
		}
	}

	public void sort() {
		quickSort(dr, 0, z - 1);
	}

	private void swap(int i, int j) {
		Fraction bu = dr[i];
		dr[i] = dr[j];
		dr[j] = bu;
	}

	private void quickSort(Fraction[] array, int low, int high) {
		if (low >= high)
			return;
		long opora;
		int middle = low + (high - low) / 2;
		opora = array[middle].numerator;
		int i = low, j = high;
		while (i <= j) {
			while (array[i].numerator < opora) {
				i++;
			}

			while (array[j].numerator > opora) {
				j--;
			}

			if ((i <= j)) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low <= j)
			quickSort(array, low, j);

		if (high >= i)
			quickSort(array, i, high);
	}
}