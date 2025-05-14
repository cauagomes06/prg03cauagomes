/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.java;

/**
 *
 * @author Cauã
 */
public class PagamentoDinheiro implements Pagamento {//"implements" utiliza os metodos da inteface
    
    private static final double DESCONTO = 0.10; // cria a variavel constante DESCONTO
   
    @Override
    public double calcularTotal(double valor){
     
     return valor *(1 - DESCONTO);//faz o calculo e retorna
             }
    @Override
    public String imprimirRecibo(double valor, double valorFinal){
        
        // retorna o recibo
       return  """   
               Recibo de pagamento\n
                Valor da compra : R$ """+String.format("%.2f",valor)+"\n"
               +" Desconto : R$"+ String.format("%.2f",valor *DESCONTO)+ "\n"
               +" Valor final: R$"+String.format("%.2f",valorFinal)+"\n";
   }

}
