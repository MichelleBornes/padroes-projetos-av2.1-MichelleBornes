package Questao1;

public class FreteRodoviario extends Frete{

    private double valorCarga;

    public FreteRodoviario(String nomeCliente, double valorCarga){
        super(nomeCliente);
        this.valorCarga = valorCarga;
    }

    @Override
    public double calcularFrete() {
        double valorFrete = valorCarga * 0.02;
        return valorFrete;
    }

    @Override
    public String listarDocumentos() {
        return "CT-e e MDF-e";
    }

    public String modalidade(){
        return "Frete Rodoviario";
    }

    @Override
    public String gerarResumo() {
        return "Modalidade: " + modalidade()
                + "\nNome Cliente: " + nomeCliente
                + "\nValor frete: " + calcularFrete()
                + "\nDocumentos exigidos: " + listarDocumentos();
    }
}
