public class Main {
    public static void main(String[] args) {
        // Criando uma faculdade
        Faculdade faculdade = new Faculdade("Faculdade XYZ", "12.345.678/0001-99", "Rua ABC, 123", "(11) 98765-4321");

        // Criando cursos
        Curso curso1 = new Curso(101, "Engenharia de Software", 8, "Tecnologia");
        Curso curso2 = new Curso(102, "Direito", 10, "Humanas");

        // Adicionando cursos à faculdade
        faculdade.adicionarCurso(curso1);
        faculdade.adicionarCurso(curso2);

        // Listando cursos da faculdade
        faculdade.listarCursos();

        // Criando um aluno
        Aluno aluno1 = new Aluno("20230001", "João Silva", "123.456.789-00", "01/01/2000");

        // Matriculando o aluno no curso de Engenharia de Software
        aluno1.realizarMatricula(curso1);

        // Exibindo informações do aluno
        aluno1.exibirInformacoes();

        // Listando alunos do curso de Engenharia de Software
        curso1.listarAlunos();
    }
}