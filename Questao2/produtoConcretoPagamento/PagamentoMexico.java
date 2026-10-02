package Questao2.produtoConcretoPagamento;

import Questao2.produto.Pagamento;

public class PagamentoMexico implements Pagamento{

    @Override
    public String processarPagamento(double valor) {
       return "Pagamento via SPEI | Valor final: " + valor;
    }
    
}
