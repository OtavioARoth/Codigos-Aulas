/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Hospedagem;
import model.Quarto;

/**
 *
 * @author Lab01
 */

public class TelaHospedagem {
    public static void main(String[] args) {
        
    
    Hospedagem hospedagem=new Hospedagem();
    Quarto quarto= new Quarto();
    Cliente cliente= new Cliente();
    
        
    
    
   
    cliente.setNome(JOptionPane.showInputDialog("digite o nome do cliente: "));
    cliente.setRg(Long.parseLong(JOptionPane.showInputDialog("digite o RG: ")));
    cliente.setCpf(Long.parseLong(JOptionPane.showInputDialog("digite o CPF: ")));
    cliente.setEndereco(JOptionPane.showInputDialog("digite o Endereço: "));
    cliente.setTelefone( Integer.parseInt(JOptionPane.showInputDialog("digite o telefone:")));
    quarto.setAndar(Integer.parseInt(JOptionPane.showInputDialog("digite o andar: ")));
    quarto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero: ")));
    quarto.setValor(Double.parseDouble(JOptionPane.showInputDialog("digite o Valor: ")));
    
    hospedagem.setId(1);
    hospedagem.setHorai(Integer.parseInt(JOptionPane.showInputDialog("digite a hora que chegou:")));
        hospedagem.setHoraf(Integer.parseInt(JOptionPane.showInputDialog("digite a hora que saiu:")));
        
        DecimalFormat df=new DecimalFormat("0,00");
        String totald=df.format(hospedagem.valorTotalHospedagem(hospedagem.totalHoras(hospedagem.getHorai(), hospedagem.getHoraf()),quarto.getValor()));
      JOptionPane.showMessageDialog(null, "nome"+
    cliente.getNome()+ 
    "\n quarto nº" +quarto.getNumero()+
    "\n total hospeage R$" +totald
    );
    
}}
