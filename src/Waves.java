import javax.swing.JOptionPane;

public class Waves {
	private String response;
	private static String[] options = new String[] { "Frequency (f)",
			"Wavelength (w)" };

	public static void main() {
		Waves w = new Waves();
		w.run();
	}

	public void run() {
		response = generateDialog(options);
		if (response != null) {
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
		if (response.equals("Frequency (f)")) {
			Frequency f = new Frequency();
			Double ans = new Double(f.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Waves.main();
			}
		} else if (response.equals("Wavelength (w)")) {
			Wavelength w = new Wavelength();
			Double ans = new Double(w.run());
			if(ans!=null)
			{
			JOptionPane.showMessageDialog(null, "Answer: "+ans);
			}
			else
			{
				Waves.main();
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
