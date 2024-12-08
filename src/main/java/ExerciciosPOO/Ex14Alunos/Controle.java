package ExerciciosPOO.Ex14Alunos;

import java.util.ArrayList;

public class Controle {

    private ArrayList<Aluno> alunos;  //Lista para armazenar os alunos

    //Construtor que inicializa a lista de aluno
    public Controle() {
        alunos = new ArrayList<>();
    }

    //Método para adicionar um aluno à lista
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    //Método para calcular e exibir as estatísticas da turma
    public void mostrarEstatisticas() {
        if (alunos.isEmpty()) { //Verifica se a lista de alunos está vazia
            System.out.println("Nenhum aluno foi cadastrado.");
            return;
        }

        double somaMedias = 0.0;
        int aprovados = 0;
        int finalistas = 0;
        int reprovados = 0;
        int totalAlunos = alunos.size();

        //Calcula as estatisticas para cada aluno
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            somaMedias += media;

            if (media >= 7) { //Aluno aprovado
                aprovados++;
            } else if (media >= 4) { //Aluno vai para a final
                finalistas++;
            } else { //Aluno reprovado
                reprovados++;
            }
        }

        double mediaTurma = somaMedias / totalAlunos;

        //Exibe as estatisticas da turma
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Finalistas: " + finalistas);
        System.out.println("Reprovados: " + reprovados);

        //Exibe os alunos com notas abaixo da média da turma
        System.out.println("Alunos com notas abaixo da média da turma:");
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() < mediaTurma) {
                System.out.println(aluno);
            }
        }

    }
}
