package org.example;

public class Gerente extends Funcionario{
    private double bonusFixo;

    public Gerente(String nome, double salario, String departamento, int desenpenho, double bonusFixo) {
        super(nome, salario, departamento, desenpenho);
        this.bonusFixo = bonusFixo;
    }

    public Gerente() {
    }

    public Gerente(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Bonus Fixo: " + this.bonusFixo);
    }

    @Override
    public double calcularSalarioAnual(){
        return super.calcularSalarioAnual() + this.bonusFixo;
    }

    public double getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }
}
