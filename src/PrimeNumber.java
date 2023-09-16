import java.util.Scanner;

public class PrimeNumber {
	
	boolean checkPrime(int number)
	{
		if (number<=1) {
			
			return false;
		}
		
		for (int i = 2; i < number; i++) {
			
			if (number%i==0) {
				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		PrimeNumber primenumber=new PrimeNumber();
		int number=scanner.nextInt();
		boolean result=primenumber.checkPrime(number);
		if (result) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("non Prime number");
		}
	}
}
