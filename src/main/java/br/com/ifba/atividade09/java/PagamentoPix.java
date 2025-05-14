/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.java;

/**
 *
 * @author Cauã
 */
public class PagamentoPix implements Pagamento{//"implements" utiliza os metodos da inteface
    
    private static final double CASHBACK = 0.02; // declara a variavel constante CASHBACK
   
    @Override
   public double calcularTotal(double valor){
     
     double cashback = valor * CASHBACK; //faz o calculo do cashback
     return valor - cashback; //retorna o valor descontando
             }
    @Override
   public String imprimirRecibo(double valor, double valorFinal){
       
       return  """
               Recibo de pagamento\n
                Valor da compra : R$ """+String.format("%.2f",valor)+"\n"
               +" CASHBACK : R$"+ String.format("%.2f",valor *CASHBACK)+ "\n"
               +" Valor final: R$"+String.format("%.2f",valorFinal)+"\n";
   }

}
