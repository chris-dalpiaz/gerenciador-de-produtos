import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<>();

        boolean estaAtivo = true;
        String entrada;

        while (estaAtivo) {
            System.out.println("Digite o n° da opção que deseja:\n" +
                    "1 - Cadastrar produto(s)\n" +
                    "2 - Listar produto(s)\n" +
                    "3 - Exluir produto(s)\n" +
                    "4 - Alterar produto(s)\n" +
                    "x - Sair");
            entrada = s.nextLine();

            boolean querContinuar = true;

            switch (entrada) {
                //Cadastrar
                case "1":
                    while (querContinuar) {
                        System.out.println("Informe o produto a ser cadastrado:");
                        entrada = s.nextLine();

                        listaProdutos.add(entrada);
                        System.out.println(entrada + " foi adicionado com sucesso! Deseja adicionar outro? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")) {
                        } else if (entrada.equals("n")) {
                            querContinuar = false;
                        } else {
                            System.out.println("<ERRO> VALOR INVÁLIDO!! RETORNANDO AO MENU...");
                            querContinuar = false;
                        }
                    }
                    break;

                //Listar
                case "2":
                    System.out.println("Segue a lista dos itens registrados na lista: \n" + listaProdutos);
                    break;

                //Excluir
                case "3":
                    while (querContinuar) {
                        System.out.println("Informe o produto a ser removido:");
                        entrada = s.nextLine();

                        if (listaProdutos.contains(entrada)) {
                            listaProdutos.remove(entrada);
                            System.out.println(entrada + " foi removido com sucesso!");
                        } else {
                            System.out.println("<ERRO> ESSE ITEM NÃO CONSTA NA SUA LISTA...");
                        }
                        System.out.println("Deseja remover outro item? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")) {
                        } else if (entrada.equals("n")) {
                            querContinuar = false;
                        } else {
                            System.out.println("<ERRO> VALOR INVÁLIDO!! RETORNANDO AO MENU...");
                            querContinuar = false;
                        }
                    }
                    break;

                //Alterar
                case "4":
                    while (querContinuar) {
                        String itemAnterior;
                        System.out.println("Informe o item da lista que deseja alterar:");
                        entrada = s.nextLine();

                        if (listaProdutos.contains(entrada)) {
                            itemAnterior = entrada;
                            listaProdutos.remove(entrada);

                            System.out.println("Você deseja alterá-lo para qual item?");
                            entrada = s.nextLine();

                            listaProdutos.add(entrada);
                            System.out.println(itemAnterior + " foi alterado para " + entrada + " com sucesso!");

                        } else {
                            System.out.println("<ERRO> ESSE ITEM NÃO CONSTA NA SUA LISTA...");
                        }
                        System.out.println("Deseja alterar outro item? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")) {
                        } else if (entrada.equals("n")) {
                            querContinuar = false;
                        } else {
                            System.out.println("<ERRO> VALOR INVÁLIDO!! RETORNANDO AO MENU...");
                            querContinuar = false;
                        }
                    }
                    break;

                //Sair
                case "x":
                    System.out.println("Encerrando...");
                    estaAtivo = false;
                    break;
            }
        }
    }
}