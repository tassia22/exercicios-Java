package Interface;

import java.time.LocalDate;

public class ContratoServ {

    private PagamentoServOnline servOnline;

    public void ContratoPocesso(Contrato contrato, int meses){
        double parcelaBasica = contrato.getValorTotal() / meses;
      for (int i = 1; i <= meses; i++ ){
          LocalDate vencimento = contrato.getData().plusMonths(i);

          double juro = servOnline.Juros(parcelaBasica, i);
          double taxa = servOnline.TaxaPagamento(parcelaBasica + juro);
          double basico = parcelaBasica + juro + taxa;

          contrato.getPrestacoes().add(new Prestacao(vencimento, basico));

      }

    }
}
