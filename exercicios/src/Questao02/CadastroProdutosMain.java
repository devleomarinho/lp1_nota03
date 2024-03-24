package Questao02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CadastroProdutosMain {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String repetir;
        List<Produto> lista = new ArrayList<>();


        do {
            Televisao tv1 = new Televisao();
            Smartphone smart1 = new Smartphone();
            System.out.print("Digite o produto que deseja cadastrar (1 - Televisão, 2 - Smartphone): ");
            int escolha = input.nextInt();
            input.nextLine();

            if(escolha == 1) {
                System.out.print("Digite a marca e modelo da TV: ");
                tv1.setNome(input.nextLine());
                System.out.print("Digite a quantidade no estoque: ");
                tv1.setEstoque(input.nextInt());
                input.nextLine();
                System.out.print("Digite o preço: R$");
                tv1.setPreco(input.nextDouble());
                input.nextLine();
                System.out.println("*".repeat(50));
                System.out.println("TV cadastrada com sucesso!\nMarca/modelo: " + tv1.getNome() + "\nQuantidade em estoque: " + tv1.getEstoque() + "\nPreço: R$" + tv1.getPreco());
                lista.add(tv1);
            }else if(escolha == 2) {
                System.out.print("Digite a marca e modelo do smartphone: ");
                smart1.setNome(input.nextLine());
                System.out.print("Digite a quantidade em estoque: ");
                smart1.setEstoque(input.nextInt());
                input.nextLine();
                System.out.print("Digite o preço: R$");
                smart1.setPreco(input.nextDouble());
                input.nextLine();
                System.out.println("*".repeat(50));
                System.out.println("Smartphone cadastrado com sucesso!\nMarca/modelo: " + smart1.getNome() + "\nQuantidade em estoque: " + smart1.getEstoque() + "\nPreço: R$" + smart1.getPreco());
                lista.add(smart1);
            }else{
                System.out.println("Escolha inválida. Tente novamente");
            }

            System.out.println("Deseja cadastrar outro produto (S ou N): ");
            repetir = input.nextLine();

        }while(repetir.equalsIgnoreCase("S"));

        System.out.println("=-=".repeat(15));
        System.out.println("Lista de produtos cadastrados: ");

        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Marca/modelo: " + lista.get(i).getNome());
            System.out.println("Quantidade em estoque: " + lista.get(i).getEstoque() + " unidades");
            System.out.println("Preço: R$" + lista.get(i).getPreco());
            System.out.println("*".repeat(50));
        }

    }

}
