package leetcode;

import java.util.Scanner;

public class RomanNumber {
	public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        RomanNumber app = new RomanNumber();
        System.out.println("Please, write a roman number: \n");
        Scanner scan = new Scanner(System.in);
        String userInsert = scan.nextLine();
        scan.close();

        app.acumulator(userInsert);
    }

    public void acumulator(String userInsert) {
        int numForSume = 0;
        for (int i = 0; i < userInsert.length(); i++) {
            /**
             * Lógica
             * numForSume = numForSume + currentNumber
             * numForSume += currentNumber
             * System.out.println(numForSume); -> 50, 60,
             * if(current > previousNum){
             * numForSume -= previousNum;
             * }
             * 
             * Debug
             * char currentNumber = userInsert.charAt(i);
             * int result = this.tranforIntoInt(currentNumber);
             * System.out.println("Letra em questão: " + currentNumber);
             * System.out.println("resultado da transformação: " + result);
             */
            // char currentChar = userInsert.charAt(i);

            int currentNumber = this.tranforIntoInt(userInsert.charAt(i));
            int previousIndex = i > 0 ? i - 1 : 0;
            int previousNumber = this.tranforIntoInt(userInsert.charAt(previousIndex));

            numForSume += currentNumber;
            System.out.println("Valor atual da soma: " + numForSume);

            if (currentNumber > previousNumber) {
                numForSume -= (2 * previousNumber);
                // numForSume -= (previousNumber);
                System.out.println("Valor decrementado para a soma: " + numForSume);
            }
        }
        System.out.println("resultado => " + numForSume);
    }

    public int tranforIntoInt(char romanNum) {
        int result = 0;

        switch (romanNum) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                break;
        }

        return result;
    }
}
