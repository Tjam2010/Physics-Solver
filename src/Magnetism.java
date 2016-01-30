import javax.swing.JOptionPane;

public class Magnetism {
	private static String[] options = new String[] { "Area (A)", "Charge (q)",
		"Current (I)", "Force (F)", "Length (l)", "Power (P)",
		"Resistance (R)", "Resistivity(p)", "Separation (r)", "Time (t)",
		"Voltage (V)" };
	public static void main() {
		Electricity e = new Electricity();
		e.run();
	}

	public void run() {
		String response = generateDialog(options);
		checkResponse(response);
		System.exit(0);
	}

	private void checkResponse(String response) {
		if (response.equals("Area (A)")) {
			Electricity.main();
		} else if (response.equals("Charge (q)")) {
			Waves.main();
		} else if (response.equals("Current (I)")) {
			Fluids.main();
		} else if (response.equals("Force (F)")) {
			Rotation.main();
		} else if (response.equals("Length (l)")) {
			Kinematics.main();
		} else if (response.equals("Power (P)")) {
			Kinematics.main();
		} else if (response.equals("Resistance (R)")) {
			Kinematics.main();
		} else if (response.equals("Resistivity(p)")) {
			Kinematics.main();
		} else if (response.equals("Separation (r)")) {
			Kinematics.main();
		} else if (response.equals("Time (t)")) {
			Kinematics.main();
		} else if (response.equals("Voltage (V)")) {
			Kinematics.main();
		}
	}

	public String generateDialog(String[] options) {
		String response = (String) JOptionPane.showInputDialog(null,
				"Solve for: \n", "Variables", JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
		return response;
	}
}
