import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Power {
    private double P, I, V, R;
    
    public double run(){
		JPanel myPanel = new JPanel();
		JPanel[][] panelHolder = new JPanel[1][4];
		myPanel.setLayout(new GridLayout(0,6));
                
                for (int row = 0; row<panelHolder.length; row= row+2)
                {
                    for (int col = 0; col<panelHolder[0].length; col++)
                    {
                        panelHolder[row][col] = new JPanel();
                        myPanel.add(panelHolder[row][col]);
                    }
                }
                
		JTextField xField = new JTextField(5);
		JLabel x1 = new JLabel("Voltage");
                JTextField xField2 = new JTextField(5);
		JLabel x2 = new JLabel("Current");
                
		panelHolder[0][0].add(x1);
		panelHolder[0][1].add(xField);
                panelHolder[0][2].add(x2);
		panelHolder[0][3].add(xField2);
		int result = JOptionPane.showConfirmDialog(null, myPanel,
				"Please Enter Variable(s)", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		V = Double.parseDouble(xField.getText());
                I = Double.parseDouble(xField2.getText());
		}
//		System.exit(0);
		return V*I;
	}
}
