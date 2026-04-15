package com.caps.rh;
public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario("Pam", "000.000.000-01", 1000);
        Gerente gerenteUm = new Gerente("Michael", "400.289.220-80", 10000, 1500);

        System.out.printf("Gerente: %s; CPF: %s; Salario: %.2f; Bonus anual: %.2f %n", gerenteUm.getNome(), gerenteUm.getCpf(), gerenteUm.getSalario(), gerenteUm.getBonusAnual());
        System.out.printf("Funcionario(a): %s; CPF: %s; Salario: %.2f %n", funcionarioUm.getNome(), funcionarioUm.getCpf(), funcionarioUm.getSalario());

        System.out.printf("Novo salário: %.2f%n", funcionarioUm.aplicarAumento(10));
    }
}
