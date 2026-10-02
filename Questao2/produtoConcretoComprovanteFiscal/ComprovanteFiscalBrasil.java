package Questao2.produtoConcretoComprovanteFiscal;

import Questao2.produto.ComprovanteFiscal;

public class ComprovanteFiscalBrasil implements ComprovanteFiscal{
    
    private boolean aceiteTermo;
    private double valorCompra;

    public ComprovanteFiscalBrasil(boolean aceiteTermo, double valorCompra){
        this.aceiteTermo = aceiteTermo;
        this.valorCompra = valorCompra;
    }

    @Override 
    public String comprovante(double valorCompra){

        double iss;
        
        if(aceiteTermo){
            iss = valorCompra * 0.05;
        }
        else{
            return "Aceite negado";
        }

        return "Nota Fiscal | ISS: " + iss;
    }
}
