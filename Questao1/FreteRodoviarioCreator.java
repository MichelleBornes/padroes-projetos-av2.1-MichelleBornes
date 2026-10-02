package Questao1;

public class FreteRodoviarioCreator extends FreteCreator{
    private String nomeCliente;
    private double valorCarga;

    public FreteRodoviarioCreator(String nomeCliente, double valorCarga){
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

    @Override
    public Frete criaFrete() {
        return new FreteRodoviario(nomeCliente, valorCarga);
    }
}
