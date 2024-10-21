package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Desenvolvedor> devs = new ArrayList<>();

        while (true) {
            System.out.println("GESTÃO DE FUNCIONARIOS:");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Desenvolvedor");
            System.out.println("3 - Mostrar Relatório");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            if (opcao == 1) {
                  Gerente gerente = new Gerente("Antonio", 5000,
                          "TI", 95, 1000);
//                System.out.println("Digite o nome do Gerente: ");
//                gerente.setNome(sc.next());
//                System.out.println("Digite o salário do Gerente: ");
//                gerente.setSalario(sc.nextDouble());
//                System.out.println("Digite o departamento do Gerente: ");
//                gerente.setDepartamento(sc.next());
//                System.out.println("Digite o desempenho do Gerente (0 - 100): ");
//                int desempenho = sc.nextInt();
                gerentes.add(gerente);
                System.out.println("Gerente Cadastrado com Sucesso!");
                continue;
            } else if (opcao == 2) {
                Desenvolvedor dev = new Desenvolvedor("Marcos", 3000,
                        "TI" , 50, "Java", 2);
//                System.out.println("Digite o nome do Desenvolvedor: ");
//                dev.setNome(sc.next());
//                System.out.println("Digite a Linguagem Principal do Desenvolvedor: ");
//                dev.setLinguagemPrincipal(sc.next());
//                System.out.println("Digite o salario do Desenvolvedor: ");
//                dev.setSalario(sc.nextDouble());
//                System.out.println("Digite o departamento do Desenvolvedor: ");
//                dev.setDepartamento(sc.next());
//                System.out.println("Digite o desempenho do Desenvolvedor: ");
//                dev.setDepartamento(sc.next());
//                System.out.println("Digite a quantidade de projeto concluidos do Desenvolvedor: ");
//                dev.setProjetosConcluidos(sc.nextInt());
                devs.add(dev);
                System.out.println("Desenvolvedor Cadastrado com Sucesso!");
                continue;
            }
            if (opcao == 3) {
                for (Gerente gerente : gerentes) {
                    gerente.mostrarDados();
                    System.out.println("-------------------------");
                }
                for(Desenvolvedor dev : devs) {
                    dev.mostrarDados();
                    System.out.println("-------------------------");
                }
            }
        }
    }
}