package Challenge;
 import java.util.Scanner;
class CLoops {
    
    
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
          System.out.println(n+"*"+i+"="+n*i);
            
        }
      
    }

    public static int sum(int n){
          int sum=0;
         for(int i=0;i<=n;i++){
                  sum+=i;
         }
         System.out.print("This is the sum up until "+n+":");
            return sum;
    }

    public static int factorial(int n ){
      int fact=n;
      for(int i=1;i<n;i++){
        fact*=i;
      }
      System.out.print("This is the factorial of "+ n+": ");
      return fact;
    }

      public static void main(String args[]){
        System.out.print("Please enter a number:");
        Scanner ap=new Scanner(System.in);
       int  a=ap.nextInt();
        CLoops.printTable(a);
        System.out.println(CLoops.sum(a));
        System.out.println(CLoops.factorial(a));
    }
}

