public  class teste{
    public static void main(String[] args) {
        Local local = new  Local("Vila da Folha");
        Aluno aluno = new  Aluno("Naruto", 16);
        Professor professor = new Professor("Jiraya", "Rasengan");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como aprender Rasengan", local, alunosParaSeminario);
        Seminario[]seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
       
        
    }
}