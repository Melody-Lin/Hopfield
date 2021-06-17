package nn.hw3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Gui extends JFrame implements ActionListener {
	static JFrame jf = new JFrame("Hopfield");
	static JPanel panel = new JPanel();
	static JLabel lb = new JLabel("File: ");
	static JButton btn = new JButton("OK");
	static JComboBox jc = new JComboBox();

	public Gui() {
		jf.setSize(300, 280);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		panel.setBounds(0, 0, 100, 150);
		panel.setLayout(null);

		lb.setBounds(50, 70, 100, 50);
		lb.setFont(new Font("Courier", Font.PLAIN, 16));
		panel.add(lb);

		jc.setBounds(100, 80, 150, 30);
		jc.addItem("Basic_Training");
		jc.addItem("Bonus_Training");
		jc.addActionListener(this);
		panel.add(jc);

		btn.setBounds(115, 150, 55, 30);
		btn.addActionListener(this);
		panel.add(btn);

		jf.setContentPane(panel);
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn) {
			setVisible(false);
			try {
				Hopfield hopfield = new Hopfield(jc.getSelectedIndex());
			} catch (NumberFormatException | FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
