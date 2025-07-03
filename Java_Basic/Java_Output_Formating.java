import java.util.Scanner;

public class Java_Output_Formating {
  public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                 System.out.printf("%-15s%03d\n", s1, x);
                // String formatnumber = String.format("%03d",x);
                // //Complete this line
                // System.out.print(s1 +"\t\t\t" );
                // System.out.print(formatnumber+"\n");
            }
            System.out.println("================================");

    }
}
