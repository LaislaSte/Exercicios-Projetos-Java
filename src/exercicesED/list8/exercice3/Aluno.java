package exercicesED.list8.exercice3;

// atributos RA de tipo de dado inteiro, nome de tipo  de  dado  String,  turma  do  tipo  de  dado  String  e  semestre  do  tipo  de  dado String.  Estes  atributos  devem  ser  acessados  por  meio  de  seus  métodos  públicos (getters e setters). 

public class Aluno {
    private int RA;
    private String nome;
    private String turma;
    private String semestre;

    public Aluno(int rA, String nome, String turma, String semestre) {
        RA = rA;
        this.nome = nome;
        this.turma = turma;
        this.semestre = semestre;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int rA) {
        RA = rA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Aluno [RA=" + RA + ", nome=" + nome + ", turma=" + turma + ", semestre=" + semestre + "]";
    }

}
