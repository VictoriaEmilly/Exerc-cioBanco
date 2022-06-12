
package com.mycompany.pjtbanco;

/**
 *
 * @author Victoria Santos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Vick");
        p1.setIdade(20);
        p1.setEndereco("Rua Muqui, n779");
        p1.setCpf(873653);
        System.out.println(p1.toString()+"|cpf: "+p1.getCpf());
        
       /* PessoaJuridica p2 = new PessoaJuridica();
        p2.setSexo('F');
        p2.setCpnj(26721);
        p2.setNome("Ninha");
        p2.setIdade(60);
        System.out.println(p2.toString());
        */
        
       ContaCorCredito c1 = new ContaCorCredito();
       c1.setDonoF(p1);
       c1.setNumero(65);
       c1.setAgencia(5555);
       c1.setSalario(5000);
       c1.comprarAPrazo(1000);
       c1.comprarAPrazo(500);
       c1.depositar(750);
      
       c1.verSaldo();
       
       
        System.out.println(c1.toString());
       
    }
    
}
