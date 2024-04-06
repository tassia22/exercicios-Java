package AbstratosEInterface;

public class Livro extends Produto{
    private String autor;
    private String isbn;

    public Livro(int id, String nome, Double preco, String autor, String isbn) {
        super(id, nome, preco);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
