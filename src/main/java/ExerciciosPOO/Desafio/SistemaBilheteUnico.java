package ExerciciosPOO.Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaBilheteUnico {
    private List<BilheteUnico> bilhetes; //Lista de bilhetes cadastrados
    private List<Usuario> usuarios; //Lista de usuários cadastrados
    private Scanner scanner; //Scanner para entrada de dados

    //Construtor que inicializa as listas e o scanner
    public SistemaBilheteUnico() {
        bilhetes = new ArrayList<>();
        usuarios = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //Método principal para executar o sistema
    public void executar() {
        int opcao; // Variável para armazenar a opção escolhida pelo usuário

        do {
            mostrarMenu(); //Mostra o menu principal
            opcao = recebeOpcao(); //Recebe a opção do usuário

            //Executa a ação correspondente à opção do usuário
            switch (opcao) {
                case 1:
                    cadastrarUsuario(); //Cadastra um novo usuário
                    break;
                case 2:
                    cadastrarBilhete(); //Cadastra um novo bilhete
                    break;
                case 3:
                    recarregarBilhete(); //Recarrega um bilhete
                    break;
                case 4:
                    pagarPassagem(); //Paga uma passagem
                    break;
                case 5:
                    listarBilhetes(); //Lista todos os bilhetes cadastrados
                    break;
                case 6:
                    pesquisarBilhetePorCpf(); //Pesquisa um bilhete por CPF
                    break;
                case 99:
                    System.out.println("Encerrando o sistema..."); //Encerra o sistema
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 99); //Continua até que a opção 99 seja escolhida
    }

    //Método para mostrar o menu principal
    private void mostrarMenu() {
        System.out.println("+----------------------------------------------+");
        System.out.println("| Menu Principal                               |");
        System.out.println("| Informe a opção desejada ou 99 para sair     |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| 1 = Cadastrar Usuário                        |");
        System.out.println("| 2 = Cadastrar Bilhete                        |");
        System.out.println("| 3 = Recarregar Bilhete                       |");
        System.out.println("| 4 = Pagar Passagem                           |");
        System.out.println("| 5 = Listar Bilhetes                          |");
        System.out.println("| 6 = Pesquisar Bilhete por CPF                |");
        System.out.println("+----------------------------------------------+");
        System.out.print("opção: ");
    }

    //Método para receber a opção escolhida pelo usuário
    private int recebeOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine()); //Tenta converter a entrada para inteiro
        } catch (NumberFormatException e) {
            return -1; // Retorna uma opção inválida se houver erro na conversão
        }
    }

    //Método para cadastrar um novo usuário
    private void cadastrarUsuario() {
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine(); // Lê o CPF
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine(); //Lê o nome
        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine(); //Lê o email
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine(); //Lê o telefone

        Usuario usuario = new Usuario(cpf, nome, email, telefone); //Cria um novo usuário
        usuarios.add(usuario); //Adiciona o usuário à lista
        System.out.println("Usuário cadastrado com sucesso!");
    }

    //Método para cadastrar um novo bilhete
    private void cadastrarBilhete() {
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine(); //Lê o CPF do usuário
        Usuario usuario = buscarUsuarioPorCpf(cpf); // Busca o usuário pelo CPF

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        System.out.print("Digite o código do bilhete: ");
        String codigo = scanner.nextLine(); //Lê o código do bilhete
        System.out.println("Digite o tipo do bilhete (1 = Comum, 2 = Estudante): ");
        int tipo = scanner.nextInt(); //Lê o tipo de bilhete
        scanner.nextLine(); // Limpa o buffer

        BilheteUnico bilhete; //Declara o bilhete

        if (tipo == 1) {
            bilhete = new BilheteUnicoComum(codigo, usuario); //Cria um bilhete comum
        } else if (tipo == 2) {
            bilhete = new BilheteUnicoEstudante(codigo, usuario); //Cria um bilhete de estudante
        } else {
            System.out.println("Tipo de bilhete inválido!");
            return;
        }

        bilhetes.add(bilhete); //Adiciona o bilhete à lista
        System.out.println("Bilhete cadastro com sucesso!");
    }

    //Método para buscar um usuário pelo CPF
    private Usuario buscarUsuarioPorCpf(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) { //Verifica se o CPF do usuário é igual ao CPF buscado
                return usuario; // Retorna o usuário encontrado
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    //Método para buscar um bilhete pelo CPF do usuário
    private BilheteUnico buscarBilhetePorCpf(String cpf) {
        for (BilheteUnico bilhete : bilhetes) {
            if (bilhete.getUsuario().getCpf().equals(cpf)) { //Verifica se o CPF do usuário do bilhete é igual ao CPF buscado
                return bilhete; // Retorna bilhete encontrado
            }
        }
        return null; // Retorna null se o bilhete não for encontrado
    }

    //Método para recarregar um bilhete
    private void recarregarBilhete() {
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine(); //Lê o CPF do usuário
        BilheteUnico bilhete = buscarBilhetePorCpf(cpf); //Busca o bilhete pelo CPF

        if (bilhete == null) {
            System.out.println("Bilhete não encontrado!");
            return;
        }

        bilhete.recarregarBilhete(); //Recarrega o bilhete
    }

    //Método para pagar passagem
    private void pagarPassagem() {
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();
        BilheteUnico bilhete = buscarBilhetePorCpf(cpf);

        if (bilhete == null) {
            System.out.println("Bilhete não encontrado!");
            return;
        }

        bilhete.pagarPassagem(); //Pagar a passagem com o bilhete
    }

    //Método para listar todos os bilhetes cadastrados
    private void listarBilhetes() {
        if (bilhetes.isEmpty()) {
            System.out.println("Nenhum bilhete cadastrado!");
            return;
        }

        for (BilheteUnico bilhete : bilhetes) {
            System.out.println(bilhete); //Imprime cada bilhete da lista
        }
    }

    //Método para pesquisar um bilhete pelo CPF do usuário
    private void pesquisarBilhetePorCpf() {
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();
        BilheteUnico bilhete = buscarBilhetePorCpf(cpf);

        if (bilhete == null) {
            System.out.println("Bilhete não encontrado!");
            return;
        }

        System.out.println(bilhete); //Imprime bilhete encontrado
    }

}