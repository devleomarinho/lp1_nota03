package Questao02;

import java.util.Scanner;

public class Smartphone extends Produto{

    Scanner input = new Scanner(System.in);
    public void ligacao(){
        System.out.println("Digite o número que deseja ligar: ");
        int tel = input.nextInt();
        System.out.println("Discando para " + tel);
    }
}
