
package com.mycompany.pjtbanco;

/**
 *
 * @author victo
 */
public class ContaCorDebito extends ContaCorrente {
    @Override
    protected void verSaldo(){
       int taxaImpressao = 2;
       this.saldo -=taxaImpressao;
        System.out.println("Taxa de R$2,00 para impressão do saldo efetuada com sucesso!");
        System.out.println("Saldo: R$"+this.saldo);
    }
}
