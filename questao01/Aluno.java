package questao01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aluno {
    private String matricula;
    private String nome;
    private String dataNascimento;
    private String sexo;

    public Aluno() {

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

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dataNascimento, formatter);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void LerDados() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a sua matrícula: ");
        setMatricula(sc.nextLine());

        System.out.println("Digite seu nome: ");
        setNome(sc.nextLine());

        System.out.println("Digite sua Data de Nascimento(Ano/Mês/Dia): ");
        setDataNascimento(sc.nextLine());

        System.out.println("Digite seu Sexo: ");
        setSexo(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Aluno{" + "\n" + 
        "Matrícula: " + matricula + "\n " +
        "Nome: " + nome + "\n " + 
        "Data de Nascimento: " + dataNascimento + "\n " + 
        "Sexo: " + sexo + "\n" +
        "Idade: " + getIdade() + " anos\n" + "\n }";
        }
    
        public static void main(String[] args) {
            Aluno aluno = new Aluno();
            aluno.LerDados();
            System.out.println(aluno.toString()); // Exibindo o objeto usando toString
        }
}