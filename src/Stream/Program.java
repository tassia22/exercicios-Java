package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("entre com o caminho completo do arquivo");
        String path = scan.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                //double.parsedouble converte o numero para double
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
            }
            //encontra o preco medio de todos os produtos
            double avg = list.stream().map(p -> p.getPreco()).reduce(0.0, (x,y) -> x + y) / list.size();
            System.out.println("preco medio: "+String.format("%.2f", avg));

            //comparador de strings independentes de letras maiuscula ou menuscula
            Comparator<String> comp =(s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //nome dos produtos que tem o preco abaixo da media
            List<String> nomes = list.stream()
                    .filter(p -> p.getPreco() < avg)
                    .map(p -> p.getNome())
                    //ordenar usando o reversed que ordena em ordem decrescente
                    .sorted(comp.reversed())
                    //transformar a stream em lista
                    .collect(Collectors.toList());

            nomes.forEach(System.out::println);



        }catch(IOException e){
                System.out.println("erro: "+e.getMessage());

            }
        scan.close();
        }



    }

