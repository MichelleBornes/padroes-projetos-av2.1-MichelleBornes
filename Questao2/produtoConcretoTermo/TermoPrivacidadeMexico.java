package Questao2.produtoConcretoTermo;

import Questao2.produto.TermoPrivacidade;

public class TermoPrivacidadeMexico implements TermoPrivacidade{

    @Override
    public String privacidade() {
        return "Termo de privacidade conforme LFPDPPP";
    }
    
}
