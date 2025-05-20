/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author user
 */
public class Esfera extends Forma3D{
    
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    public double obterVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }

    public String toString() {
        return "Esfera com raio = " + raio;
    }
}
