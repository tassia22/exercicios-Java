package Casting;

public class Passaro extends Animal{
    private boolean voa;
    private  int envergadura;

    public Passaro(String nome, float peso, int tipo, boolean voa, int envergadura){
        super(nome, peso, tipo);
        this.voa = voa;
        this.envergadura = envergadura;
    }
    public float alturaDoVoo(){
        float altura;

        if (voa){
          altura = envergadura * 100 / peso;
        }else{
            altura = 0.0F;
        }
        return altura;
    }

    public boolean getVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

}
