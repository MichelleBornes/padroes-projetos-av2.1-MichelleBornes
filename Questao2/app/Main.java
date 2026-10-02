package Questao2.app;

import Questao2.factory.BrasilFactory;
import Questao2.factory.CheckoutFactory;
import Questao2.factory.MexicoFactory;

public class Main {
    
    public static void main(String[] args) {
        CheckoutFactory brasilFactory = new BrasilFactory(true);
        Checkout checkoutBrasil = new Checkout(brasilFactory);
        checkoutBrasil.finalizarPedido(4000);

        CheckoutFactory mexicoFactory = new MexicoFactory(true);
        Checkout checkoutMexico = new Checkout(mexicoFactory);
        checkoutMexico.finalizarPedido(500);
    }
}
