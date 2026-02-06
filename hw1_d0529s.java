import java.util.*;
public class hw1_d0529s {
	
	public double calculateBMI(double x,double y) {
		double bmi=x/Math.pow(y,2);
		return bmi;
		
		}
	public boolean blazerNumber(int x) {
		List<Integer> list=new ArrayList<>();
		int sum=0;
		for(int i=1;i<x;i++){
			if(x%i==0 && x>=0 ){
				list.add(i);
			}
		}
			
			for(int num : list) {
				sum +=num;
				
			}
				if(sum==x) {
					return false;
				}
				else {
					return true;
				}
				
			}
	public int findLargestPrime(int maxNum) {
	    if (maxNum < 2) return -1;

	    for (int n = maxNum; n >= 2; n--) {
	        if (isPrime(n)) return n;
	    }
	    return -1;
	}

	public boolean isPrime(int n) {
	    if (n < 2) return false;
	    if (n == 2) return true;
	    if (n % 2 == 0) return false;

	    for (int i = 3; i * i <= n; i += 2) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	public void   countVowelsConsonants(String s) {
    int vowels = 0, consonants = 0;

    for (char c : s.toLowerCase().toCharArray()) {
        if (!Character.isLetter(c)) continue;
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowels++;
        else consonants++;
    }

    System.out.println(vowels + ", " + consonants);
}

		
		
		
	
	public int numSteps(int n){
		int steps=0;
		int i=n;
		while(i!=0) {
			if(i%2==0) {
				steps++;
				i=i/2;
				
			}
			else {
				steps++;
				i=i-1;
				
			}
			
			
			
		}
		return steps;
	}

		
		
			

	public static void main(String args[]) {
		hw1_d0529s mp=new hw1_d0529s();
		System.out.println("Body Mass index:");
		System.out.println("Bmi sample 1: " +mp.calculateBMI(70, 1.75));
		System.out.println("Bmi sample 2: " +mp.calculateBMI(85, 1.80));
		System.out.println();
		System.out.println("Blazer Number");
		System.out.println("Blazer Number 1: " + mp.blazerNumber(28));
		System.out.println("Blazer Number 2: " +mp.blazerNumber(12));
		System.out.println("Blazer Number 3: " +mp.blazerNumber(6));
		System.out.println("Blazer Number 4: " +mp.blazerNumber(27));
		System.out.println();
		System.out.println("Largest Prime Numbers");
		System.out.println("Largest Prime Number 1: "+ mp.findLargestPrime(20));
		System.out.println("Largest Prime Number 2: "+ mp.findLargestPrime(50));
		System.out.println("Largest Prime Number 3: "+ mp.findLargestPrime(70));
		System.out.println();
		System.out.println("Count Vowels Consonants");
		
        mp.countVowelsConsonants("hello");
        mp.countVowelsConsonants("programming");
        mp.countVowelsConsonants("java");
        mp.countVowelsConsonants("ai");
        System.out.println();
		System.out.println("Num Steps: "+mp.numSteps(14));
		


	}
}


