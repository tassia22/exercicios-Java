package RelacionamentoDeObj;

public class Venda {
    private int num;
    private Cliente comprador;
    private Produto produto;
    int quantidade;

    public Venda(int num, Cliente comprador, Produto produto, int quantidade){
        this.num = num;
        this.comprador = comprador;
        this.produto = produto;

    }
    public String imprimir(){
        double valorTotal;
        valorTotal = getProduto().getPreco() * quantidade;
        String statusCompra;

        if(valorTotal <= comprador.getLimiteCredito()){
            statusCompra =  "dentro do limite";
        }else{
          statusCompra = "saldo insuficiente";
        }
        String imprimindo = "\nnome: "+"\ndescricao: "+ produto.getDescricao()+"\nquantidade: "+quantidade+"\nvalor total: "+valorTotal+"\nstatus da compra: "+statusCompra;

        return imprimindo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
