package Challenge;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]){
        System.out.print("Please enter a number:");
       Scanner ap=new Scanner(System.in);
       int a=ap.nextInt();
       int b=0;
       int c=1;
       int d;
    System.out.print(b+","+c);
       for(int i=2;i<a;i++){
        d=c+b;
        System.out.print(","+d);
        b=c;
        c=d;
       }

    }
    
}
