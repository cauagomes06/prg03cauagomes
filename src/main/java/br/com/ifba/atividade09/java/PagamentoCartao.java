/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.java;

/**
 *
 * @author Cauã
 */
public class PagamentoCartao implements Pagamento { //"implements" utiliza os metodos da inteface
    
    private static final double TAXA = 0.05; // cria variavel constante Taxa
   
    @Override   //netbeans recomendou usar isso
    public double calcularTotal(double valor){

    return valor *(1 + TAXA);     //faz o calculo e retorna
             }
    @Override
    public String imprimirRecibo(double valor, double valorFinal){
       
    return  """
               Recibo de pagamento\n
                Valor da compra : R$ """+String.format("%.2f",valor)+"\n"    // imprimi o recibo
               +" Taxa : R$"+ String.format("%.2f",valor * TAXA)+ "\n"
               +" Valor final: R$"+String.format("%.2f",valorFinal)+"\n";
   }

}
