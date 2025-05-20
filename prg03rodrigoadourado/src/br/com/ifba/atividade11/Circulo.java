/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author user
 */
public class Circulo extends Forma2D {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return Math.PI * raio * raio;
    }

    public String toString() {
        return "Círculo com raio = " + raio;
    }
}
