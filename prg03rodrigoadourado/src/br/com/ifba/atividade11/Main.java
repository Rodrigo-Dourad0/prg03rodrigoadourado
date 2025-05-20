/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author almei
 */
public class Main {
    public static void main(String[] args) {
        // Criando um vetor de formas
        Forma[] formas = new Forma[6];

        // Preenchendo o vetor com diferentes formas
        formas[0] = new Circulo(3);                  // Forma2D
        formas[1] = new Quadrado(4);                 // Forma2D
        formas[2] = new Triangulo(5, 6);             // Forma2D
        formas[3] = new Esfera(2);                   // Forma3D
        formas[4] = new Cubo(3);                     // Forma3D
        formas[5] = new Piramide(4, 5, 6);           // Forma3D

        // Processando cada forma: mostrando descrição e identificando se é 2D ou 3D
        for (Forma f : formas) {
            System.out.println(f.toString()); // descrição com toString()

            // Se for forma 2d
            if (f instanceof Forma2D) {
                Forma2D forma2D = (Forma2D) f;
                System.out.printf("Área: %.2f\n", forma2D.obterArea());
            }

            // Se for forma 3d
            else if (f instanceof Forma3D) {
                Forma3D forma3D = (Forma3D) f;
                System.out.printf("Área: %.2f\n", forma3D.obterArea());
                System.out.printf("Volume: %.2f\n", forma3D.obterVolume());
            }

            System.out.println("------------------------------");
        }
    }
}
