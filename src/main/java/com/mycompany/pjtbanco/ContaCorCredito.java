
package com.mycompany.pjtbanco;

/**
 *
 * @author Victoria Santos <victoriaefs@outlook.com>
 */
public class ContaCorCredito extends ContaCorrente{
    private double limiteCartao, fatura;
    
    public void ContaCorCredito(double limiteCartao, double fatura){
        this.limiteCartao = limiteCartao;
        this.fatura = 0;
          
    }
    
    public double getLimiteCartao(){
        return this.limiteCartao;
    }
    public void setLimiteCartao(double limiteCartao){
        this.limiteCartao = limiteCartao;
    }
    
    public double getFatura(){
        return this.fatura;
    }
    public void setFatura(double fatura){
        this.fatura = fatura;
    }
   
    public void limiteCartao(){
       
    }
    
    @Override
    protected void sacar(int valorSaque){ // sacar neste caso seria tipo realizar compra
        System.out.println("Não é possível realizar o saque em conta de Crédito! ");   
    }
    
    public void comprarAPrazo(double compra){
        if(this.salario <= 1000){
           this.limiteCartao = this.salario/2;
           System.out.println("Limite disponível: "+this.limiteCartao);
           if(this.limiteCartao >= compra){
            this.fatura += compra;
            System.out.println("Compra de R$ "+compra+" realizada com sucesso!");
        }
        else{
            System.out.println("Não é possivel realizar a compra, LIMITE DA FATURA ATINGIGO!");
        } 
       }else if(this.salario > 1000 && this.salario <= 2000){
           this.limiteCartao = this.salario/1.5;
           System.out.println("Limite disponível: "+this.limiteCartao);
           if(this.limiteCartao >= compra){
            this.fatura += compra;
            System.out.println("Compra de R$ "+compra+" realizada com sucesso!");
        }
        else{
            System.out.println("Não é possivel realizar a compra, LIMITE DA FATURA ATINGIGO!");
        } 
       }else if(this.salario >2000 && this.salario <= 4000){
           this.limiteCartao = this.salario/1.3;
           System.out.println("Limite disponível: "+this.limiteCartao);
           if(this.limiteCartao >= compra){
            this.fatura += compra;
            System.out.println("Compra de R$ "+compra+" realizada com sucesso!");
        }
        else{
            System.out.println("Não é possivel realizar a compra, LIMITE DA FATURA ATINGIGO!");
        } 
       } else{
           this.limiteCartao = this.salario/1.25;
           System.out.println("Limite disponível: "+this.limiteCartao);
           if(this.limiteCartao >= compra){
            this.fatura += compra;
            System.out.println("Compra de R$ "+compra+" realizada com sucesso!");
        }
        else{
            System.out.println("Não é possivel realizar a compra, LIMITE DA FATURA ATINGIGO!");
        } 
       }
        
    }
    
    @Override
    protected void depositar(int valorDeposito){ //pagar fatura automaticamente
        if (valorDeposito <= this.fatura){
            this.fatura -= valorDeposito;
            System.out.println("Depósito de R$"+valorDeposito+" realizado com sucesso!");
        }else{
            System.out.println("Não é possível realizar depósito em conta de Crédito! ");
        }
    }
        
    @Override
    public void verSaldo(){ // ver valor da fatura
        System.out.println("Valor da fatura: R$"+this.fatura);
        
    }
        
        
    }

