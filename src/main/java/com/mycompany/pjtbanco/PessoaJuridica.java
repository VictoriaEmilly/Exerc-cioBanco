
package com.mycompany.pjtbanco;

/**
 *
 * @author Victoria Santos
 */
public final class PessoaJuridica extends Pessoa {
    private int cnpj;
    
    public int getCnpj(){
        return this.cnpj;
    }
    public void setCpnj(int cnpj){
        this.cnpj = cnpj;
    }
}
