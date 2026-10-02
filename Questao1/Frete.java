package Questao1;

public abstract class Frete{
    protected String nomeCliente;

    public Frete(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public abstract double calcularFrete();
    public abstract String listarDocumentos();
    public abstract String gerarResumo();
}
