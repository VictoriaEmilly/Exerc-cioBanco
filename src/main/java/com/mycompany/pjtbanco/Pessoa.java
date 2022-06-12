
package com.mycompany.pjtbanco;

/**
 *
 * @author victo
 */
public abstract class Pessoa {
    protected String nome, endereco;
    protected int idade;
    protected char sexo;
    
    //metodo construtor
    public void Pessoa (String nome, String endereco, int idade, char sexo) {
    this.nome = nome;
    this.endereco = endereco;
    this.idade = idade;
    this.sexo = sexo;
    }
    
    //metódos get e set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char sexo){
       this.sexo = sexo; 
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.nome+ "| Endereço: "+this.endereco+ "| Idade: "+this.idade+ "| Sexo: "+this.sexo;
    }
}
