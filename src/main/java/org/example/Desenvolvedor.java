package org.example;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private int projetosConcluidos;

    public Desenvolvedor(String linguagemPrincipal, int projetosConcluidos) {
        this.linguagemPrincipal = linguagemPrincipal;
        this.projetosConcluidos = projetosConcluidos;
    }

    public Desenvolvedor(String nome, double salario, String departamento, int desenpenho, String linguagemPrincipal, int projetosConcluidos) {
        super(nome, salario, departamento, desenpenho);
        this.linguagemPrincipal = linguagemPrincipal;
        this.projetosConcluidos = projetosConcluidos;
    }

    public Desenvolvedor() {

    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Projetos Concluidos: " + projetosConcluidos);
    }

    public double calcularBonus(double percentualBonus){
        if (projetosConcluidos > 5){
            return super.calcularBonus(percentualBonus) + 1000;
        } else {
            return super.calcularBonus(percentualBonus);
        }
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getProjetosConcluidos() {
        return projetosConcluidos;
    }

    public void setProjetosConcluidos(int projetosConcluidos) {
        this.projetosConcluidos = projetosConcluidos;
    }
}
