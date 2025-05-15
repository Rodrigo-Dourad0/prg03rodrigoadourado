/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author user
 */
public class PagamentoDinheiro implements Pagamento {
    
    private double valor; // Valor original da compra

    public PagamentoDinheiro(double valor) {
        this.valor = valor; // Armazena o valor passado no construtor
    }
    
    public double calcularTotal() {
        return valor * 0.90; // Aplica um desconto de 10% para pagamento em dinheiro
    }
    
    public String imprimirRecibo() {
        // Retorna uma string formatada com os detalhes do pagamento e o desconto aplicado
        return String.format("""
                            - RECIBO DINHEIRO -
                           Valor original: R$%.2f
                           Total a pagar com desconto: R$%.2f
                           """, valor, calcularTotal());
    }
}
