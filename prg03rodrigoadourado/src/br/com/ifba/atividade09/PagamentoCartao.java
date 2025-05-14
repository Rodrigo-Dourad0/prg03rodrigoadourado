/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author user
 */
public class PagamentoCartao implements Pagamento {
    
    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }
    
    public double calcularTotal(){
        return valor * 1.05;
    }
    
    public void imprimirRecibo(){
        
        System.out.println("Pagamento em Cartão");
        System.out.printf("Valor original: R$ %.2f\n", valor);
        System.out.printf("Valor com Taxa: R$ %.2f\n", calcularTotal());
        
    }
    
}
