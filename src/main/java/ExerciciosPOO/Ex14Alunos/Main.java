package ExerciciosPOO.Ex14Alunos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controle controle = new Controle(); //Cria um objeto Controle para gerenciar os alunos
        Scanner scanner = new Scanner(System.in);

        while (true) { //Loop para ler os dados dos alunos
            System.out.print("Digite o nome do Aluno (ou 'fim' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) { //Verifica se o usuário deseja terminar a entrada de dados
                break;
            }

            System.out.print("Digite a primeira nota parcial: ");
            int primeiraNota = scanner.nextInt();

            System.out.print("Digite a segunda nota parcial: ");
            int segundaNota = scanner.nextInt();
            scanner.nextLine();// Consome a quebra de linha

            // Cria um novo objeto Aluno e adiciona à lista de alunos
            Aluno aluno = new Aluno(nome, primeiraNota, segundaNota);
            controle.adicionarAluno(aluno);
        }

        controle.mostrarEstatisticas(); //Exibe as estatisticas da turma
        scanner.close(); //Fecha o scanner

    }

}
