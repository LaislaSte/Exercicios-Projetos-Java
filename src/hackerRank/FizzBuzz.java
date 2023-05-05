package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result0 {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        int[] arrNum = new int[n];
        for(int i =0;i<n; i++){
            arrNum[0] = i+1;
            if(arrNum[0] % 3 == 0 && arrNum[0] % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(arrNum[0] % 3 == 0 ){
                System.out.println("Fizz");
            }else if (arrNum[0] % 5 == 0 ){
                System.out.println("Buzz");
            }else{
                System.out.println(arrNum[0]);
            }
        }

    }

}

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result0.fizzBuzz(n);

        bufferedReader.close();
    }
}
