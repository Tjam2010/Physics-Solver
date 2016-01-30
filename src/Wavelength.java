import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Wavelength {
        private double f;
	private double hl;
	private final double v = 299792458;
	
	public double run(){
		JPanel myPanel = new JPanel();
		JPanel[][] panelHolder = new JPanel[1][2];
		myPanel.setLayout(new GridLayout(0,1));
		panelHolder[0][0] = new JPanel();
		myPanel.add(panelHolder[0][0]);
		
		panelHolder[0][1] = new JPanel();
		myPanel.add(panelHolder[0][1]);
		
		JTextField xField = new JTextField(5);
		JLabel x1 = new JLabel("Frequency");
		panelHolder[0][0].add(x1);
		panelHolder[0][1].add(xField);
		int result = JOptionPane.showConfirmDialog(null, myPanel,
				"Please Enter Variable(s)", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		f = Double.parseDouble(xField.getText());
		}
//		System.exit(0);
		return v/f;
	}
}

