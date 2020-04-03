
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TSPSolver {
	
	private TSPModel model;
	
	public void solve() {
		model.tryValue(1);
		model.prinsolution();
		
	}
	
	public void readInput(String fileName) {

		try {
			Scanner scanner = new Scanner(Paths.get(fileName), "UTF-8");
			int n = scanner.nextInt();
			double c[][] = new double[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = scanner.nextDouble();
				}

			}
			model = new TSPModel();
			model.setInput(c);
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c[][] = { { 0, 50, 74, 0, 67, 21, 0, 0, 0, 0 }, { 50, 0, 55, 0, 0, 0, 0, 0, 25, 0 },
				{ 74, 55, 0, 66, 0, 0, 25, 0, 0, 0 }, { 0, 0, 66, 0, 45, 0, 0, 0, 0, 28 },
				{ 67, 0, 0, 45, 0, 0, 0, 24, 0, 0 }, { 21, 0, 0, 0, 0, 0, 33, 0, 0, 32 },
				{ 0, 0, 25, 0, 0, 33, 0, 46, 0, 0 }, { 0, 0, 0, 0, 24, 0, 46, 0, 60, 0 },
				{ 0, 25, 0, 0, 0, 0, 0, 60, 0, 50 }, { 0, 0, 0, 28, 0, 32, 0, 0, 50, 0 }, };
		/*
		 * double c[][] = { {0, 1, 0, 1, 0}, {1, 0, 1, 1, 1}, {0, 1, 0, 0, 1}, {1, 1, 0,
		 * 0, 1}, {0, 1, 1, 1, 0}, };
		 */
		TSPSolver tspSolver = new TSPSolver();
		tspSolver.readInput("D:\\data.txt");
		tspSolver.solve();

	}
}
