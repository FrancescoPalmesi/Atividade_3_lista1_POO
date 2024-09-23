public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Curso curso;

    public Aluno(String matricula, String nome, String cpf, String dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void realizarMatricula(Curso curso) {
        this.curso = curso;
        curso.adicionarAluno(this);
    }

    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
        } else {
            System.out.println("Aluno ainda não matriculado em nenhum curso.");
        }
    }
}