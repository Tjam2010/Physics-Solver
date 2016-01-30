import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TitlePage {
	public static void main(String[] args) {
		TitlePage t = new TitlePage();
		t.run();
	}
	public void run() {
		JFrame window = new JFrame("Hello World App"); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		window.add(new JLabel("Hello World"), BorderLayout.CENTER);
		window.pack();
		window.setVisible(true);
		window.setLocationRelativeTo(null);
	}
}
