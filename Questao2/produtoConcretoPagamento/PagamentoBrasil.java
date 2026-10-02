package Questao2.produtoConcretoPagamento;

import Questao2.produto.Pagamento;

public class PagamentoBrasil implements Pagamento{
    @Override 
    public String processarPagamento(double valor){
        return "Pagamento via Pix | Valor final: R$" + valor;
    }
}
