/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author user
 */
public class PagamentoPix implements Pagamento {
    
    private double valor; // Valor original da compra

    public PagamentoPix(double valor) {
        this.valor = valor; // Armazena o valor informado no construtor
    }
    
    public double calcularTotal() {
        return valor * 0.98; // Aplica um desconto de 2%, simulando um cashback
    }
    
    public String imprimirRecibo() {
        // Gera o recibo formatado com valor original e valor com cashback aplicado
        return String.format("""
                            - RECIBO PIX -
                           Valor original: R$%.2f
                           Total a pagar com cashback: R$%.2f
                           """, valor, calcularTotal());
    }
}
