import javax.swing.JOptionPane;

public class Modern implements DialogCreation {
	private static String[] options = new String[] { "Area (A)", "Charge (q)",
			"Current (I)", "Force (F)", "Length (l)", "Power (P)",
			"Resistance (R)", "Resistivity(p)", "Separation (r)", "Time (t)",
			"Voltage (V)" };

	public static void main() {
		Modern g = new Modern();
		g.run();
	}

	public void run() {
		String response = generateDialog(options);
		checkResponse(response);
		System.exit(0);
	}

	public void checkResponse(String response) {
		if (response.equals("Area (A)")) {
			Electricity.main();
		} else if (response.equals("Charge (q)")) {
			Waves.main();
		} else if (response.equals("Current (I)")) {
			Modern.main();
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
