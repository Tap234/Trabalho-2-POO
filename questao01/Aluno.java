package questao01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String matricula;
    private String nome;
    private LocalDate dataNascimento;
    private String sexo;

    public Aluno(String matricula, String nome, LocalDate dataNascimento, String sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula: ");
        this.matricula = scanner.nextLine();

        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento (yyyy-MM-dd): ");
        this.dataNascimento = LocalDate.parse(scanner.nextLine());

        System.out.print("Digite o sexo: ");
        this.sexo = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}