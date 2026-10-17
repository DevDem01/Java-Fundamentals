package Challenge;

public class Armstrong {
    public static void digit(int n){
        while(n>0){
            int r= n%10;
            n=n/10;
            System.out.println(r);

        }
    }
    public static int count(int n){
        int count =0;
        while(n>0){
            
            n=n/10;
            count++;

        }
        System.out.print("The number of digits are: ");
        return count;
    }

    public static boolean armstrong(int n){
        double sum=0;
        int count=0;
        int a=n,b=n;
        while(a>0){
           a=a/=10;
           count++;
        }
        while( b>0){
            int r=b%10;
            b=b/10;
            sum+=(int)(Math.pow(r,count));

        }
        if(sum==n){
            return true;
        }
        return false;

    }

    public static int reverse(int n){
          int rev=0;
        while(n>0){
          int  r=n%10;
           rev=(rev*10)+r;
        
         n=n/10;
         
        }
        return rev;
    }
    
    public static boolean palindrome(int n){
        int m=n;
       int rev=0;
        while(n>0){
          int  r=n%10;
           rev=(rev*10)+r;
        
         n=n/10;
         
        }
        if(rev==m){
            return true;
        }
        return false;
    }

    public static void main(String[] var){
        Armstrong.digit(257);
        System.out.println(Armstrong.count(1000));
        System.out.println(Armstrong.armstrong(74));
        System.out.println(Armstrong.reverse(153));
        System.out.println(Armstrong.palindrome(121));
    }
    
}
