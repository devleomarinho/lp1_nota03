package Questao03;

import java.util.Scanner;
public class ContaPoupanca extends Contas{

        double selic, rendimento;
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

        public void calcularRendimento(){
            System.out.println("Para calcular o rendimento da poupança, digite a taxa selic:");
            selic = input.nextDouble();
            if(selic > 8.5){
                rendimento = 0.005 * saldo;
            }else{
                rendimento = 0.007 * saldo;
            }
            System.out.println("Rendimento da poupança: R$" + rendimento);
        }

        public void exibirDados(){
            System.out.println("Dados da conta poupança");
            System.out.println("Titular: " + getNome() + "\nSaldo: " + getSaldo());

        }
        public void cadastrarConta(){
            System.out.println("Cadastro da conta poupança");
            System.out.print("Digite o nome do titular: ");
            this.setNome(input.nextLine());
            System.out.print("Digite o saldo inicial: ");
            this.setSaldo(input.nextDouble());
            input.nextLine();
            System.out.println("Conta cadastrada com sucesso!");
            System.out.println("*".repeat(50));
        }


    }
