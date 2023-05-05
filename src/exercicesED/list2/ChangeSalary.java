package exercicesED.list2;

import javax.swing.JOptionPane;

public class ChangeSalary {
    //5. Inicialize o salário atual, calcule o novo salário acrescido de 20%.
    private double salary;
    public ChangeSalary(double salary) {
        this.salary = salary;
    }

    public double addPercentage(){
        this.salary = salary + (salary * 20/100);
        return salary;
    }

    public static void main(String[] args){
        ChangeSalary cs = new ChangeSalary(1200);
        double result = cs.addPercentage();
        JOptionPane.showMessageDialog(null, "new salary="+result);
    }
}
