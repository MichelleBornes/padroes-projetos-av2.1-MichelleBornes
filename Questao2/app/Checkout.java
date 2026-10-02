package Questao2.app;

import Questao2.produto.ComprovanteFiscal;
import Questao2.produto.Pagamento;
import Questao2.produto.TermoPrivacidade;
import Questao2.factory.CheckoutFactory;

public class Checkout {
    private ComprovanteFiscal comprovanteFiscal;
    private Pagamento pagamento;
    private TermoPrivacidade termoPrivacidade;

    public Checkout(CheckoutFactory factory){
        this.comprovanteFiscal = factory.criarComprovanteFiscal();
        this.pagamento = factory.criarPagamento();
        this.termoPrivacidade = factory.criarTermoPrivacidade();
    }

    public void finalizarPedido(double valor){
        System.out.println("=== RELATÓRIO DO PEDIDO ===");
        System.out.println(comprovanteFiscal.comprovante(valor));
        System.out.println(pagamento.processarPagamento(valor));
        System.out.println(termoPrivacidade.privacidade());
        System.out.println();

    }
}


