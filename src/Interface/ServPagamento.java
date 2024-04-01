package Interface;

public class ServPagamento implements PagamentoServOnline{
    public double TaxaPagamento(double qntd){
        return qntd * 0.02;

    }
    public double Juros(double qntd,int meses){
        return qntd * 0.01 * meses;

    }
}

