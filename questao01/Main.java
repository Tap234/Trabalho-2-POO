package questao01;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Todos os Alunos");
            System.out.println("3. Listar Alunos por Sobrenome");
            System.out.println("4. Mostrar Aluno Mais Idoso");
            System.out.println("5. Mostrar Média de Idade");
            System.out.println("6. Atualizar Dados de Aluno");
            System.out.println("7. Remover Aluno");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Nome Completo: ");
                    String nome = scanner.nextLine();
                    System.out.print("Data de Nascimento (yyyy-MM-dd): ");
                    LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());
                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();
                    Aluno novoAluno = new Aluno(matricula, nome, dataNascimento, sexo);
                    if (turma.cadastrarAluno(novoAluno)) {
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else {
                        System.out.println("Matrícula já existente!");
                    }
                    break;
                case 2:
                    turma.listarTodosAlunos();
                    break;
                case 3:
                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.nextLine();
                    turma.listarAlunosPorSobrenome(sobrenome);
                    break;
                case 4:
                    Aluno maisIdoso = turma.alunoMaisIdoso();
                    if (maisIdoso != null) {
                        System.out.println("Aluno mais idoso: " + maisIdoso);
                    } else {
                        System.out.println("Nenhum aluno cadastrado.");
                    }
                    break;
                case 5:
                    double mediaIdade = turma.calcularMediaIdade();
                    System.out.println("Média de idade: " + mediaIdade);
                    break;
                case 6:
                    System.out.print("Matrícula do Aluno: ");
                    String matriculaAtualizar = scanner.nextLine();
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Nova Data de Nascimento (yyyy-MM-dd): ");
                    LocalDate novaDataNascimento = LocalDate.parse(scanner.nextLine());
                    System.out.print("Novo Sexo: ");
                    String novoSexo = scanner.nextLine();
                    Aluno novosDados = new Aluno(matriculaAtualizar, novoNome, novaDataNascimento, novoSexo);
                    if (turma.atualizarDadosAluno(matriculaAtualizar, novosDados)) {
                        System.out.println("Dados atualizados com sucesso!");
                    } else {
                        System.out.println("Matrícula não encontrada.");
                    }
                    break;
                case 7:
                    System.out.print("Matrícula do Aluno a Remover: ");
                    String matriculaRemover = scanner.nextLine();
                    if (turma.removerAluno(matriculaRemover)) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Matrícula não encontrada.");
                    }
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}