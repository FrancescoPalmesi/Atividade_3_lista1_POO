import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private int duracao; // Duração em semestres
    private String area;
    private List<Aluno> alunos;

    public Curso(int codigo, String nome, int duracao, String area) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.area = area;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso " + this.nome);
    }

    public void listarAlunos() {
        System.out.println("Alunos matriculados no curso " + this.nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}