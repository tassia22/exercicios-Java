package Interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Prestacao {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

   private LocalDate dataVencimento;
   private  double valor;


    public Prestacao(LocalDate dataVencimento, double valor) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public String toString(){
        return  dataVencimento.format(fmt)+ " - "+String.format("%.2f", valor);
    }


    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
