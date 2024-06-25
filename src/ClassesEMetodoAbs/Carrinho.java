package ClassesEMetodoAbs;

public class Carrinho {
	
	private Produto [] itens;
	
	public boolean incluir(Produto item) {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}
	
	public boolean remover(Produto item) {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] != null){
				itens[i] = item;
				return true;
			}
		}
		
		return false;
		
	}
	
	public Produto[] listarItens() {
		int cont = 0;
	
		Produto [] listar = new Produto[itens.length];
		
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] != null) {
				if(!itens[i].getNome().equals("0"));
				listar[cont++] = itens[i];
			}
		}
		
		return listar;
	
	}
	
}
