package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("entre com o caminho completo do arquivo");
        String caminho = scan.nextLine();

        try(BufferedReader br = new  BufferedReader(new FileReader(caminho))){

            List<Professores> list = new ArrayList<>();

            String linha = br.readLine();

            while (linha != null){
                String[] fields = linha.split(", ");
                list.add(new Professores(fields[0],fields[1],Double.parseDouble(fields[2])));
                linha = br.readLine();



            }

            System.out.print("entre com o valor do salario: ");
            double salario = scan.nextDouble();

            List<String> email = list.stream()
                    //filtrar o salario
                    .filter(s -> s.getSalario() > salario)
                    .map(s -> s.emailInstitucional)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("email de professores cujo os salarios sao superiores"+String.format("%.2f",salario)+":");
            email.forEach(System.out::println);

            double soma  = list.stream()
                    //filtrando os nomes dos professores que comeca com a letra A
                    .filter(x -> x.getNome().charAt(0) == 'A')
                    .map(x -> x.getSalario())
                    //somando o salario
                    .reduce(0.0, (x,y)-> x+y);

            System.out.println("soma do salario de um professor cujo o nome começa com A: "+String.format("%.2f", soma));

        }catch (IOException e){
            System.out.println("erro: "+e.getMessage());

        }

        scan.close();

    }
}
