public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }


    public Seminario(String titulo, Local local) {
        this(titulo, local, null);  
    }


    public String getTitulo() {
        return titulo;
    }


    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }
}
