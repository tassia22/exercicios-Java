package Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("insira o caminho completo do arquivo: ");
        String path = scan.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LoginEntrada> set = new HashSet<>();

            String linha =   br.readLine();
            while (linha != null){

                String[] fields = linha.split(" ");
                String nomeUsuario = fields[0];
                Date momento = Date.from(Instant.parse(fields[1]));

                set.add(new LoginEntrada(nomeUsuario, momento));

                linha = br.readLine();
            }

            System.out.println("total de usuarios: "+set.size());



        } catch (IOException e){
            System.out.println("erro: "+e.getMessage());
        }

        scan.close();
    }
}
