package Questao01;

import java.util.Scanner;

public class EmpresaMain {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Gerente g1 = new Gerente();
        Diretor d1 = new Diretor();


        // Cadastro do gerente:
        System.out.println("*".repeat(50));
        System.out.println("Cadastro de Gerente");
        System.out.print("Digite o nome: ");
        g1.setNome(input.nextLine());
        System.out.print("Digite o salário: R$");
        g1.setSalario(input.nextDouble());
        input.nextLine();
        System.out.print("Digite o departamento: ");
        g1.setDepartamento(input.nextLine());
        System.out.println("-".repeat(50));
        System.out.println("Gerente cadastrado!\nNome: " + g1.getNome() + "\nDepartamento: " + g1.getDepartamento() + "\nSalário: R$" + g1.getSalario() + " + Bônus: R$" + g1.calcularBonus());

        //Cadastro do diretor:

        System.out.println("*".repeat(50));
        System.out.println("Cadastro do Diretor");
        System.out.print("Digite o nome: ");
        d1.setNome(input.nextLine());
        System.out.print("Digite o salário: R$");
        d1.setSalario(input.nextDouble());
        input.nextLine();
        System.out.print("Quantidade de ações na empresa: ");
        d1.setAcoes(input.nextInt());
        input.nextLine();
        System.out.println("-".repeat(50));
        System.out.println("Diretor cadastrado!\nNome: " + d1.getNome() + "\nSalário: R$" + d1.getSalario() + "\nAções na empresa: " + d1.getAcoes());


    }
}
