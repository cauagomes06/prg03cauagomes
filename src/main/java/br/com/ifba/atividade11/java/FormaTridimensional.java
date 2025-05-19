/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Cauã
 */
abstract class FormaTridimensional extends Forma{

    public abstract double obterVolume();

    @Override
    public double obterArea() {
       return 0;
    }
    
}
// todas as sub classes sao filhas de FORMA TRIDIMENSIONAL e tem um atributo um construtor,um metodo obter area um obter volume e um toString
// unica diferenca entre elas sao as formulas que sao desenvolvidas
class Esfera extends FormaTridimensional{

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
        @Override
    public double obterArea() {
     
        return 4 * Math.PI * raio * raio;
    }
    @Override
    public double obterVolume(){
        
        return (4.0 / 3.0) * Math.PI * raio * raio* raio;
    }

    @Override
    public String toString() {
       return "Esfera de raio ="+raio;
    }
}
class Piramide extends FormaTridimensional{
    
       private double altura;
       private double base;
       private double apotema;

    public Piramide(double altura, double base, double apotema) {
        this.altura = altura;
        this.base = base;
        this.apotema = apotema;
    }
 
        @Override
    public double obterArea() {
     
        return (base*base) * (4.0*0.5*base*apotema) ;
    }
    @Override
    public double obterVolume(){
        
        return (1.0/3.0)*(base*base) * altura;
    }

    @Override
    public String toString() {
        return "Piramide de altura ="+altura+" apotema = "+apotema+"e base +"+base;
    }
   
}
class Cubo extends FormaTridimensional{
    
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    @Override
       public double obterArea() {
     
        return 6 *lado*lado ;
    }
    @Override
       public double obterVolume(){
        
        return lado*lado*lado;
    }

    @Override
    public String toString() {
     return "Cubo de lado = "+lado;
    }
}
