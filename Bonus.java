package nn.hw3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class Bonus {
	JPanel mainPanel = new JPanel();
	JPanel totalPanel = new JPanel();

	public Bonus(int[][] r1, int[][] r2, int[][] r3, int[][] r4, int[][] r5, int[][] r6, int[][] r7, int[][] r8,
			int[][] r9, int[][] r10, int[][] r11, int[][] r12, int[][] r13, int[][] r14, int[][] r15,
			double[][] train_arr, double[][] test_arr, double p, double N) {
		JPanel p1_1 = new JPanel();
		JPanel p1_2 = new JPanel();
		JPanel p1_3 = new JPanel();

		JPanel p2_1 = new JPanel();
		JPanel p2_2 = new JPanel();
		JPanel p2_3 = new JPanel();

		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();
		JPanel p3_3 = new JPanel();

		JPanel p4_1 = new JPanel();
		JPanel p4_2 = new JPanel();
		JPanel p4_3 = new JPanel();

		JPanel p5_1 = new JPanel();
		JPanel p5_2 = new JPanel();
		JPanel p5_3 = new JPanel();

		JPanel p6_1 = new JPanel();
		JPanel p6_2 = new JPanel();
		JPanel p6_3 = new JPanel();

		JPanel p7_1 = new JPanel();
		JPanel p7_2 = new JPanel();
		JPanel p7_3 = new JPanel();

		JPanel p8_1 = new JPanel();
		JPanel p8_2 = new JPanel();
		JPanel p8_3 = new JPanel();

		JPanel p9_1 = new JPanel();
		JPanel p9_2 = new JPanel();
		JPanel p9_3 = new JPanel();

		JPanel p10_1 = new JPanel();
		JPanel p10_2 = new JPanel();
		JPanel p10_3 = new JPanel();

		JPanel p11_1 = new JPanel();
		JPanel p11_2 = new JPanel();
		JPanel p11_3 = new JPanel();

		JPanel p12_1 = new JPanel();
		JPanel p12_2 = new JPanel();
		JPanel p12_3 = new JPanel();

		JPanel p13_1 = new JPanel();
		JPanel p13_2 = new JPanel();
		JPanel p13_3 = new JPanel();

		JPanel p14_1 = new JPanel();
		JPanel p14_2 = new JPanel();
		JPanel p14_3 = new JPanel();

		JPanel p15_1 = new JPanel();
		JPanel p15_2 = new JPanel();
		JPanel p15_3 = new JPanel();
		GridLayout l1 = new GridLayout((int) p, (int) N);
		GridLayout l2 = new GridLayout(15, 6, 5, 5);

		//
		p1_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p1_1.setLayout(l1);
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p1_1.add(jp);
			}
		}
		//
		p1_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p1_2.setLayout(l1);
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p1_2.add(jp);
			}
		}
		//
		p1_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p1_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r1[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p1_3.add(jp);

		}
		//
		p2_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p2_1.setLayout(l1);
		for (int i = (int) p; i < 2 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p2_1.add(jp);
			}
		}
		//
		p2_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p2_2.setLayout(l1);
		for (int i = (int) p; i < 2 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p2_2.add(jp);
			}
		}
		//
		p2_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p2_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r2[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p2_3.add(jp);
		}
		//
		p3_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p3_1.setLayout(l1);
		for (int i = 2 * (int) p; i < 3 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p3_1.add(jp);
			}
		}
		//
		p3_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p3_2.setLayout(l1);
		for (int i = 2 * (int) p; i < 3 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p3_2.add(jp);
			}
		}
		//
		p3_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p3_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r3[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p3_3.add(jp);
		}
		//
		p4_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p4_1.setLayout(l1);
		for (int i = 3 * (int) p; i < 4 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p4_1.add(jp);
			}
		}
		//
		p4_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p4_2.setLayout(l1);
		for (int i = 3 * (int) p; i < 4 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p4_2.add(jp);
			}
		}
		//
		p4_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p4_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r4[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p4_3.add(jp);
		}
		//
		p5_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p5_1.setLayout(l1);
		for (int i = 4 * (int) p; i < 5 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p5_1.add(jp);
			}
		}
		//
		p5_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p5_2.setLayout(l1);
		for (int i = 4 * (int) p; i < 5 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p5_2.add(jp);
			}
		}
		//
		p5_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p5_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r5[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p5_3.add(jp);
		}
		//
		p6_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p6_1.setLayout(l1);
		for (int i = 5 * (int) p; i < 6 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p6_1.add(jp);
			}
		}
		//
		p6_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p6_2.setLayout(l1);
		for (int i = 5 * (int) p; i < 6 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p6_2.add(jp);
			}
		}
		//
		p6_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p6_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r6[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p6_3.add(jp);
		}
		//
		p7_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p7_1.setLayout(l1);
		for (int i = 6 * (int) p; i < 7 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p7_1.add(jp);
			}
		}
		//
		p7_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p7_2.setLayout(l1);
		for (int i = 6 * (int) p; i < 7 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p7_2.add(jp);
			}
		}
		//
		p7_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p7_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r7[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p7_3.add(jp);
		}
		//
		p8_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p8_1.setLayout(l1);
		for (int i = 7 * (int) p; i < 8 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p8_1.add(jp);
			}
		}
		//
		p8_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p8_2.setLayout(l1);
		for (int i = 7 * (int) p; i < 8 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p8_2.add(jp);
			}
		}
		//
		p8_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p8_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r8[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p8_3.add(jp);
		}
		//
		p9_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p9_1.setLayout(l1);
		for (int i = 8 * (int) p; i < 9 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p9_1.add(jp);
			}
		}
		//
		p9_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p9_2.setLayout(l1);
		for (int i = 8 * (int) p; i < 9 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p9_2.add(jp);
			}
		}
		//
		p9_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p9_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r9[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p9_3.add(jp);
		}
		//
		p10_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p10_1.setLayout(l1);
		for (int i = 9 * (int) p; i < 10 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p10_1.add(jp);
			}
		}
		//
		p10_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p10_2.setLayout(l1);
		for (int i = 9 * (int) p; i < 10 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p10_2.add(jp);
			}
		}
		//
		p10_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p10_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r10[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p10_3.add(jp);
		}
		//
		p11_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p11_1.setLayout(l1);
		for (int i = 10 * (int) p; i < 11 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p11_1.add(jp);
			}
		}
		//
		p11_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p11_2.setLayout(l1);
		for (int i = 10 * (int) p; i < 11 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p11_2.add(jp);
			}
		}
		//
		p11_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p11_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r11[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p11_3.add(jp);
		}
		//
		p12_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p12_1.setLayout(l1);
		for (int i = 11 * (int) p; i < 12 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p12_1.add(jp);
			}
		}
		//
		p12_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p12_2.setLayout(l1);
		for (int i = 11 * (int) p; i < 12 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p12_2.add(jp);
			}
		}
		//
		p12_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p12_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r12[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p12_3.add(jp);
		}
		//
		p13_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p13_1.setLayout(l1);
		for (int i = 12 * (int) p; i < 13 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p13_1.add(jp);
			}
		}
		//
		p13_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p13_2.setLayout(l1);
		for (int i = 12 * (int) p; i < 13 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p13_2.add(jp);
			}
		}
		//
		p13_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p13_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r13[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p13_3.add(jp);
		}
		//
		p14_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p14_1.setLayout(l1);
		for (int i = 13 * (int) p; i < 14 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p14_1.add(jp);
			}
		}
		//
		p14_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p14_2.setLayout(l1);
		for (int i = 13 * (int) p; i < 14 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p14_2.add(jp);
			}
		}
		//
		p14_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p14_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r14[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p14_3.add(jp);
		}
		//
		p15_1.setSize((int) (p * N * 15), (int) (p * N * 15));
		p15_1.setLayout(l1);
		for (int i = 14 * (int) p; i < 15 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p15_1.add(jp);
			}
		}
		//
		p15_2.setSize((int) (p * N * 15), (int) (p * N * 15));
		p15_2.setLayout(l1);
		for (int i = 14 * (int) p; i < 15 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 15);
				} else {
					jp = createSquareJPanel(Color.white, 15);
				}
				p15_2.add(jp);
			}
		}
		//
		p15_3.setSize((int) (p * N * 15), (int) (p * N * 15));
		p15_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r15[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 15);
			} else {
				jp = createSquareJPanel(Color.white, 15);
			}
			p15_3.add(jp);
		}
		//
		mainPanel.setLayout(l2);
		mainPanel.add(new JLabel("   TRAIN 1: "));
		mainPanel.add(p1_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p1_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p1_3);

		mainPanel.add(new JLabel("   TRAIN 2: "));
		mainPanel.add(p2_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p2_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p2_3);

		mainPanel.add(new JLabel("   TRAIN 3: "));
		mainPanel.add(p3_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p3_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p3_3);

		mainPanel.add(new JLabel("   TRAIN 4: "));
		mainPanel.add(p4_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p4_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p4_3);

		mainPanel.add(new JLabel("   TRAIN 5: "));
		mainPanel.add(p5_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p5_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p5_3);

		mainPanel.add(new JLabel("   TRAIN 6: "));
		mainPanel.add(p6_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p6_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p6_3);

		mainPanel.add(new JLabel("   TRAIN 7: "));
		mainPanel.add(p7_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p7_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p7_3);

		mainPanel.add(new JLabel("   TRAIN 8: "));
		mainPanel.add(p8_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p8_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p8_3);

		mainPanel.add(new JLabel("   TRAIN 9: "));
		mainPanel.add(p9_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p9_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p9_3);

		mainPanel.add(new JLabel("   TRAIN 10: "));
		mainPanel.add(p10_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p10_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p10_3);

		mainPanel.add(new JLabel("   TRAIN 11: "));
		mainPanel.add(p11_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p11_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p11_3);

		mainPanel.add(new JLabel("   TRAIN 12: "));
		mainPanel.add(p12_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p12_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p12_3);

		mainPanel.add(new JLabel("   TRAIN 13: "));
		mainPanel.add(p13_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p13_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p13_3);

		mainPanel.add(new JLabel("   TRAIN 14: "));
		mainPanel.add(p14_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p14_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p14_3);

		mainPanel.add(new JLabel("   TRAIN 15: "));
		mainPanel.add(p15_1);
		mainPanel.add(new JLabel("        TEST: "));
		mainPanel.add(p15_2);
		mainPanel.add(new JLabel("        RECALL: "));
		mainPanel.add(p15_3);
		//
		JScrollPane sp = new JScrollPane(mainPanel);
		sp.getVerticalScrollBar().setUnitIncrement(50);
		Gui.jf.setSize(1200, 1000);
		Gui.jf.setLocationRelativeTo(null);
		Gui.jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Gui.jf.setContentPane(sp);
		Gui.jf.setVisible(true);

	}

	private static JPanel createSquareJPanel(Color color, int size) {
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(color);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size, size));
		tempPanel.setPreferredSize(new Dimension(size, size));
		return tempPanel;
	}

}
