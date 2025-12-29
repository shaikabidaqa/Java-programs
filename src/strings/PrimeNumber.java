package Arrayprogramms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Logic-1
		int num=3;
		int count=0;
		
		if(num>1) {
			for(int i=1; i<=num; i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("not a prime number");
			}
		}
		else {
			System.out.println("not a prime number");
	
		}
		
		//logic-2
		
		 int number = 3;
	        boolean isPrime = true; //default
	        
	        for (int i=2; i<=Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                isPrime = false;
	                break;
	            }	
	        }
	        if (isPrime) {
	            System.out.println("This is a prime number");
	        } else {
	            System.out.println("This number is not prime");
	        }
	}

}
