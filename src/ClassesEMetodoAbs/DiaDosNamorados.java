package ClassesEMetodoAbs;

public class DiaDosNamorados extends CartaoWeb {
	

	public DiaDosNamorados(String destinatario) {
		this.destinatario = destinatario;

	}

	public String showMessage() {
		return destinatario + ", " + "feliz dia dos namorados!";
	}

}
