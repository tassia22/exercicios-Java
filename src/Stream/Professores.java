package Stream;

public class Professores {
    String nome;
    String emailInstitucional;
    double salario;

    public Professores(String nome, String emailInstitucional, double salario) {
        this.nome = nome;
        this.emailInstitucional = emailInstitucional;
        this.salario = salario;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
