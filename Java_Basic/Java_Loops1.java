import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Java_Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // for(int i = N;i >= 1 && i <= 11;i++){
        //     int num = i-1;
        //     int hasil = 2*num;
        //     System.out.println("2 x "+num+" = "+ hasil);
        // }
        for (int i = 1; i <= 10; i++) {
            int hasil = N * i;
            System.out.println(N + " x " + i + " = " + hasil);
        }
        bufferedReader.close();
    }
}
