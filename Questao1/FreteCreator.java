package Questao1;

public abstract class FreteCreator {
    
    public abstract Frete criaFrete();

    public final void processarFrete(){
        Frete frete = criaFrete();

        System.out.println("Frete aprovado!");
        System.out.println(frete.gerarResumo());
        System.out.println();
    }

}
