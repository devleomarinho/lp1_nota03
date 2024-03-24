package Questao03;

import java.util.Scanner;

public class ContaCorrente extends Contas{

    Scanner input = new Scanner(System.in);
    public void depositar(){
        System.out.print("Digite o valor que deseja depositar: R$");
        double deposito = input.nextDouble();
        saldo += deposito;
        System.out.println("Novo saldo: R$" + getSaldo());
    }
    public void sacar(){
        System.out.println("Saldo disponível: R$" + getSaldo());
        System.out.print("Digite o valor que deseja sacar: R$");
        double saque = input.nextDouble();
        saldo -= saque;
        System.out.println("Novo saldo: R$" + getSaldo());
    }

    public void chequeEspecial(){
        System.out.println("Cheque especial disponível: R$1.000,00");
        System.out.print("Digite o valor que deseja utilizar: R$");
        double cheque = input.nextDouble();
        saldo -= cheque;
        System.out.println("Novo saldo: R$" + getSaldo());
    }
    public void exibirDados(){
        System.out.println("Dados da conta corrente");
        System.out.println("Titular: " + getNome() + "\nSaldo: " + getSaldo());

    }
    public void cadastrarConta(){
        System.out.println("Cadastro da conta corrente");
        System.out.print("Digite o nome do titular: ");
        this.setNome(input.nextLine());
        System.out.print("Digite o saldo inicial: ");
        this.setSaldo(input.nextDouble());
        input.nextLine();
        System.out.println("Conta cadastrada com sucesso!");
        System.out.println("*".repeat(50));
    }
}
