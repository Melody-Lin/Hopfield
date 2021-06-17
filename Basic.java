package nn.hw3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Basic {
	public Basic(int[][] r1, int[][] r2, int[][] r3, double[][] train_arr, double[][] test_arr, double p, double N) {
		JPanel mainPanel = new JPanel();
		JPanel totalPanel = new JPanel();

		JPanel p1_1 = new JPanel();
		JPanel p1_2 = new JPanel();
		JPanel p1_3 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p2_2 = new JPanel();
		JPanel p2_3 = new JPanel();
		JPanel p3_1 = new JPanel();
		JPanel p3_2 = new JPanel();
		JPanel p3_3 = new JPanel();

		GridLayout l1 = new GridLayout((int) p, (int) N);
		GridLayout l2 = new GridLayout(3, 6, 10, 10);

		Gui.jf.setSize(1200, 800);
		Gui.jf.setLocationRelativeTo(null);
		Gui.jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//
		p1_1.setSize(100, 80);
		p1_1.setLayout(l1);
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 20);
				} else {
					jp = createSquareJPanel(Color.white, 20);
				}
				p1_1.add(jp);
			}
		}
		//
		p1_2.setSize(100, 80);
		p1_2.setLayout(l1);
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 20);
				} else {
					jp = createSquareJPanel(Color.white, 20);
				}
				p1_2.add(jp);
			}
		}
		//
		p1_3.setSize(100, 80);
		p1_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r1[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 20);
			} else {
				jp = createSquareJPanel(Color.white, 20);
			}
			p1_3.add(jp);

		}
		//
		p2_1.setSize(100, 80);
		p2_1.setLayout(l1);
		for (int i = (int) p; i < 2 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 20);
				} else {
					jp = createSquareJPanel(Color.white, 20);
				}
				p2_1.add(jp);
			}
		}
		//
		p2_2.setSize(100, 80);
		p2_2.setLayout(l1);
		for (int i = (int) p; i < 2 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 20);
				} else {
					jp = createSquareJPanel(Color.white, 20);
				}
				p2_2.add(jp);
			}
		}
		//
		p2_3.setSize(100, 80);
		p2_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r2[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 20);
			} else {
				jp = createSquareJPanel(Color.white, 20);
			}
			p2_3.add(jp);
		}
		//
		p3_1.setSize(100, 80);
		p3_1.setLayout(l1);
		for (int i = 2 * (int) p; i < 3 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (train_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 20);
				} else {
					jp = createSquareJPanel(Color.white, 20);
				}
				p3_1.add(jp);
			}
		}
		//
		p3_2.setSize(100, 80);
		p3_2.setLayout(l1);
		for (int i = 2 * (int) p; i < 3 * (int) p; i++) {
			for (int j = 0; j < N; j++) {
				JPanel jp;
				if (test_arr[i][j] == 1) {
					jp = createSquareJPanel(Color.black, 20);
				} else {
					jp = createSquareJPanel(Color.white, 20);
				}
				p3_2.add(jp);
			}
		}
		//
		p3_3.setSize(100, 80);
		p3_3.setLayout(l1);
		for (int i = 0; i < p * N; i++) {
			JPanel jp;
			if (r3[i][0] == 1) {
				jp = createSquareJPanel(Color.black, 20);
			} else {
				jp = createSquareJPanel(Color.white, 20);
			}
			p3_3.add(jp);
		}
		//
		mainPanel.setLayout(l2);
		mainPanel.add(new JLabel("TRAIN 1: "));
		mainPanel.add(p1_1);
		mainPanel.add(new JLabel("TEST: "));
		mainPanel.add(p1_2);
		mainPanel.add(new JLabel("RECALL: "));
		mainPanel.add(p1_3);
		mainPanel.add(new JLabel("TRAIN 2: "));
		mainPanel.add(p2_1);
		mainPanel.add(new JLabel("TEST: "));
		mainPanel.add(p2_2);
		mainPanel.add(new JLabel("RECALL: "));
		mainPanel.add(p2_3);
		mainPanel.add(new JLabel("TRAIN 3: "));
		mainPanel.add(p3_1);
		mainPanel.add(new JLabel("TEST: "));
		mainPanel.add(p3_2);
		mainPanel.add(new JLabel("RECALL: "));
		mainPanel.add(p3_3);
		//
		totalPanel.add(mainPanel);
		totalPanel.setOpaque(true);
		Gui.jf.setContentPane(totalPanel);
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
