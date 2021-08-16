/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab02
 */
public class Aluno {
    private int matricula; /* só serão acessado pela classe aluno e n por outras */
    private long RG;
    private long CPF;
    private String nome;
    private String endereço;
    private int telefone;
    private double mensalidade;
    
    /* set quando quer atribuir valor a variavel, get quando quer buscar o valor da variavel */
    public void setMatricula(int matricula){
        this.matricula=matricula; /* atributo matricula ta recebendo um numero que a pessoa digitou */
        
        
    }    
    public int getMatricula(){ /* está chamando/retornando o atributo matricula */
        return this.matricula;
        
        
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
      
}
