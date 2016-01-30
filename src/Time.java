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

public class Time {
    private double a,v,i,j,x,t;
    
    public double run(){
		JPanel myPanel = new JPanel();
		JPanel[][] panelHolder = new JPanel[1][6];
		myPanel.setLayout(new GridLayout(0,6));
                
                for (int row = 0; row<panelHolder.length; row++)
                {
                    for (int col = 0; col<panelHolder[0].length; col++)
                    {
                        panelHolder[row][col] = new JPanel();
                        myPanel.add(panelHolder[row][col]);
                    }
                }
                
		JTextField xField = new JTextField(5);
		JLabel x1 = new JLabel("Initial Veloctiy");
                JTextField xField2 = new JTextField(5);
		JLabel x2 = new JLabel("Velocity");
                JTextField xField3 = new JTextField(5);
		JLabel x3 = new JLabel("Acceleration");
//                JTextField xField4 = new JTextField(5);
//		JLabel x4 = new JLabel("Initial Position");
//                JTextField xField5 = new JTextField(5);
//		JLabel x5 = new JLabel("Initial P");
//                JTextField xField3 = new JTextField(5);
//		JLabel x3 = new JLabel("Radius");
		panelHolder[0][0].add(x1);
		panelHolder[0][1].add(xField);
                panelHolder[0][2].add(x2);
		panelHolder[0][3].add(xField2);
                panelHolder[0][4].add(x3);
		panelHolder[0][5].add(xField3);
//                panelHolder[0][6].add(x4);
//		panelHolder[0][7].add(xField4);
//                panelHolder[0][8].add(x5);
//		panelHolder[0][9].add(xField5);
		int result = JOptionPane.showConfirmDialog(null, myPanel,
				"Please Enter Variable(s)", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
		i = Double.parseDouble(xField.getText());
                v = Double.parseDouble(xField2.getText());
                a = Double.parseDouble(xField3.getText());
//                j = Double.parseDouble(xField4.getText());
//                j = Double.parseDouble(xField5.getText());
		}
//		System.exit(0);
		return (v-i)/a;
	}
}
