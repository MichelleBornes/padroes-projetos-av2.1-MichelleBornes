package Questao1;

public class Main {
    
    public static void main(String[] args) {
        
        FreteCreator aereo = new FreteAereoCreator("Ana", 3000);
        aereo.processarFrete();

        FreteCreator maritimo = new FreteMaritimoCreator("Julia", 50000);
        maritimo.processarFrete();

        FreteCreator rodoviario = new FreteRodoviarioCreator("Pablo", 2000);
        rodoviario.processarFrete();
    }
}
