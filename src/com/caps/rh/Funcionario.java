package com.caps.rh;

public class Funcionario {
    // Atributos
    private String nome, cpf;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario; 
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalario() { return salario; }

    // Metodos
    public double aplicarAumento(double percentual) {
        if (percentual > 0) {
            salario = salario + (salario * (percentual / 100));
        }
        return salario;
    }
}
