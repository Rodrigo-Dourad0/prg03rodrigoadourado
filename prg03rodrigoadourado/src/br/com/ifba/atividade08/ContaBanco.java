/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author user
 */
public class ContaBanco {
    // Atributos da conta
    private int numConta;
    private String tipo; // "cc" = corrente, "cp" = poupança
    private String dono;
    private float saldo;
    private boolean status; // true = aberta, false = fechada

    // Construtor: conta começa fechada e com saldo 0
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    // Getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("cc") || tipo.equals("cp")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido. Use 'cc' ou 'cp'.");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Abrir conta com saldo inicial dependendo do tipo
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("cp")) {
            setSaldo(150);
        } else if (tipo.equals("cc")) {
            setSaldo(50);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    // Só pode fechar conta com saldo zerado
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro, não pode ser fechada.");
        } else if (saldo < 0) {
            System.out.println("Conta com saldo negativo, não pode ser fechada.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    // Depositar valor, se a conta estiver aberta
    public void depositar(float valor) {
        if (status) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Conta fechada. Não é possível depositar.");
        }
    }

    // Sacar valor, se a conta estiver aberta e houver saldo
    public void sacar(float valor) {
        if (status) {
            if (saldo >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Conta fechada. Não é possível sacar.");
        }
    }

    // Cobrar mensalidade: R$12 para cc e R$20 para cp
    public void pagarMensal() {
        int valor = 0;
        if (tipo.equals("cc")) {
            valor = 12;
        } else if (tipo.equals("cp")) {
            valor = 20;
        }

        if (status) {
            if (saldo >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Mensalidade de R$" + valor + " paga com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade.");
            }
        } else {
            System.out.println("Conta fechada. Não é possível cobrar mensalidade.");
        }
    }
}
