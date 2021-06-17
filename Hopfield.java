package nn.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hopfield {
	static double p = 0;
	static double N = 0;
	static int fileIndex = -1;
	static String fileName = "";
	String[] fileList = { "Basic_Training", "Bonus_Training" };
	static int size = 0;
	static int[][] r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15; // result
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static double[][] train_arr;
	static double[][] test_arr;
	static double[][] w;
	static double[][] theta;
	static int[][] result;
	static int t = 0;

	public Hopfield(int index) throws FileNotFoundException {
		fileIndex = index;
		fileName = fileList[index];
		if (index == 0) {
			p = 12;
			N = 9;
			r1 = new int[(int) (p * N)][1];
			r2 = new int[(int) (p * N)][1];
			r3 = new int[(int) (p * N)][1];
		} else if (index == 1) {
			p = 10;
			N = 10;
			r1 = new int[(int) (p * N)][1];
			r2 = new int[(int) (p * N)][1];
			r3 = new int[(int) (p * N)][1];
			r4 = new int[(int) (p * N)][1];
			r5 = new int[(int) (p * N)][1];
			r6 = new int[(int) (p * N)][1];
			r7 = new int[(int) (p * N)][1];
			r8 = new int[(int) (p * N)][1];
			r9 = new int[(int) (p * N)][1];
			r10 = new int[(int) (p * N)][1];
			r11 = new int[(int) (p * N)][1];
			r12 = new int[(int) (p * N)][1];
			r13 = new int[(int) (p * N)][1];
			r14 = new int[(int) (p * N)][1];
			r15 = new int[(int) (p * N)][1];
		} else {
		}
		dataSize();
		train_arr = new double[size][(int) N];
		test_arr = new double[size][(int) N];
		result = new int[size][(int) N];
		w = new double[(int) (p * N)][(int) ((int) p * N)];
		theta = new double[(int) (p * N)][1];
		readFile();
		if (index == 0) {
			while (t < size / p) {
				learning();
				recall();
				t++;
			}
			Basic basic = new Basic(r1, r2, r3, train_arr, test_arr, p, N);

		} else if (index == 1) {
			while (t < size / p) {
				learning();
				recall();
				t++;
			}
			Bonus bonus = new Bonus(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, train_arr,
					test_arr, p, N);
		}

	}

	public static void dataSize() throws FileNotFoundException {
		File file = new File("Hopfield_dataset/" + fileName + ".txt");
		Scanner scanner = new Scanner(file);
		String tmp = "";
		while (scanner.hasNextLine()) {
			tmp = scanner.nextLine();
			if (tmp.isEmpty() == false) {
				size++;
			}
		}
		// System.out.println(size);
	}

	public static void readFile() throws FileNotFoundException {
		File file = new File("Hopfield_dataset/" + fileName + ".txt");
		Scanner scanner = new Scanner(file);
		String tmp = "";

		int k = 0;
		while (scanner.hasNextLine()) {
			int j = 0;
			tmp = scanner.nextLine();
			if (tmp.isEmpty() == false) {
				for (; j < tmp.length(); j++) {
					if (tmp.charAt(j) == '1') {
						train_arr[k][j] = 1;
					} else {
						train_arr[k][j] = -1;
					}
				}
				k++;
			}
		}

		if (fileIndex == 0) {
			file = new File("Hopfield_dataset/" + "Basic_Testing" + ".txt");
			scanner = new Scanner(file);

		} else if (fileIndex == 1) {
			file = new File("Hopfield_dataset/" + "Bonus_Testing" + ".txt");
			scanner = new Scanner(file);
		} else {
		}

		tmp = "";
		k = 0;
		while (scanner.hasNextLine()) {
			int j = 0;
			tmp = scanner.nextLine();
			if (tmp.isEmpty() == false) {
				for (; j < tmp.length(); j++) {
					if (tmp.charAt(j) == '1') {
						test_arr[k][j] = 1;
					} else {
						test_arr[k][j] = -1;
					}
				}
				k++;
			}
		}

	}

	public static void learning() {
		double[][] x = new double[(int) p * (int) N][(int) 1];
		double[][] x_t = new double[1][(int) p * (int) N];
		double[][] xx_t = new double[(int) p * (int) N][(int) p * (int) N];

		for (int i = 0; i < p * N; i++) {
			for (int j = 0; j < p * N; j++) {
				w[i][j] = 0;
			}
		}
		int k = 0;
		for (int i = (int) (p * t); i < p * (t + 1); i++) {
			for (int j = 0; j < N; j++) {
				x[k][0] = train_arr[i][j];
				x_t[0][k] = train_arr[i][j];
				k++;
			}

		}

		for (int i = 0; i < p * N; i++) {
			for (int j = 0; j < p * N; j++) {
				xx_t[i][j] += x[i][0] * x_t[0][j];
			}
		}

		for (int i = 0; i < p * N; i++) {
			for (int j = 0; j < p * N; j++) {
				w[i][j] += (xx_t[i][j] / p);
				if (i == j) {
					w[i][j] -= N / p;
				}
			}
		}
		double num = 0;
		for (int i = 0; i < p * N; i++) {
			for (int j = 0; j < p * N; j++) {
				num += w[i][j];
			}
			theta[i][0] = num;
			num = 0;
		}

	}

	public static void recall() {
		double[][] input = new double[(int) (p * N)][1];
		double[][] u = new double[(int) (p * N)][1];
		double[][] output = new double[(int) (p * N)][1];
		double[][] output_sgn = new double[(int) (p * N)][1];
		int k = 0, n = 0, v = 0;
		int count = 0, limit = 100;

		for (int i = (int) (p * t); i < p * (t + 1); i++) {
			for (int j = 0; j < N; j++) {
				input[v][0] = test_arr[i][j];
				v++;
			}
		}

		while (true) {
			if (n == p * N) {
				n -= p * N;
			}
			for (int i = 0; i < p * N; i++) {
				for (int j = 0; j < p * N; j++) {
					u[i][0] += w[i][j] * input[j][0];
				}
			}
			for (int i = 0; i < p * N; i++) {
				output[i][0] = u[i][0] - theta[i][0];
				output_sgn[i][0] = sgn(output[i][0], input[i][0]);
			}

			// update
			boolean cvg = true;
			for (int i = 0; i < p * N; i++) {
				if (input[i][0] != output_sgn[i][0]) {
					cvg = false;
					break;
				}
			}
			if (cvg == false) {
				if (input[n][0] != output_sgn[n][0]) {
					input[n][0] = output_sgn[n][0];
				}
			} else { // convergence
				count++;
				if (count == limit) {
					break;
				}
			}
			n++;
		}

		if (fileIndex == 0) {
			if (t == 0) {
				for (int i = 0; i < p * N; i++) {
					r1[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 1) {
				for (int i = 0; i < p * N; i++) {
					r2[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 2) {
				for (int i = 0; i < p * N; i++) {
					r3[i][0] = (int) output_sgn[i][0];
				}
			}
		} else {
			if (t == 0) {
				for (int i = 0; i < p * N; i++) {
					r1[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 1) {
				for (int i = 0; i < p * N; i++) {
					r2[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 2) {
				for (int i = 0; i < p * N; i++) {
					r3[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 3) {
				for (int i = 0; i < p * N; i++) {
					r4[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 4) {
				for (int i = 0; i < p * N; i++) {
					r5[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 5) {
				for (int i = 0; i < p * N; i++) {
					r6[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 6) {
				for (int i = 0; i < p * N; i++) {
					r7[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 7) {
				for (int i = 0; i < p * N; i++) {
					r8[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 8) {
				for (int i = 0; i < p * N; i++) {
					r9[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 9) {
				for (int i = 0; i < p * N; i++) {
					r10[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 10) {
				for (int i = 0; i < p * N; i++) {
					r11[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 11) {
				for (int i = 0; i < p * N; i++) {
					r12[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 12) {
				for (int i = 0; i < p * N; i++) {
					r13[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 13) {
				for (int i = 0; i < p * N; i++) {
					r14[i][0] = (int) output_sgn[i][0];
				}
			} else if (t == 14) {
				for (int i = 0; i < p * N; i++) {
					r15[i][0] = (int) output_sgn[i][0];
				}
			}
		}
	}

	public static int sgn(double d, double x) {
		int phi = 0;
		if (d > 0) {
			phi = 1;
		} else if (d == 0) {
			phi = (int) x;
		} else {
			phi = -1;
		}
		return phi;
	}

}
