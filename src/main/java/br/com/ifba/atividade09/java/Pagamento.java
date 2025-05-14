/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.java;

/**
 *
 * @author Cauã
 */
public interface Pagamento {
    
    double calcularTotal(double valor); // metodo para calcular o valor final de cada "compra"
    String imprimirRecibo(double valor,double valorFinal);// para imprimir o recibo de cada compra
}
