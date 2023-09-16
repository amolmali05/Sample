import java.util.Scanner;

public class FactorialDemo {
	
	public void printFactorial(int number)
	{
		int fact=1;
		for (int i = 1; i<=number; i++) {
			
			fact=fact*i;
		}
		
		System.out.println("Factorial Number is " +fact);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Number to Print Factorial number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		FactorialDemo factorialdemo=new FactorialDemo();
		factorialdemo.printFactorial(number);
	}
}
