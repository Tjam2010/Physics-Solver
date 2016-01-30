import javax.swing.JOptionPane;

public class Kinematics {
	private String response;
	private static String[] options = new String[] { "Acceleration (a)",
			"Coefficient of Friction (u)", "Density (D)",
			 "Force (F)","Force of Friction (Ff)", "Kinetic Energy (K)",
			 "Mass (m)", "Momentum (p)", 
			"Position (x)", "Potential Energy (U)", 
			 "Time (t)", "Velocity (v)", "Work (W)", 
                        //"Distance (d)","Spring Constant (k)","Energy (E)",
                        //"Power (P)","Period (T)","Volume (V)", "Height (y)","Length (l)",
                        };

	public static void main() {
		Kinematics k = new Kinematics();
		k.run();
	}

	public void run() {
		response = generateDialog(options);
		if (response != null) {
			checkResponse(response);
		} else {
			PhysicsSolver p = new PhysicsSolver();
			p.run();
		}
		System.exit(0);
	}

	public void checkResponse(String response) {
		if (response.equals("Acceleration (a)")) {
			Acceleration c = new Acceleration();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
		} else if (response.equals("Coefficient of Friction (u)")) {
			COF c = new COF();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
		} else if (response.equals("Density (p)")) {
			Density c = new Density();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Distance (d)")) {
//			
//		} else if (response.equals("Energy (E)")) {
//			Electricity.main();
		} else if (response.equals("Force (F)")) {
			KForce c = new KForce();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
		} else if (response.equals("Force of Friction (Ff)")) {
			FFriction c = new FFriction();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Height (y)")) {
//			Electricity.main();
		} else if (response.equals("Kinetic Energy (K)")) {
			KEnergy c = new KEnergy();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Length (l)")) {
//			Electricity.main();
		} else if (response.equals("Mass (m)")) {
			Mass c = new Mass();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
		} else if (response.equals("Momentum (p)")) {
			Momentum c = new Momentum();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Period (T)")) {
//			Electricity.main();
		} else if (response.equals("Position (x)")) {
			Distance c = new Distance();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
		} else if (response.equals("Potential Energy (U)")) {
			PotentialEnergy c = new PotentialEnergy();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Power (P)")) {
//			Electricity.main();
		} else if (response.equals("Velocity (v)")) {
			Velocity c = new Velocity();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Spring Constant (k)")) {
//			Electricity.main();
		} else if (response.equals("Time (t)")) {
                    Time c = new Time();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
			}
//		} else if (response.equals("Volume (V)")) {
//			Electricity.main();
		} else if (response.equals("Work (W)")) {
			Work c = new Work();
			Double ans = new Double(c.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Kinematics.main();
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
