import javax.swing.JOptionPane;

public class Electricity implements DialogCreation {
	private String response;
	private static String[] options = new String[] {"Charge (q)",
			"Current (I)", "Force (F)", "Power (P)", "Radius (r)",
			"Resistance (R)", "Voltage (V)" };

	public static void main() {
		Electricity e = new Electricity();
		e.run();
	}

	public void run() {
		response = generateDialog(options);
		if(response!=null)
		{
		checkResponse(response);
		}
		else
		{
		PhysicsSolver p = new PhysicsSolver();	
		p.run();
		}
		System.exit(0);
	}

	public void checkResponse(String response) {
		if (response.equals("Charge (q)")) {
			Charge c = new Charge();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
		} else if (response.equals("Current (I)")) {
			Current c = new Current();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
		} else if (response.equals("Force (F)")) {
			EForce c = new EForce();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
                } else if (response.equals("Radius (r)")) {
			Radius c = new Radius();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
		} else if (response.equals("Power (P)")) {
			Power c = new Power();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
		} else if (response.equals("Resistance (R)")) {
			Resistance c = new Resistance();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
		} else if (response.equals("Voltage (V)")) {
			Voltage c = new Voltage();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Electricity.main();
			}
		}
	}

	public String generateDialog(String[] options) {
		String response = (String) JOptionPane.showInputDialog(null,
				"Solve for: \n", "Variables", JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
		return response;
	}
}
