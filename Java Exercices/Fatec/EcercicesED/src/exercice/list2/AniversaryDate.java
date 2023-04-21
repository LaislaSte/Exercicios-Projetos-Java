package exercice.list2;

import javax.swing.*;

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
        AniversaryDate ad = new AniversaryDate("05/06/2004", "13/03/2023");
        JOptionPane.showMessageDialog(null, ad.toString());
    }
}
