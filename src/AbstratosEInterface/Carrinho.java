package AbstratosEInterface;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Produto [] itens;
    private int qntd;
    private int tamanho;

    public Carrinho(int tamanho) {
        this.tamanho = tamanho;
        this.qntd = 0;
        this.itens = new Produto[tamanho];
    }

    public boolean incluir(Produto item){
        for (int i = 0; i < itens.length; i++){
            if (itens == null){
                itens[i] = item;
                return true;
            }
        }
        return false;

    }
    public boolean remover(Produto item){
        boolean excluir = false;
        for(int i = 0; i < itens.length; i++){
            if (itens[i] != null){
                if (itens[i].getNome().equals(item)) {
                    itens[i] = null;
                    excluir = true;
                }
            }
        }
        //reordenando o vetor
        for(int i = 0; i < itens.length; i++){
            if (itens[i] == null){
                for (int j = 0; j < itens.length; j++){
                    if (itens[i] != null){
                        itens[i] = itens[j];
                        itens[j] = null;
                        break;
                    }
                }
            }
        }
        return excluir;

    }
    public Produto[] listarItens(){
        for (int i = 0; i < itens.length; i++){
            System.out.println("id: "+itens[i].getId()+"nome: "+itens[i].getNome()+"preco: "+itens[i].getPreco());
        }

        return itens;
    }
    public double mostrarValor(){
        double valorTotal = 0.0;
        for (int i = 0; i < qntd; i++){
            valorTotal+=itens[i].getPreco();

        }
        return valorTotal;
    }
}
