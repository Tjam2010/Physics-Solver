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

public class VarInput {
	String[][] v;
	private int rows;
	private int cols;
	private ArrayList<String> input;

	public VarInput(String[][] variables) {
		v = variables;
		rows = v.length;
		int max = v[0].length;
		for(int z = 0; z<rows;z++)
		{
			if (v[z].length >max) max = v[z].length;
		}
		cols = max;
	}

	public void run() {
//		JTextField xField = new JTextField(5);
//		JLabel x1 = new JLabel("x:");
//		JTextField yField = new JTextField(5);
//		JLabel y1 = new JLabel("y:");
//		JTextField xField2 = new JTextField(5);
//		JLabel x2 = new JLabel("x2:");
//		JTextField yField2 = new JTextField(5);
//		JLabel y2 = new JLabel("y2:");
//		JLabel or = new JLabel("or");

		JPanel myPanel = new JPanel();
		int i = 2*rows-1;
		int j = 2*cols;
		JPanel[][] panelHolder = new JPanel[i][j];
		myPanel.setLayout(new GridLayout(i, j));
		for (int m = 0; m < i; m++) {
			for (int n = 0; n < j; n++) {
				panelHolder[m][n] = new JPanel();
				myPanel.add(panelHolder[m][n]);
			}
		}
		int vrow = 0;
		int vcol = 0;
		for (int k =0; k<rows; k++)
		{
			for (int l = 0; l<cols; l++)
			{
				if (l%2==0){
					panelHolder[k][l].add(new JLabel(v[vrow][vcol]));
					vrow++;
				}
				else {
					panelHolder[k][l].add(new JTextField(5));
				}
			}
		}
		
//		panelHolder[0][0].add(x1);
//		panelHolder[0][0].add(xField);
//		panelHolder[0][2].add(Box.createHorizontalStrut(15));
//		panelHolder[0][2].add(y1);
//		panelHolder[0][2].add(yField);
//		panelHolder[1][1].add(or);
//		panelHolder[2][0].add(x2);
//		panelHolder[2][0].add(xField2);
//		panelHolder[2][8].add(Box.createHorizontalStrut(15));
//		panelHolder[2][2].add(y2);
//		panelHolder[2][2].add(yField2);
		
		int result = JOptionPane.showConfirmDialog(null, myPanel,
				"Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
//			System.out.println("x value: " + xField.getText());
//			System.out.println("y value: " + yField.getText());
		}
	}
}


//import java.awt.FlowLayout;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;
//import java.util.ArrayList;
//
//import javax.swing.Box;
//import javax.swing.BoxLayout;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class Frequency {
//	private double f;
//	private double hl;
//	private final double v = 299792458;
//
//	public Double run() {
//		JPanel myPanel = new JPanel();
//		JPanel[][] panelHolder = new JPanel[1][2];
//		myPanel.setLayout(new GridLayout(0, 1));
//		panelHolder[0][0] = new JPanel();
//		myPanel.add(panelHolder[0][0]);
//
//		panelHolder[0][1] = new JPanel();
//		myPanel.add(panelHolder[0][1]);
//
//		JTextField xField = new JTextField(5);
//		JLabel x1 = new JLabel("Wavelength");
//		panelHolder[0][0].add(x1);
//		panelHolder[0][1].add(xField);
//		Double out;
//		int result = JOptionPane.showConfirmDialog(null, myPanel,
//				"Please Enter Variable(s)", JOptionPane.OK_CANCEL_OPTION);
//		if (result == JOptionPane.OK_OPTION) {
//			hl = Double.parseDouble(xField.getText());
//		}
//		out = hl;
//		// System.exit(0);
//		if (out == null)
//			return null;
//		else
//			return v / hl;
//	}
//}