package hackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result4 {
	/*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
     // -12:00AM == 00
     // -12:00PM == 12
     
     // 07:05:45PM 
     // 05:40:00PM
     // 05 + 12 -> index position caso PM
     // 05 -> index posotion caso AM 
     //  [1  2  3  4  5  6  7  8  9  10 11 12 AM
     //  13 14 15 16 17 18 19 20 21 22 23 00] PM

    public static String timeConversion(String s) {
    // Arrays.stream(arrStr).collect(Collectors.joining()).replace("PM", "");
    
    String[] clock24h = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
    String[] arrStr = s.split(":");
    int idx = 0;
    String result = "";
    String strRev = "";
    
    if(s.endsWith("PM") ){
        if(!(s.startsWith("-12:00:00"))){
            idx = Integer.valueOf(arrStr[0]);
            arrStr[0] = idx == 12 ? clock24h[12] : clock24h[idx+12];        
        }else{
            arrStr[0] = clock24h[12];
        }
        strRev = "PM";
    }else{
        //endsWithAM
        if( !(s.startsWith("-12:00:00")) ){
            idx = Integer.valueOf(arrStr[0]);
            arrStr[0] = idx == 12 ? clock24h[0] : clock24h[idx];        
        }else{
            arrStr[0] = clock24h[0];
        }
        strRev = "AM";
        
    }
    
    result = arrStr[0] + ":" + arrStr[1] + ":" + arrStr[2];
    result = result.replace(strRev, "");
    return result;

    }

}

public class TimeConvertion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result4.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}