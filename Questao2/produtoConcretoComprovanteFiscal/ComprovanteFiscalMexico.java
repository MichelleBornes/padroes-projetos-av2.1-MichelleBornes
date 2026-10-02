package Questao2.produtoConcretoComprovanteFiscal;

import Questao2.produto.ComprovanteFiscal;

public class ComprovanteFiscalMexico implements ComprovanteFiscal{

    private boolean aceiteTermo;
    private double valorCompra;

    public ComprovanteFiscalMexico(boolean aceiteTermo, double valorCompra){
        this.aceiteTermo = aceiteTermo;
        this.valorCompra = valorCompra;
    }

    @Override 
    public String comprovante(double valorCompra){

        double iva;
        
        if(aceiteTermo){
            iva = valorCompra * 0.16;
        }
        else{
            return "Aceite negado";
        }

        return "Nota Fiscal CFDI | IVA: " + iva;
    }
    
}
