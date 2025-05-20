/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author user
 */
public class Triangulo extends Forma2D{
    
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double obterArea() {
        return (base * altura) / 2;
    }

    public String toString() {
        return "Triângulo com base = " + base + " e altura = " + altura;
    }
}
