package Vetores;

public class Funcionario {
    private int matricula;
    private String nome;
    private int departamento;
    private Double salario;
    private String funcao;

    public Funcionario(int matricula, String nome, int departamento, Double salario, String funcao) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
