package Questao1;

public class FreteMaritimo extends Frete{
    
    private double valorCarga;

    public FreteMaritimo(String nomeCliente, double valorCarga){
        super(nomeCliente);
        this.valorCarga = valorCarga;
    }

    @Override
    public double calcularFrete() {
        double valorFrete = valorCarga * 0.01;
        return valorFrete;
    }

    @Override
    public String listarDocumentos() {
        return "BL (Bill of Lading) e fatura comercial";
    }

    public String modalidade(){
        return "Frete Maritimo";
    }

    @Override
    public String gerarResumo() {
        return "Modalidade: " + modalidade()
                + "\nNome Cliente: " + nomeCliente
                + "\nValor frete: " + calcularFrete()
                + "\nDocumentos exigidos: " + listarDocumentos();
    }
}
