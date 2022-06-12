
package com.mycompany.pjtbanco;

/**
 *
 * @author victo
 */
public class ContaPoupanca extends Conta {
    
    public void rendimento(){
        if (this.getSaldo()>=100&& this.getSaldo()<500){
            int taxaRendimento = 10;
            this.setSaldo(this.getSaldo()+taxaRendimento);
            System.out.println("PARABÉNS! Seu saldo rendeu R$ "+taxaRendimento);
        }
        else if (this.getSaldo()>=500 && this.getSaldo()<1000){
            int taxaRendimento = 50;
            this.setSaldo(this.getSaldo()+taxaRendimento);
            System.out.println("PARABÉNS! Seu saldo rendeu R$ "+taxaRendimento);
        }
        else{
            int taxaRendimento = 100;
            this.setSaldo(this.getSaldo()+taxaRendimento);
            System.out.println("PARABÉNS! Seu saldo rendeu R$ "+taxaRendimento);
        }
    }
}
