package Sobrecarga;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario func1 = new Funcionario("maria", 1200.0, 10);
        System.out.println(" salario do funcionario: 1"+func1.mostraSalario());

        Funcionario func2 = new Funcionario("jose", 3000.0, 12);
        System.out.println("salario do funcionario: 2"+func2.mostraSalario(13));

        scan.close();

    }
}
