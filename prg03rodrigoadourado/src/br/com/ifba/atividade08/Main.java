package br.com.ifba.atividade08;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Main {
 public static void main(String[] args) {
     
        ContaBanco c1 = new ContaBanco();

        System.out.println("Abrindo conta do tipo 'cp'...");
        c1.setNumConta(123);
        c1.setDono("Jubileu");
        c1.abrirConta("cp");

        System.out.println("Depositando R$100...");
        c1.depositar(100);

        System.out.println("Sacando R$50...");
        c1.sacar(50);

        System.out.println("Pagando mensalidade...");
        c1.pagarMensal();

        System.out.println("Tentando fechar a conta...");
        c1.fecharConta();

        System.out.println("\n--- RESUMO FINAL ---");
        System.out.println("Número: " + c1.getNumConta());
        System.out.println("Dono: " + c1.getDono());
        System.out.println("Tipo: " + c1.getTipo());
        System.out.println("Saldo: R$" + c1.getSaldo());
        System.out.println("Status: " + (c1.getStatus() ? "Aberta" : "Fechada"));
    }
}
