package questao01;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public boolean cadastroAluno(Aluno novoAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(novoAluno.getMatricula())) {
                System.out.println("Aluno já Cadastrado.");
                return false;
            }
        }
        alunos.add(novoAluno);
        return true;
    }

    
}
