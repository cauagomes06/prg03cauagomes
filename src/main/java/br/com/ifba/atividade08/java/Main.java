package br.com.ifba.atividade08.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cauã
 */
import java.util.Scanner;
public class Main {

    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);      
        ContaBanco conta1 = new ContaBanco(null,null,null,0.0,false); // criacao de objeeto base
        boolean sair = false;
   
      
        while(!sair){ // criaçao de menu usando while
            
              System.out.println("===== MENU PRINCIPAL ===== ");
              System.out.println("1 - ABRIR CONTA "); 
              System.out.println("2 - DEPOSITAR ");
              System.out.println("3 - SACAR ");
              System.out.println("4 - PAGAR MENSALIDADE ");
              System.out.println("5 - STATUS DA CONTA ");
              System.out.println("6 - FECHAR CONTA ");   
              System.out.println("7 - Sair"); 
              System.out.println("Escolha uma opcao : ");
              int escolha = scanner.nextInt();

              
         switch(escolha){
             // uso dos metodos criados no ContaBanco
             case 1 -> conta1.abrirConta();
             case 2 -> conta1.depositar();
             case 3 -> conta1.sacar();
             case 4 -> conta1.pagarMensal();
             case 5 -> {
                 //mostra dados da conta por meio de getters
                 System.out.println(" === Dados da Conta === ");
                 System.out.println(" Numero da Conta : "+ conta1.getNumConta());
                 System.out.println(" Tipo da Conta : "+ conta1.getTipo());
                 System.out.println(" Dono : "+ conta1.getDono());
                 System.out.println(" Saldo : "+ conta1.getSaldo());
                 System.out.println(" Status : "+(conta1.isStatus()? "Ativa": "Inativa"));
              }
             case 6 -> {
             conta1.fecharConta();
              }
             case 7 -> {
                 sair = true;
                 System.out.println(" Saindo....");
              }             
             default -> System.out.println(" Opção invalida,tente novamente");    
             }    

      
        } 
        scanner.close();
    }
}
