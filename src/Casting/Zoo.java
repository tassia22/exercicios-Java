package Casting;

public class Zoo {
    private Animal animais[];

    public void Animal(int qntd){
        animais = new Animal[qntd];
    }

    public boolean adicionarAnimal(Passaro passaro){
        for (int i = 0; i < animais.length; i++){
            if (animais[i] == null){
                animais[i] = passaro;
                return true;
            }
        }
        return false;
    }
    public boolean adicionarAnimal(Cachorro cachorro){
        for (int i = 0; i < animais.length; i++){
            if (this.animais[i] == null){
                animais[i] = cachorro;

                return true;
            }
        }
        return false;

    }
    public boolean adicionarAnimal(Cavalo cavalo){
        for (int i = 0; i < animais.length; i++){
            if(this.animais[i] == null){
                animais[i] = cavalo;
                return true;
            }
        }
        return false;

    }
    public boolean excluirAnimal(Animal animal){
        boolean excluir = false;
        for (int i = 0; i < animais.length; i++){
            if (animais[i] != null){
                if (animais[i].getNome().equals(animal.getNome())){
                    animais[i] = null;
                    excluir = true;
                }

            }
        }
        // Reordenar o vetor
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] == null) {
                for (int j = i ; j < animais.length ; j ++) {
                    if (animais[j] != null) {
                        animais[i] = animais[j] ;
                        animais[j] = null ;
                        break;
                    }
                }
            }
        }

        return excluir ;

    }
    public float calcula(Animal animal){
        boolean Cavalo = animal instanceof  Cavalo;
        boolean Cachorro = animal instanceof  Cachorro;
        boolean Passaro = animal instanceof  Passaro;

        if (Cavalo || Cachorro){
            Mamifero mamifero = (Mamifero) animal;
            return  mamifero.correr();
        }else if (Passaro){
            Passaro passaro = (Passaro) animal;
            return passaro.alturaDoVoo();

        }
        return 0.0f;

    }
    public Animal buscaAnimal(String nome){
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] != null){
                if (animais[i].getNome().equals(nome)){
                    return animais[i];
                }
            }
        }
        return null;
    }

}
