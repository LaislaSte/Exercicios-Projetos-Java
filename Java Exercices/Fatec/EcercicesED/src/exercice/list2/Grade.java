package exercice.list2;

import java.util.Scanner;

public class Grade {
    private double grade1;
    private double grade2;
    private double grade3;
    Scanner scan = new Scanner(System.in);

    public Grade(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public double getGrade1() {
        return grade1;
    }
    public double getGrade2() {
        return grade2;
    }
    public double getGrade3() {
        return grade3;
    }

    public void getMedia(){
        double result = (getGrade1() + getGrade2() + getGrade3())/3;
        if (result > 6){
            System.out.println("Approved. Media: "+result);
        }else {
            result = media();
            if (result > 6){
                System.out.println("Approved! Media: "+result);
            }else{
                System.out.println("Not approved! Media: "+result );
            }
        }
    }
    private double media(){
        System.out.println("Insert another grade:");
        double grade = scan.nextDouble();
        return (getGrade1() + getGrade2() + getGrade3() + grade) / 4;
    }

    public static void main(String[] args){
        Grade g = new Grade(5,5,6);
        g.getMedia();
    }
}
