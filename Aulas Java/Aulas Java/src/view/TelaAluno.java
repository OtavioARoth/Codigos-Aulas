/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author Lab02
 */
public class TelaAluno {
    public static void main(String[] args) {
        Aluno aluno=new Aluno(); /* poderia ser Aluno paulo=new Aluno(); */
        Scanner leitor= new Scanner (System.in);
        System.out.println("Digite a matricula");
        aluno.setMatricula(leitor.nextInt()); /* pegando o atributo set matricula e atribui o valor que é digitado ( leitor.nextInt)*/
        System.out.println("Digite o RG:");
        aluno.setRG(leitor.nextLong());
        System.out.println("Digite o CPF");
        aluno.setCPF(leitor.nextLong());
        System.out.println("Digite o nome do aluno");
        aluno.setNome (leitor.next()); /* por ser string usa o nextLine */
        System.out.println("Digite o endereço");
        aluno.setEndereço(leitor.next());
        System.out.println("Digite o telefone");
        aluno.setTelefone(leitor.nextInt());
        System.out.println("Digite a mensalidade");
        aluno.setMensalidade(leitor.nextDouble());
        System.out.println("Aluno nome: "+aluno.getNome());
        System.out.println("matricula: "+aluno.getMatricula());
         System.out.println("RG: "+aluno.getRG()+ "CPF "+aluno.getCPF());
          System.out.println("Endereço: Rua "+aluno.getEndereço());
         System.out.println("Telefone +55 "+aluno.getTelefone());
          System.out.println("Mensalidade R$ "+aluno.getMensalidade());
               
        
    }
    
}
