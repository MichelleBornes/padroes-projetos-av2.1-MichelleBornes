package Questao1;

public class FreteAereo extends Frete{
    
    private double valorCarga;

    public FreteAereo(String nomeCliente, double valorCarga){
        super(nomeCliente);
        this.valorCarga = valorCarga;
    }

    @Override
    public double calcularFrete() {
        double valorFrete = valorCarga * 0.06;
        return valorFrete;
    }

    @Override
    public String listarDocumentos() {
        return "AWB (Air Waybill)";
    }

    public String modalidade(){
        return "Frete Aereo";
    }

    @Override
    public String gerarResumo() {
        return "Modalidade: " + modalidade()
                + "\nNome Cliente: " + nomeCliente
                + "\nValor frete: " + calcularFrete()
                + "\nDocumentos exigidos: " + listarDocumentos();
    }
}