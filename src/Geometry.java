import javax.swing.JOptionPane;

public class Geometry implements DialogCreation {
	private String response;
	private static String[] options = new String[] { "Area (A)", "Base (b)",
			"Circumference (C)", "Height (h)", "Length (l)", "Radius (r)",
			"Surface Area (S)", "Volume (V)", "Width (w)" };

	public static void main() {
		Geometry g = new Geometry();
		g.run();
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
		if (response.equals("Area (A)")) {
			Electricity.main();
		} else if (response.equals("Base (b)")) {
			Waves.main();
		} else if (response.equals("Circumference (C)")) {
			Geometry.main();
		} else if (response.equals("Height (h)")) {
			Rotation.main();
		} else if (response.equals("Length (l)")) {
			Kinematics.main();
		} else if (response.equals("Radius (r)")) {
			Kinematics.main();
		} else if (response.equals("Surface Area (S)")) {
			Kinematics.main();
		} else if (response.equals("Volume (V)")) {
			Kinematics.main();
		} else if (response.equals("Width (w)")) {
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
