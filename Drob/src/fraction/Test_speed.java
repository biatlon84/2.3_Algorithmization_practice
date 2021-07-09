package fraction;

public class Test_speed {
	public static void start() {
		long pp, ev;
		long x = 28;
		long y = 240;
		// int ar[] = { 8, 16, 8439622, 32, 1396054, 3 };
		long evt;
		long DD;
		DD = System.currentTimeMillis();
		pp = NonEvclid.getDen(y, y, x, x);
		DD = System.currentTimeMillis() - DD;
		// -------------------------
		evt = System.currentTimeMillis();
		ev = Evclid.get(y, x);
		// ev = Evclid.getDen(ar);
		evt = System.currentTimeMillis() - evt;
		System.out.println(">>" + ev + " Ev " + evt);
		System.out.println(">>" + pp + " Si " + DD);
		System.out.println(System.nanoTime());
		// -------------------

	}

}
