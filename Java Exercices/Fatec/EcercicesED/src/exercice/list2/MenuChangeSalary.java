package exercice.list2;

public class MenuChangeSalary {
    private double salary;
    private int option;
    public MenuChangeSalary(double salary, int option) {
        this.salary = salary;
        this.option = option;
    }

    public void callOption(){
        switch (this.option){
            case 1:
                salary = salary + salary * 30/100;
                System.out.println("30%: "+salary);
                break;
            case 2:
                salary = salary + salary * 40/100;
                System.out.println("40%: "+salary);
                break;
            case 3:
                salary = salary + salary * 50/100;
                System.out.println("50%: "+salary);
                break;
            case 4:
                salary = salary + salary * 60/100;
                System.out.println("60%: "+salary);
                break;
            default:
                System.out.println("Option not valid");
        }
    }

    public static void main(String[] args){
        MenuChangeSalary mcs = new MenuChangeSalary(1200, 1);
        mcs.callOption();
    }

    //Inicialize uma variável contendo o salário atual e outra variável contendo
    // a opção que será acessada no menu. Para opção 1 deve ser acrescido 30% no salário,
    // para opção 2 deve ser acrescido 40% no salário,
    // para opção 3 deve ser acrescido 50% no salário e
    // para a opção 4 deve ser acrescido 60% no salário.
    // Exiba o valor reajustado.


}
