package Questao03;

import java.util.Scanner;
public class SistemaBancarioMain {
    public static void main(String[] args){

        int tipo, servico;
        String repetir;
        Scanner input = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        System.out.println("*".repeat(50));
        System.out.println("Banco Javanês\nEscolha o tipo de conta que deseja utilizar: ");
        System.out.print("1 - Conta Corrente ou 2 - Conta Poupança: ");
        tipo = input.nextInt();
        input.nextLine();
        if(tipo == 1){
            cc1.cadastrarConta();
            System.out.println("Escolha os serviços que deseja utilizar: ");

            do {
                System.out.print("1 - Depositar\n2 - Sacar\n3 - Cheque Especial\n4 - Exibir dados da conta\n -> ");
                servico = input.nextInt();
                input.nextLine();
                switch (servico) {
                    case 1:
                        cc1.depositar();
                        break;
                    case 2:
                        cc1.sacar();
                        break;
                    case 3:
                        cc1.chequeEspecial();
                        break;
                    case 4:
                        cc1.exibirDados();
                        break;

                }
                System.out.print("Deseja executar outro serviço? (S ou N): ");
                repetir = input.nextLine();
            }while(repetir.equalsIgnoreCase("S"));

        }else if (tipo == 2){
            cp1.cadastrarConta();
            System.out.println("Escolha os serviços que deseja utilizar: ");

            do {
                System.out.print("1 - Depositar\n2 - Sacar\n3 - Calcular rendimento\n4 - Exibir dados da conta\n -> ");
                servico = input.nextInt();
                input.nextLine();
                switch (servico) {
                    case 1:
                        cp1.depositar();
                        break;
                    case 2:
                        cp1.sacar();
                        break;
                    case 3:
                        cp1.calcularRendimento();
                        break;
                    case 4:
                        cp1.exibirDados();
                        break;

                }
                System.out.print("Deseja executar outro serviço? (S ou N): ");
                repetir = input.nextLine();
            }while(repetir.equalsIgnoreCase("S"));
        }


    }
}
