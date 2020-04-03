
public class TSPModel {

	private int X[];
	private boolean marked[];
	private double f;
	private double best_f;
	private int best_X[];
	private double c[][];
	
	public boolean check(int k, int v) {

		if (c[X[k - 1]][v] == 0) {
			return false;
		}

		if (k == c.length - 1) {
			if (c[v][0] == 0)
				return false;
		}

		return marked[v];
	}
	
	public void tryValue(int k) {

		for (int i = 1; i < c.length; i++) {
			if (check(k, i) == true) {
				X[k] = i;
				marked[i] = false;
				if (k == c.length - 1) {
					updateBest();
				} else {
					tryValue(k + 1);
				}
				marked[i] = true;
			}
		}
	}
	
	public void updateBest() {

		f = 0.0;
		for (int i = 0; i < c.length - 1; i++) {
			f += c[X[i]][X[i + 1]];
		}
		f += c[X[c.length - 1]][0];

		if (best_X == null) {
			best_X = new int[c.length];
			best_f = f;
		}

		if (f <= best_f) {
			for (int i = 0; i < c.length; i++) {
				best_X[i] = X[i];
			}
			best_f = f;
		}
	}
	
	public void prinsolution() {

		if (best_X == null) {
			System.out.println("Not solution");
			return;
		}

		System.out.println("Best solution: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(best_X[i] + " -> ");
		}
		System.out.print(X[0]);
		System.out.println();
		System.out.println("length = " + best_f);
	}
	
	public void setInput(double c[][]) {
		this.c = c;
		this.X = new int[c.length];
		X[0] = 0;
		this.marked = new boolean[c.length];
		for (int i = 1; i < c.length; i++) {
			marked[i] = true;
		}
	}
}
