package AbstratosEInterface;

public class Revista extends Produto{
    private String data;
    private int numero;

    public Revista(int id, String nome, Double preco, String data, int numero) {
        super(id, nome, preco);
        this.data = data;
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
