package ClassesEMetodoAbs;

public abstract class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String tel;
	
	public Pessoa(String nome, String endereco, String tel) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	

}
