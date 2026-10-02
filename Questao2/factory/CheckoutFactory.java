package Questao2.factory;

import Questao2.produto.ComprovanteFiscal;
import Questao2.produto.Pagamento;
import Questao2.produto.TermoPrivacidade;

public interface CheckoutFactory {
    ComprovanteFiscal criarComprovanteFiscal();
    Pagamento criarPagamento();
    TermoPrivacidade criarTermoPrivacidade();
}
