
public class PrimeNoV1 {

	public static void main(String[] args) {
	
		int num = 31,noOfDigits=0;
		for(int p=num;p>=1;p--) {
			// 31
			// 1 2 3 4 5 ........ 30 31
			// 31 % 1 == 0
			// 31 % 2 
			// 31 % 31 === 0
			if(num % p == 0) noOfDigits++;
			
		}
		if(noOfDigits == 2) System.out.println("yes it is Prime");
		else System.out.println(" not a prime");
		
	}

	
	
	
}