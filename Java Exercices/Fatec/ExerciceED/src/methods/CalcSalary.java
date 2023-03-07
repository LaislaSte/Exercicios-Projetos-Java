package methods;

public class CalcSalary {
    public Double calculateChane(Double salary, Double percentage) {
        salary += (salary * (percentage / 100));
        return salary;
    }
    public Double calculateTaxes(Double salary) {
        salary -= (salary * (25.5 / 100));
        return salary;
    }
}

