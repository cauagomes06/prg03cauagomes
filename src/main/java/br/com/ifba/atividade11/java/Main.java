/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class Main {
           public static void main(String[]args){
           
       Scanner scanner = new Scanner(System.in); 
       
           Forma[] formas = new Forma[6];// cria vetor para armazenar as formas
           //armazena as formas cada uma em um indice
           formas[0] = new Circulo(5);
           formas[1] = new Quadrado(4);
           formas[2] = new Triangulo(6,7);
           formas[3] = new Esfera(3);
           formas[4] = new Piramide(5,9,8);
           formas[5] = new Cubo(9);
           
           int escolha;
           
        do{   
           System.out.println("QUAL O TIPO DA FORMA"); // menu para melhor visualizaçao 
           System.out.println("[1] BIDIMENSIONAL");
           System.out.println("[2] TRIDIMENSIONAL");
           System.out.println("[3] Exibir todas");
           System.out.println("Escolha:");
           escolha = scanner.nextInt();
        
       switch (escolha) {  // mostra as formas da maneira que voce preferir usando switch case e for each
           case 1 -> {
         
               for( Forma forma : formas){
                   
                   if (forma instanceof FormaBidimensional){
                       System.out.println("toString :"+ forma.toString());
                       System.out.println("Tipo: Forma Bidimensional");
                       System.out.println("Area: " + forma.obterArea());
                       System.out.println("----");
                   }
               }   }
           case 2 -> {
               for (Forma forma : formas){
                   if (forma instanceof FormaTridimensional formaTridimensional){
                       System.out.println("toString :"+ forma.toString());
                       System.out.println("Tipo: Forma Tridimensional");
                       System.out.println("Area: " + forma.obterArea());
                       System.out.println("Volume :"+ formaTridimensional.obterVolume()); // tive que usar interface para conseguir imprimir dessa forma
                       System.out.println("----");
                   }
               }   }
           case 3 -> {
               for( Forma forma : formas){
                   
                   if (forma instanceof FormaBidimensional){
                       System.out.println("toString :"+ forma.toString());
                       System.out.println("Tipo: Forma Bidimensional");
                       System.out.println("Area: " + forma.obterArea());
                       System.out.println("----");
                   }else if (forma instanceof FormaTridimensional formaTridimensional){
                       System.out.println("toString :"+ forma.toString());
                       System.out.println("Tipo: Forma Tridimensional");
                       System.out.println("Area: " + forma.obterArea());
                       System.out.println("Volume :"+ formaTridimensional.obterVolume());// tive que usar interface para conseguir imprimir dessa forma
                       System.out.println("----");
                   }
               }   }
           default -> System.out.println("Tente novamente,entrada invalida!");
       }
     } while(escolha != 0);
   }
}
