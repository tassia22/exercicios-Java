package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("entre com o caminho completo do arquivo");
        String path = scan.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Funcionarios> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Funcionarios(fields[0], fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("entre com o valor do salario: ");
            double salario = scan.nextDouble();

            List<String> email = list.stream()
                    .filter(x -> x.getSalario() > salario)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("email de pessoas cujo os salarios sao superiores"+String.format("%.2f",salario)+":");
            email.forEach(System.out::println);

            double soma = list.stream()
                    .filter(x -> x.getNome().charAt(0) == 'M')
                    .map(x -> x.getSalario())
                    .reduce(0.0, (x, y) -> x+y);

            System.out.println("soma do salario de uma pessoa cujo o nome começa com M: "+String.format("%.2f", soma));

        }catch (IOException e){
            System.out.println("erro: "+e.getMessage());
        }

        scan.close();
    }
}
