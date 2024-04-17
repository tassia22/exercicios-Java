package Stream;

public class Funcionarios {
    private String nome;
    private String email;
    private double salario;

    public Funcionarios(String nome, String email, double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
