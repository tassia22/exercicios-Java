package Casting;

public class Conhecido extends Pessoa{
    private String email;

    public Conhecido(String nome, int idade, String email){
        super(nome,idade);
        this.email = email;
    }
    public void Conhecido(){
        this.email = "indefinido";


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
