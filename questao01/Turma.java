package questao01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class Turma {
    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public boolean cadastrarAluno(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                return false;
            }
        }
        alunos.add(aluno);
        return true;
    }

    public void listarTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listarAlunosPorSobrenome(String sobrenome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().contains(sobrenome)) {
                System.out.println(aluno);
            }
        }
    }

    public Aluno alunoMaisIdoso() {
        if (alunos.isEmpty()) {
            return null;
        }
        Aluno maisIdoso = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.getDataNascimento().isBefore(maisIdoso.getDataNascimento())) {
                maisIdoso = aluno;
            }
        }
        return maisIdoso;
    }

    public double calcularMediaIdade() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        int somaIdades = 0;
        int totalAlunos = alunos.size();
        LocalDate hoje = LocalDate.now();
        for (Aluno aluno : alunos) {
            somaIdades += Period.between(aluno.getDataNascimento(), hoje).getYears();
        }
        return (double) somaIdades / totalAlunos;
    }

    public boolean atualizarDadosAluno(String matricula, Aluno novosDados) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setNome(novosDados.getNome());
                aluno.setDataNascimento(novosDados.getDataNascimento());
                aluno.setSexo(novosDados.getSexo());
                return true;
            }
        }
        return false;
    }

    public boolean removerAluno(String matricula) {
        return alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }
}