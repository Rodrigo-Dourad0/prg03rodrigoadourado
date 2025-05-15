/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
/**
 * @author user
 */
public class PagamentoCartao implements Pagamento {
    
    private double valor; // Valor original da compra

    public PagamentoCartao(double valor) {
        this.valor = valor; // Inicializa o valor recebido no construtor
    }
    
    public double calcularTotal() {
        return valor * 1.05; // Aplica uma taxa de 5% para pagamento com cartão
    }
    
    public String imprimirRecibo() {
        // Gera uma string formatada com os detalhes do pagamento
        return String.format("""
                            - RECIBO CARTÃO -
                           Valor original: R$%.2f
                           Total a pagar com taxa: R$%.2f
                           """, valor, calcularTotal());
    }
    
}
