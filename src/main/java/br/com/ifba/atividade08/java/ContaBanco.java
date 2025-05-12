/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class ContaBanco {
    Scanner scanner = new Scanner(System.in);
    // variveis declaradas
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    //construtor
    public ContaBanco(String numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    } 

    // todos os getters
    public String getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    
// setters utilizados
    public void setNumConta(String numConta) {
        
        Random  random = new Random();
        int aleatorio = random.nextInt(100);// define um numero aleatorio pra conta
        numConta = String.valueOf(aleatorio);// converte pra string e coloca na variavel
        
        this.numConta = numConta;  // passada para a variavel principal
    }

      protected void setTipo(String novoTipo) {
        if (novoTipo != null &&(novoTipo.equals("cc") || novoTipo.equals("cp"))) {  // validaçao
            this.tipo = novoTipo;  //insere na variavel
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }
    private void setDono(String novoDono) {
        
        if(novoDono != null){ // validaçao 
            this.dono = novoDono;
        }else{
        System.out.println("----- Nome Invalido -----");
      }
    }


    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(){
        
      Random random = new Random(); 
       
       System.out.println(" Qual tipo de conta que voce deseja abrir? (cc ou cp)");
       String tipoEscolhido = scanner.next();// le o tipo escolhido
       setTipo(tipoEscolhido);// insere na variavel usando validacoes dentro do setter
       
        if(this.tipo != null){
            
            setStatus(true); // ao criar conta ela é ativada automaticamente
            
            // adiciona saldo inicial dependendo do tipo da conta
            if( this.tipo.equals("cc")){
                setSaldo(50);  
            }
            if( this.tipo.equals("cp")){
                setSaldo(150);
            }
            
            String numContaEscolhido =  "0";
            setNumConta(numContaEscolhido); // define um numero aleatorio pra conta
            System.out.println(" Qual o dono desta conta?");
            String donoEscolhido = scanner.next();// pede um nome pra conta
            setDono(donoEscolhido); // insere por meio do setter o nome
            
            // mostra usando getters a conta criada
                 System.out.println(" CONTA ABERTA COM SUCESSO!!!");
                 System.out.println(" \n\nNumero da conta : "+ getNumConta());
                 System.out.println(" Tipo da conta : "+ getTipo());
                 System.out.println(" Dono da conta : "+ getDono());
                 System.out.println(" Saldo da conta : "+ getSaldo());
                 System.out.println(" Status " +(isStatus() ? " Ativa" : " Inativa")); // usei ? e : como usaria um if e else

        }
    }
    public void fecharConta(){
        
        if(getSaldo() != 0.0){ //validaçao
            System.out.println("Nao pode desativar essa conta ainda existe dinheiro nela");
        }else{
            setStatus(false);//desligamento da conta
        }
    }
    public void depositar(){
        
        if(!(isStatus())) {// caso a conta esteja ativa
               System.out.println("Conta desativada nao pode depositar");
        } else {
            System.out.println("Digite o valor que voce deseja depositar");
           double valorDepositado  =  scanner.nextDouble(); // ler o valor que deseja depositar
   
           this.saldo += valorDepositado; // incrementa no saldo
           System.out.println("Valor de R$"+valorDepositado+" foi depositado com sucesso"); // confirmação
         }
    
     }
    public void sacar(){
        
        if(!(isStatus())){// caso a conta esteja ativa
               System.out.println("Conta desativada nao pode sacar");
        }else{
             System.out.println("Digite o valor que voce deseja sacar");
            double valorSacado = scanner.nextDouble();// recebe o valor que o usuario deseja sacar
            if(this.saldo >= valorSacado){ //  valor de saque nao pode ser maior que o saldo
               this.saldo -= valorSacado; // decrementa do saldo
             System.out.println("Valor de R$"+valorSacado+" foi sacado com sucesso"); // comfirmaçao
               
            }else{
             System.out.println("Saldo insuficiente");
            }
        }
    }
    public void pagarMensal(){
        
          if((isStatus())){// caso a conta esteja 
              
              if(this.tipo.equals("cc")){
                  this.saldo -= 12.0; // decrementa 12 se for conta corrente
              }else if (this.tipo.equals("cp")){
                  this.saldo -= 20.0; // decrementa 20 se for conta poupança
              } 
          }else{
               System.out.println("Conta desativada"); 
              }
            
    }
}