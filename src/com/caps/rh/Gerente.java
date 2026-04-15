package com.caps.rh;

public class Gerente extends Funcionario {
    // Atributo Específico
    private double bonusAnual;

    // Getter 
    public double getBonusAnual() { return bonusAnual; }

    // Setter
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    // Construtor
    public Gerente(String nome, String cpf, double salario, double bonusAnual) {
        super(nome, cpf, salario);
        this.bonusAnual = bonusAnual;
    } 

    // Metodos
    public double calacularRemuneracaoTotal() {
        return getSalario() + bonusAnual;
    }
}
