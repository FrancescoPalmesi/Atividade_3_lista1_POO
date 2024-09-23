import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private List<Curso> cursos;

    public Faculdade(String nome, String cnpj, String endereco, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso " + curso.getNome() + " adicionado à faculdade " + this.nome);
    }

    public void listarCursos() {
        System.out.println("Cursos oferecidos pela faculdade " + this.nome + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNome());
        }
    }
}