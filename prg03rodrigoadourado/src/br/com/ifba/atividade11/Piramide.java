/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author user
 */
public class Piramide extends Forma3D {
        
    private double base, altura, alturaLateral;

    public Piramide(double base, double altura, double alturaLateral) {
        this.base = base;
        this.altura = altura;
        this.alturaLateral = alturaLateral;
    }

    public double obterArea() {
        double areaBase = base * base;
        double areaLateral = 2 * base * alturaLateral;
        return areaBase + areaLateral;
    }

    public double obterVolume() {
        return (base * base * altura) / 3;
    }

    public String toString() {
        return "Pirâmide com base = " + base + ", altura = " + altura + ", altura lateral = " + alturaLateral;
    }

}
