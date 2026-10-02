package Questao1;

public class FreteMaritimoCreator extends FreteCreator{
    private String nomeCliente;
    private double valorCarga;

    public FreteMaritimoCreator(String nomeCliente, double valorCarga){
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

    @Override
    public Frete criaFrete() {
        return new FreteMaritimo(nomeCliente, valorCarga);
    }
}
