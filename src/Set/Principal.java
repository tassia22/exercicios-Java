package Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Principal {
    public void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("insira o caminho completo do arquivo: ");
        String caminho = scan.nextLine();

        Map<String, Integer> votos = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();
            while (linha != null){
                String[] fields = linha.split(" ");
                String nomeCandidato = fields[0];
                int qntdVotos = Integer.parseInt(fields[1]);

                if (votos.containsKey(nomeCandidato)){
                    int votosPara = votos.get(nomeCandidato);
                    votos.put(nomeCandidato, qntdVotos+votosPara);
                }
                else{
                    votos.put(nomeCandidato, qntdVotos);
                }

                linha = br.readLine();



            }
            for (String key: votos.keySet()){
                System.out.println(key+":"+votos.get(key));
            }
        } catch (IOException e){
            System.out.println("erro: "+e.getMessage());
        }

        scan.close();
    }
}
