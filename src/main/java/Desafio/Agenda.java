package Desafio;

import java.util.Scanner;

public class Agenda {

    private static final int MAX_CONTATOS = 20;
    private static String[] nomes = new String[MAX_CONTATOS];
    private static String[] telefones = new String[MAX_CONTATOS];
    private static int numeroDeContatos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); //consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarContato(scanner);
                    break;
                case 2:
                    excluirContato(scanner);
                    break;
                case 3:
                    listarContatos();
                    break;
                case 4:
                    limparContatos();
                    break;
                case 99:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 99);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMenu Principal:");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Excluir Contato");
        System.out.println("3 - Listar todos os Contatos");
        System.out.println("4 - Limpar a lista de Contatos");
        System.out.println("99 - Sair");
        System.out.println("Escolha uma opção: ");
    }

    private static void cadastrarContato (Scanner scanner) {
        if (numeroDeContatos >= MAX_CONTATOS) {
            System.out.println("A agenda está cheia. Não é possível adicionar mais contatos!");
            return;
        }
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número de telefone: ");
        String telefone = scanner.nextLine();

        nomes[numeroDeContatos] = nome;
        telefones[numeroDeContatos] = telefone;
        numeroDeContatos++;

        System.out.println("Contato cadastrado com sucesso!");
    }

    private static void excluirContato(Scanner scanner) {
        System.out.print("Digite o nome do contato a ser excluído: ");
        String nome = scanner.nextLine();
        int indice = buscarContato(nome);

        if (indice == -1) {
            System.out.println("Contato não encontrado!");
        } else {
            for (int i = indice; i < numeroDeContatos - 1; i++) {
                nomes[i] = nomes[i + 1];
                telefones[i] = telefones[i + 1];
            }
            nomes[numeroDeContatos - 1] = null;
            telefones[numeroDeContatos - 1] = null;
            numeroDeContatos--;
            System.out.println("Contato excluído com sucesso!");
        }
    }

    private static void listarContatos() {
        if (numeroDeContatos == 0) {
            System.out.println("A agenda está vazia!");
            return;
        }
        System.out.println("Lista de contatos:");
        for (int i = 0; i < numeroDeContatos; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " - " + telefones[i]);
        }
    }

    private static void limparContatos() {
        for (int i = 0; i < numeroDeContatos; i++) {
            nomes[i] = null;
            telefones[i] = null;
        }
        numeroDeContatos = 0;
        System.out.println("Lista de contatos limpa!");
    }

    private static int buscarContato(String nome) {
        for (int i = 0; i < numeroDeContatos; i ++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
}
