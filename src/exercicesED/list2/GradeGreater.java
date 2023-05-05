package exercicesED.list2;

public class GradeGreater {
    /*
    * 10) Inicialize duas variáveis com as notas da notaProfessor e da notaProvaGeral do aluno.
    * Apresente em console a seguinte condição.
    * Se uma delas for maior do que 6, a operação deve retornar true, caso contrário deve retornar false.
     */

    private double gradeProfessor;
    private double gradeGeneral;
    public GradeGreater(double gradeProfessor, double gradeGeneral) {
        this.gradeProfessor = gradeProfessor;
        this.gradeGeneral = gradeGeneral;
    }
    public boolean isGreaterThan6(){
        if(gradeProfessor > 6 || gradeGeneral > 6){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        GradeGreater gg = new GradeGreater(5, 7);
        System.out.println("One of the them or both are grater than 6: "+gg.isGreaterThan6());
    }
}
