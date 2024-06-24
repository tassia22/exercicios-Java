package ClassesEMetodoAbs;

public class Natal extends CartaoWeb {
	
	public Natal(String destinatario) {
		this.destinatario = destinatario;
		
	}

	public String showMessage() {
		return destinatario + ", " + "feliz natal!";
	}


}
