package Arquivos;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produtos> list = new ArrayList<>();

        System.out.println("entre com o caminho do arquivo: ");
        String caminhoArquivostr = scan.nextLine();

        File sourceFile = new File(caminhoArquivostr);
        String sourceFolderstr = new sourceFile.getParent();

        System.out.println(sourceFolderstr);

        //criando uma pasta
        boolean sucess = new File(sourceFolderstr+"\\out").mkdir();
        System.out.println("pasta criada: "+sucess);

        //criando arquivo de saida
        String targetFileStr = sourceFolderstr+"\\out\\summy.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){

            String itemCsv = br.readLine();
            while (itemCsv != null){

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int qntd = integer.parseInt(fields[2]);

                list.add(new Produtos(nome, preco, qntd));

                itemCsv = br.readLine();
            }
            try(BufferedReader bw = new BufferedReader( new FileWriter(targetFileStr))){

                for (Produtos item:list){
                    bw.write(item.getNome()+","+String.format("%.2f",item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr+"deu certo");
            }catch (IOException e){
                System.out.println("erro ao escrever arquivo"+e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("error de arquivo "+e.getMessage());
        }

        scan.close();
    }
}
