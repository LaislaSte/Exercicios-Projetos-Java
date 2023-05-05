package exercicesED.list2;

import javax.swing.JOptionPane;

/*
* 1. Inicialize o ano de nascimento e o ano atual. Calcule e mostre a sua idade
* e quantos anos terá daqui a 25 anos.
* */

public class AniversaryDate {
    private DataHelper dateBorn;
    private DataHelper dateToday;
    public AniversaryDate(String dateBorn, String dateToday) {
        this.dateBorn = new DataHelper(dateBorn);
        this.dateToday = new DataHelper(dateToday);
    }
    public int showAge(){
        int age = dateToday.getYear() - dateBorn.getYear();
        if(dateToday.getMonth() < dateBorn.getMonth()){
            return age -1 ;
        }else{
            return age;
        }
    }
    public int add25Years(){
        return this.showAge() + 25;
    }

    @Override
    public String toString() {
        return "AniversaryDate{" +
                "dateBorn=" + dateBorn.getDate() +
                ", dateToday=" + dateToday.getDate() +
                ", age="+showAge()+
                ", age after 25 years="+add25Years()+
                '}';
    }

    public static void main(String[] args){
    	String dateBorn = JOptionPane.showInputDialog(null, "insira data de nascimento (dd/mm/aaaa)");
    	String dateToday = JOptionPane.showInputDialog(null, "insira data de hoje (dd/mm/aaaa)");

        AniversaryDate ad = new AniversaryDate(dateBorn, dateToday);
        JOptionPane.showMessageDialog(null, ad.toString());
    }
}
