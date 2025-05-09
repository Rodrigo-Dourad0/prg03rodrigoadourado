/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author user
 */
public class Fatorial {
    private int valor;       // Número cujo fatorial será calculado
    private int fatorial;    // Resultado do fatorial
    private String formula;  // Representação da fórmula (ex: "5 x 4 x 3 x 2 x 1")

    // Define o valor e calcula o fatorial e a fórmula
    public void setValor(int n) {
        valor = n;
        fatorial = 1;
        StringBuilder sb = new StringBuilder();
        
        for (int i = n; i > 0; i--) {
            fatorial *= i;        // Multiplica os valores de n até 1
            sb.append(i);         // Adiciona o número à fórmula
            if (i > 1) sb.append(" x ");  // Adiciona " x " entre os números
        }
        formula = sb.toString();  // Armazena a fórmula completa
    }

    // Retorna o valor do fatorial calculado
    public int getFatorial() {
        return fatorial;
    }

    // Retorna a fórmula usada no cálculo
    public String getFormula() {
        return formula;
    }
}