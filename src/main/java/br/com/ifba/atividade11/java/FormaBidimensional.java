/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Cauã
 */
abstract class FormaBidimensional extends Forma {

    @Override
    public double obterArea() {
     return 0 ;
    }
}
class Quadrado extends FormaBidimensional{
    
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
   public double obterArea(){
       
       return lado*lado ;
   }

    @Override
    public String toString() {
        return "Quadrado com lado ="+lado;
    }
    
}
class Circulo extends FormaBidimensional{
    
    private double raio;
    public Circulo(double raio) {
       this.raio = raio;
    }
    @Override
       public double obterArea(){
       
       return Math.PI *raio * raio ;
   }

    @Override
    public String toString() {
        return "Circulo com raio ="+raio;
    }
}
class Triangulo extends FormaBidimensional{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
       public double obterArea(){
       
       return 0.5 * base *altura ;
   }

    @Override
    public String toString() {
        return "Triangulo com base = "+base+ "e altura =" +altura;
    }
}
