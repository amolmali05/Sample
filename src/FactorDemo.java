import java.util.Scanner;

public class FactorDemo {

	public void printFactor(int number)
	{
		
		System.out.println("Factor of number are -->>");

		for (int i = 1; i <= number; i++) {
			
			if (number%i==0) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter number to Print Factor of number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		FactorDemo factordemo=new FactorDemo();
		factordemo.printFactor(number);
	}
}
