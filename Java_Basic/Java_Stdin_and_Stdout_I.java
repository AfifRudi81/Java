    import java.util.Scanner;

    public class Java_Stdin_and_Stdout_I {
        public static void main(String[] args) {
            // ini cuma mengambil input saja
    //          Scanner scan = new Scanner(System.in);
        
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();
    //     int c = scan.nextInt();
        
    //     System.out.println(a);
    //     System.out.println(b);
    //     System.out.println(c);
    // }
            //ini cara berfikir
        Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            // Complete this line
            // Rubah menjadi String dan masukkan ke Char array=> menjadi 42 = ['4','2']
            char [] number = String.valueOf(a).toCharArray();
            // Complete this line
            //mengambil index 1
            char pertama = number[0];
            //mengambil index 2
            char kedua = number[1];
            //ubah char string menjadi sebuah integer
            int angka1 = Character.getNumericValue(pertama)*25;
            double angka2 = Character.getNumericValue(kedua)*62.5;
            //ubah hasil double menjadi integer
            int angka3 = (int) angka2;
            

            System.out.println(a);
            // Complete this line
            System.out.println(angka1);
            System.out.println(angka3);
            // Complete this line
            scan.close();
            
            
        }
        
    }
