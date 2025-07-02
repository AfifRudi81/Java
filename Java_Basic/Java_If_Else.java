import java.io.*; //	Input/output (seperti BufferedReader, InputStream, File, dll)
import java.math.*; // 	Operasi matematika besar (misalnya BigInteger, BigDecimal)
import java.security.*; //	Keamanan dan enkripsi
import java.text.*; //	Format tanggal, angka (DateFormat, DecimalFormat)
import java.util.*; //	Struktur data umum (Scanner, ArrayList, HashMap, dll)
import java.util.concurrent.*; //	Multithreading dan concurrency (ExecutorService, Future, dll)
import java.util.regex.*; //Regular expression (Pattern, Matcher)

public class Java_If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
       
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        
        

    scanner.close();
}}
