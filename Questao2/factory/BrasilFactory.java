package Questao2.factory;

import Questao2.produto.ComprovanteFiscal;
import Questao2.produto.Pagamento;
import Questao2.produto.TermoPrivacidade;
import Questao2.produtoConcretoComprovanteFiscal.ComprovanteFiscalBrasil;
import Questao2.produtoConcretoPagamento.PagamentoBrasil;
import Questao2.produtoConcretoTermo.TermoPrivacidadeBrasil;

public class BrasilFactory implements CheckoutFactory{
    private boolean privacidade;
    
    public BrasilFactory(boolean privacidade){
        this.privacidade = privacidade;
    }

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new ComprovanteFiscalBrasil(privacidade, 0);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBrasil();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoPrivacidadeBrasil();
    }


}
