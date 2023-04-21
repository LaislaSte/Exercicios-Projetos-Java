package exercice.list3;

import javax.swing.*;
import java.util.*;

public class Counter {
    public static void main(String[] args){
        Counter counter = new Counter();
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "What option do you want to run? \n " +
                "[0] Pares between 1 and 100 \n"+
                "[1] Fatorial of variable \n"+
                "[2] Square of values between 40 and 200 \n"+
                "[3] Sum pares numbers and count impares \n"+
                "[4] Print the number that are divided for 5 between 1 and a number  \n"+
                "[5] Print values of vetor \n"+
                "[6] Sum the first 1000 numbers \n"+
                "[7] Print the pot of 3 that are between 1 and 15 \n"+
                "[8] Print months of the year \n"+
                "[9] Sum the values of vetor and calculate the media of that sum  \n"+
                "[10] Calculate media of positives values and length of the negatives\n"
        ));

        switch (option){
            case 0:
                JOptionPane.showMessageDialog(null, counter.paresBtwn1and100());
                break;
            case 1:
                JOptionPane.showMessageDialog(null, counter.fatorial());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, counter.squareBtwn40and200());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, counter.sumParesCountInpares());
                break;
            case 4:
                counter.divFor5();
                break;
            case 5:
                counter.listVetor();
                break;
            case 6:
                counter.sumOf1000firstNum();
                break;
            case 7:
                counter.potOf3();
                break;
            case 8:
                counter.monthOfYear();
                break;
            case 9:
                counter.medOfVetorValues();
                break;
            case 10:
                counter.bankRent();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No valid option");
                break;
        }
    }

// 1)	Apresente todos os números pares entre 1 a 100
    public List paresBtwn1and100(){
        List list = new ArrayList<Integer>();
        for (int i = 1; i<100; i++ ){
            if (i%2==0){
                list.add(i);
            }
        }
        return list;
    }
    // 2)	Inicialize uma variável e realize o cálculo do seu fatorial
    public int fatorial(){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a number for the equation"));
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    //3)	Calcule e mostre o quadrado dos números entre 40 e 200 dos números inteiros pares.
    public List squareBtwn40and200(){
        List lista = new ArrayList<Integer>();
        for (int i=40; i<200; i++){
            if (i%2==0){
                lista.add(i*i);
            }
        }
        return lista;
    }
    //4)	Calcule e mostre a soma dos números pares e quantidade de números ímpares entre 1 e 800.
    public String sumParesCountInpares(){
        int sumPares=0;
        List countImpares=new ArrayList<Integer>();
        for (int i=1; i<800; i++){
            if (i%2==0){
                sumPares +=i;
            }else{
                countImpares.add(i);
            }
        }
        return "Sum of pare numbers: "+sumPares+" total of impares: "+countImpares.size();
    }
    //5)	Inicialize um número que conterá o final da iteração. Apresente em console todos os valores
    //de 1 ao número inicializado que são divisíveis por 5.
    public void divFor5(){
        int finalNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the final number"));
        for (int i=1; i < finalNum; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
    //6)	Inicialize um vetor de 10 posições e exiba cada um dos elementos em console.
    public void listVetor(){
        Integer[] vetor = new Integer[10];
        for (int i=0; i<vetor.length; i++){
            vetor[i] = i*2;
            System.out.println("position "+i+ " value: "+ vetor[i]);
        }
    }
    //7)	Desenvolva um programa que realize a soma dos 1000 primeiros números inteiros.
    public void sumOf1000firstNum(){
        int sum =0;
        for (int i=1; i<1000; i++){
            sum +=i;
        }
        System.out.println("Total: "+sum);
    }

    //8)	Apresente em console os valores das potencias de 3 variando de 0 à 15.
    public void potOf3(){
        for (int i=0; i<15; i++){
            System.out.println(3^i);
        }
    }

    //9)	 Desenvolva um programa que guarde e exiba os nomes dos meses do ano em um vetor.
    public void monthOfYear(){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        for (int i=0; i<months.length; i++){
            System.out.println("Month: "+months[i]);
        }
    }

    //10)	 Desenvolva um programa que faça a leitura de 10 valores em um vetor e apresente
    //             o valor da média desses valores.
    public void medOfVetorValues(){
        int[] numsArr = {20,22,21,32,2,31,5,15,42,54};
        Double sum = 0.0;
        for (int i=0; i < numsArr.length; i++){
            sum += numsArr[i];
        }
        System.out.println("Media of the sum of the values in the array: "+sum/numsArr.length);
    }

    //11)	Desenvolva um aplicativo que receba 100 saldos bancários, contendo valores positivos
    //            e negativos. Calcule e apresente:
    //    *   a.	Média dos valores positivos entre 100 a 1000.
    //    *   b.	Quantidade total dos valores negativos informados
    public void bankRent(){
        Double[] saldosBancario = new Double[100];
        Double listPos=0.0;
        int sizePos=0;
        int sizeNeg=0;

        for (int i=0;i< 10; i++){
//      for (int i=0;i< 100; i++){
            Double value = Double.parseDouble(JOptionPane.showInputDialog(null, "Write a value negative or not"));
            saldosBancario[i]=value;
            if(value >=100 && value <= 1000){
                sizePos ++;
                listPos += value;
            } else if (value < 0) {
                sizeNeg ++;
            }
        }
        JOptionPane.showMessageDialog(null, "Media of positives values: "+ listPos/sizePos + " Length of negatives values: "+sizeNeg);
    }
}
