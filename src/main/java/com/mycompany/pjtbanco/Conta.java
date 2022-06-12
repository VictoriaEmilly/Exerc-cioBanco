
package com.mycompany.pjtbanco;

/**
 *
 * @author victo
 */
public abstract class Conta {
   protected int numero, agencia, saldo;
   protected PessoaFisica donoF;
   protected PessoaJuridica donoJ;
   
   public void Conta(int numero, int agencia, PessoaFisica donoF, PessoaJuridica donoJ){
       this.numero = numero;
       this.agencia = agencia;
       this.donoF = donoF;
       this.donoJ = donoJ;
       this.saldo = 0;
   }
   
   public int getNumero(){
       return this.numero;
   }
   public void setNumero(int numero){
       this.numero = numero;
   }
   
   public int getAgencia (){
       return this.agencia;
   }
   public void setAgencia(int agencia){
       this.agencia = agencia;
   }
   
   public int getSaldo (){
       return this.saldo;
   }
   public void setSaldo(int saldo){
       this.saldo = saldo;
   }
   
   public PessoaFisica getDono(){
       return this.donoF;
   }
   public void setDonoF (PessoaFisica donoF){
       this.donoF = donoF;
   }
   
   public PessoaJuridica getDonoJ(){
       return this.donoJ;
   }
   public void setDonoJ (PessoaJuridica donoJ){
       this.donoJ = donoJ;
   }
   
   protected void sacar(int valorSaque){
      if(saldo> valorSaque || saldo== valorSaque){
          saldo -= valorSaque;
          System.out.println("Saque de R$ "+valorSaque+" realizado com sucesso!");
      } 
      else{
          System.out.println("Não é possível realizar o saque, SALDO INSUFICIENTE! ");
      }
   }
   
   protected void depositar(int valorDeposito){
       System.out.println("Deposito de R$ "+valorDeposito+" realizado com sucesso!");
      saldo += valorDeposito; 
   }
   
   protected void verSaldo(){
       System.out.println("Saldo: R$"+this.saldo);
   }
   
   @Override
   public String toString(){
      return "Agência: "+this.agencia+ " Número: "+this.numero+" Conta em nome de: "+this.donoF.getNome()+ " "+this.donoJ; 
   }
   
}
