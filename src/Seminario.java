public class Seminario {
    private String titulo;
    private Professor professor;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local, Professor professor, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
        this.alunos = alunos;
    }


    public Seminario(String titulo, Local local) {
        this(titulo, local, null, null);  
    }


    public Seminario(String titulo, Local local, Professor professor) {
        this(titulo, local, professor, null);  
    }


    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local, null, alunos);  
    }


    public String getTitulo() {
        return titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }
}
