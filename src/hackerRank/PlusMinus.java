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

class Result3 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int negatives = 0;
        int positives = 0;
        int zeros = 0;
        
        for(Integer num : arr){
            if(num < 0 && num >= -100){
                negatives +=1;
            }else if(num > 0 && num <=100){
                positives +=1;
            } else{
                zeros +=1;
            }
        }
        
        double negRat = (double) negatives / arr.size();
        double posRat = (double) positives / arr.size();
        double zerRat = (double) zeros / arr.size();
        
        DecimalFormat df = new DecimalFormat("0.######");
        df.setMaximumFractionDigits(6);
        System.out.println(df.format(posRat));
        System.out.println(df.format(negRat));
        System.out.println(df.format(zerRat));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result3.plusMinus(arr);

        bufferedReader.close();
    }
}

