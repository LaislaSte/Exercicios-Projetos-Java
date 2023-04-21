package exercice.list2;

public class Savings {
    // Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação
    // sabendo que rende 1,3% a. m.
    private double value;
    public Savings(double salary) {
        this.value = salary;
    }
    public double change(){
        this.value = value + (value * 1.3/100);
        return value;
    }

    public static void main(String[] args){
        Savings s = new Savings(1200);
        System.out.println("result= "+ s.change());
    }
}
