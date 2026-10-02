package Questao1;

public class FreteAereoCreator extends FreteCreator{
    
    private String nomeCliente;
    private double valorCarga;

    public FreteAereoCreator(String nomeCliente, double valorCarga){
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

    @Override
    public Frete criaFrete() {
        return new FreteAereo(nomeCliente, valorCarga);
    }
}
