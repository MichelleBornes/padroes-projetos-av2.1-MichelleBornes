package Questao2.factory;

import Questao2.produto.ComprovanteFiscal;
import Questao2.produto.Pagamento;
import Questao2.produto.TermoPrivacidade;
import Questao2.produtoConcretoComprovanteFiscal.ComprovanteFiscalMexico;
import Questao2.produtoConcretoPagamento.PagamentoMexico;
import Questao2.produtoConcretoTermo.TermoPrivacidadeMexico;


public class MexicoFactory implements CheckoutFactory{
    private boolean privacidade;
    
    public MexicoFactory(boolean privacidade){
        this.privacidade = privacidade;
    }

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new ComprovanteFiscalMexico(privacidade, 0);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoMexico();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoPrivacidadeMexico();
    }
}
