package Interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("entre com os dados do contrato: ");
        System.out.print("numero: ");
        int num = scan.nextInt();
        System.out.print("data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scan.next(),fmt);
        System.out.print("valor do contrato: ");
        double valorTotal = scan.nextDouble();

        Contrato contrato = new Contrato(num, data,valorTotal);

        System.out.print("entre com o numero de parcelas: ");
        int n = scan.nextInt();

        ContratoServ servicoContr = new ContratoServ(new ServPagamento());
        servicoContr.ContratoPocesso(contrato, n);

        System.out.print("parcelas: ");
        for (Prestacao prestacao: contrato.getPrestacoes()){
            System.out.print(prestacao);
        }



        scan.close();
    }
}
