package Casting;

public class Agenda {
    private Pessoa contatos[];

    public Agenda(int qntdDeContatos){
        contatos = new Pessoa[qntdDeContatos];
    }
    Amigo amigo;
    Conhecido conhecido;

    public boolean adicionaContatos(Amigo amigo){
        for (int i = 0; i < this.contatos.length; i++){
            if(this.contatos[i] == null){
                contatos[i] = amigo;
                return true;
            }
        }
        return  false;
    }

    public boolean adicionaContatos(Conhecido conhecido){
        for (int i = 0; i < this.contatos.length; i++){
            if (this.contatos[i] == null){
                contatos[i] = conhecido;
                return true;
            }

        }
        return false;
    }

    public Amigo[] listaAmigos(){
    Amigo amigos[] = new Amigo[contatos.length];
    int j = 0;
    for (int i = 0; i < this.contatos.length; i++){
        if (contatos[i] == null) continue;
        if (contatos[i].getTipo() == 'A'){
            amigos[j] = (Amigo) contatos[i];
        }
     }
        return amigos;
    }
    public Pessoa[] listaConhecidos(){
        Conhecido conhecidos [] = new Conhecido[contatos.length];
        int j = 0;
        for (int i = 0; i < this.contatos.length; i++){
            if (contatos[i] == null) continue;
            if (contatos[i].getTipo() == 'C'){
                conhecidos[j] = (Conhecido) contatos[i];
            }
        }
        return conhecidos;

       // public Pessoa[] listaContatos(){
         //   return contatos;
        //}

    }
    public Pessoa buscaContato(String nome){
        for(int i=0; i<this.contatos.length; i++){
            if (contatos[i] == null) continue;
            if (contatos[i].getNome().equals(nome)){
                return contatos[i];
            }
        }
        return null;
    }
    public  boolean alteraContato(Pessoa contato){
        for(int i=0; i<this.contatos.length; i++){
            if (contatos[i] == null) continue;
            if (contatos[i].getNome().equals(contato.getNome())){
                contatos[i] = contato;
                return true;
            }
        }
        return false;
    }

}
