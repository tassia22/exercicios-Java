package RelacionamentoDeObj;

public class Produto {
    private int codigo;
    private String descricao;
    private double custo;
    private  double preco;

    public Produto(int codigo, String descricao, double custo, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.custo = custo;
        this.preco = preco;
    }
    public void calculaPreco(){
        preco = custo + 0.25;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }

}
