import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhysicsSolver implements DialogCreation {
	private String response;
	private static String[] poptions = new String[] { "Basic Kinematics","Electricity", 
		"Waves + Optics"  };
	private static String[] p1options = new String[] { "Electricity", "Basic Kinematics","Geometry + Trig", "Rotational + Advanced",
		"Waves + Optics"  };
	private static String[] p2options = new String[] { "Electricity",
			"Fluid + Thermal", "Geometry + Trig", "Basic Kinematics",
			"Magnetism", "Modern Physics", "Rotational + Advanced",
			"Waves + Optics" };

	public static void main(String[] args) {
		//TitlePage t = new TitlePage();
		//t.run();
		PhysicsSolver p = new PhysicsSolver();
		p.run();
	}

	public void run() {
		response = generateDialog(poptions);
		if (response != null) {
			checkResponse(response);
		}
		System.exit(0);
	}

	public void checkResponse(String response) {
		if (response.equals("Electricity")) {
			Electricity.main();
		} else if (response.equals("Waves + Optics")) {
			Waves.main();
		}
		// else if (response.equals("Fluid + Thermal")) {
		// Fluids.main();
		// }
//		else if (response.equals("Geometry + Trig")) {
//			Geometry.main();
//		} 
//		else if (response.equals("Rotational + Advanced")) {
//			Rotation.main();
//		}
		// else if (response.equals("Modern Physics")) {
		// Modern.main();
		// } else if (response.equals("Magnetism")) {
		// Magnetism.main();
		// }
		else if (response.equals("Basic Kinematics")) {
			Kinematics.main();
		}
	}

	public String generateDialog(String[] options) {
		String response = (String) JOptionPane.showInputDialog(null,
				"Physics Equation Solver\n\nBy TJ Gascho and Griffin Danninger\n\nPhysics topic: \n", "Topics", JOptionPane.PLAIN_MESSAGE,
				null, options, options[0]);
		return response;
	}
}
