package exercicesED.list2;

public class Difference {
    //Inicialize dois valores, calcule e apresente a diferença do maior pelo menor.
    private int num1;
    private int num2;
    public Difference(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int diff(){
        if (num1 > num2){
            return num1 - num2;
        }else {
            return num2 - num1;
        }
    }

    public static void main(String[] args){
        Difference d = new Difference(12, 4);
        System.out.println("The difference between them: "+d.diff());
    }
}
