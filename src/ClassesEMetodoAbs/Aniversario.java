package ClassesEMetodoAbs;

public class Aniversario extends CartaoWeb {
	
	public Aniversario(String destinatario) {
		this.destinatario = destinatario;
		
	}

	public String showMessage() {
		return destinatario + ", " + "feliz aniversario!";
	}

}
