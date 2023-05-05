package exercicesED.list2;

import javax.swing.JOptionPane;

public class DateInstance {
    //Inicialize o dia, mês e ano de nascimento e apresente cada uma das variáveis em console.
    // Apresente também os valores concatenados no formato DD/MM/YYYY.

    private String day;
    private String month;
    private String year;
    public DateInstance(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showOnConsole(){
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(day+"/"+month+"/"+year);
    }
    public static void main(String[] args){
        String day = JOptionPane.showInputDialog(null, "Write a day");
        String month = JOptionPane.showInputDialog(null, "Write a month");
        String year = JOptionPane.showInputDialog(null, "Write a year");
        DateInstance di = new DateInstance(day, month, year);
        di.showOnConsole();
    }
}
