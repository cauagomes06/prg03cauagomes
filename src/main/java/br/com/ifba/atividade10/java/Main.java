/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;

import java.util.Scanner;

/**
 *
 * @author Cauã
 */

public class Main {

     public static void main(String[]args){
     Scanner scanner = new Scanner(System.in);
     
     PerfilUsuario administrador = Usuario.criaPerfil();
     Usuario usuario = Usuario.criaUsuario(administrador);
    
     usuario.criarLog("Criou perfil");
     usuario.criarLog("Criou usuario");
      boolean sair = false;
   
      
        while(!sair){ // criaçao de menu usando while
            
              System.out.println("===== MENU PRINCIPAL ===== ");
              System.out.println("1 - Logar"); 
              System.out.println("2 - Deslogar ");
              System.out.println("3 - Imprimir logs");
              System.out.println("4 - toString Usuario"); 
              System.out.println("5 - toString Sessao"); 
              System.out.println("6 - toString PerfilUsuario"); 
          
              System.out.println("Escolha uma opcao : ");
              int escolha = scanner.nextInt();

              scanner.nextLine();
         switch(escolha){

                   case 1 -> {
                    System.out.println("Digite o nome de usuario: ");   
                    String nomeEscolhido = scanner.nextLine();
                    System.out.println("Digite a senha: ");
                    String senhaEscolhida = scanner.nextLine();
                    usuario.logarConta(nomeEscolhido,senhaEscolhida); //faz o login
             
                   }
               
                   case 2 -> 
                       usuario.deslogarConta();
                   case 3 -> 
                       usuario.mostrarLogs();
                
                   case 4 -> {
                        usuario.toStringUsuario();
                   }
                   case 5 -> {
                        usuario.toStringSessao();
                   }
                   case 6 -> {
                        usuario.toStringPerfil();
                   }
                     
             default -> System.out.println(" Opção invalida,tente novamente");    
             }   
          }
        } 
    }
    
