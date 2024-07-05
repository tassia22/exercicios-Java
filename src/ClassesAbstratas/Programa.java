package ClassesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	public static void main(String [] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaPoupanca(122, "jose", 2000, 0.01));
		lista.add(new ContaCorrente(123, "maicon", 1500, 2000));
		lista.add(new ContaPoupanca(124, "madalena", 10000, 0.02));
		
		//somando o saldo na lista
		double soma = 0.0;
		for(Conta c : lista) {
			soma+=c.getSaldo();
		}
		
		System.out.printf("saldo total: %.2f%n" , soma);
		
		//depositar na conta
		for(Conta c : lista) {
			c.depositar(10.0);
		}
		
		//valor do saldo atualizado
		for(Conta c : lista) {
			System.out.printf("saldo atualizado na conta  %d: %.2f%n", c.getNome(), c.getSaldo());
		}
	}

}
