package Vetores;

public class Estoque {
    private Produto [] produtos;
	
	public Estoque(int qntd) {
		produtos = new Produto[qntd];
	}
	
	public void adicionaProduto(Produto produto){
		
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = produto;
			}
		}
		
	}
	
	public void excluiProduto(Produto produto) {
		
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null ){
				if(produtos[i].getDescricao() == produto.getDescricao()) {
					produtos[i] = null;
				}
			}
		}
		
		
	}
	
	public Produto buscaProduto(int codigo) {
		
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null)
				if(produtos[i].getCodigo() == codigo) {
					return produtos[i];
			}

		}
		return null;
		
	}
	
	public Produto buscaProduto(String descricao) {
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null) {
				if(produtos[i].getDescricao().equals(descricao)) {
					return produtos[i];
				}
			}
		}
		
		return null;

	}

    
}
