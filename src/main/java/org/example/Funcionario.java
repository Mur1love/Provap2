package org.example;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;
    private int desenpenho;

    public Funcionario(String nome, double salario, String departamento, int desenpenho) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.desenpenho = desenpenho;
    }

    public Funcionario() {
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Salário Anual: R$ " + calcularSalarioAnual());
        System.out.println("Departamento: " + departamento);
        System.out.println("Desenpenho: " + desenpenho);
        System.out.printf("*Bônus*: %s%n", calcularBonus(getDesenpenho()));
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public double calcularBonus(double percentualBonus) {
        double salarioAnual = calcularSalarioAnual();
        if (percentualBonus > 90) {
            return salarioAnual * 0.2;
        } else if (percentualBonus > 70 && percentualBonus <= 90) {
            return salarioAnual * 0.1;
        } else {
            return salarioAnual * 0.05;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDesenpenho() {
        return desenpenho;
    }

    public void setDesenpenho(int desenpenho) {
        this.desenpenho = desenpenho;
    }
}
