import javax.swing.JOptionPane;

public class Rotation {
	private String response;
	private static String[] options = new String[] { "Amplitude (A)",
			"Angle (0)", "Angular Acceleration (a)", "Angular Momentum (L)",
			"Angular Speed (w)", "Coefficient of Friction (u)", "Distance (d)",
			"Energy (E)", "Frequency (f)", "Force (F)", "Kinetic Energy (K)",
			"Length (l)", "Mass (m)", "Momentum (p)", "Period (T)",
			"Potential Energy (U)", "Power (P)", "Radius or Separation (r)",
			"Rotational Inertia (I)", "Speed (v)", "Spring Constant (k)",
			"Time (t)", "Torque (t)", "Work (W)" };

	public static void main() {
		Rotation r = new Rotation();
		r.run();
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
		if (response.equals("Amplitude (A)")) {
			Electricity.main();
		} else if (response.equals("Angle (0)")) {
			Electricity.main();
		} else if (response.equals("Angular Acceleration (a)")) {
			Electricity.main();
		} else if (response.equals("Angular Momentum (L)")) {
			Electricity.main();
		} else if (response.equals("Angular Speed (w)")) {
			Electricity.main();
		} else if (response.equals("Coefficient of Friction (u)")) {
			Electricity.main();
		} else if (response.equals("Distance (d)")) {
			Electricity.main();
		} else if (response.equals("Energy (E)")) {
			Electricity.main();
		} else if (response.equals("Frequency (f)")) {
			Electricity.main();
		} else if (response.equals("Force (F)")) {
			Electricity.main();
		} else if (response.equals("Kinetic Energy (K)")) {
			Electricity.main();
		} else if (response.equals("Length (l)")) {
			Electricity.main();
		} else if (response.equals("Mass (m)")) {
			Electricity.main();
		} else if (response.equals("Momentum (p)")) {
			Electricity.main();
		} else if (response.equals("Period (T)")) {
			Electricity.main();
		} else if (response.equals("Position (x)")) {
			Electricity.main();
		} else if (response.equals("Potential Energy (U)")) {
			Electricity.main();
		} else if (response.equals("Power (P)")) {
			Electricity.main();
		} else if (response.equals("Radius or Separation (r)")) {
			Electricity.main();
		} else if (response.equals("Rotational Inertia (I)")) {
			Electricity.main();
		} else if (response.equals("Speed (v)")) {
			Electricity.main();
		} else if (response.equals("Spring Constant (k)")) {
			Electricity.main();
		} else if (response.equals("Time (t)")) {
			Electricity.main();
		} else if (response.equals("Torque (t)")) {
			Electricity.main();
		} else if (response.equals("Work (W)")) {
			Electricity.main();
		}
	}

	public String generateDialog(String[] options) {
		String response = (String) JOptionPane.showInputDialog(null,
				"Solve for: \n", "Variables", JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
		return response;
	}

}
