
package com.mycompany.pjtbanco;

/**
 *
 * @author victo
 */
public abstract class ContaCorrente extends Conta{
    public double salario;
    
    public void ContaCorrente(double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
  
    
    
}
