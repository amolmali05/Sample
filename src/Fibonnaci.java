import java.util.Scanner;

public class Fibonnaci {
	
	public void getSeries(int number)
	{
		int no1=0,no2=1,no3;
		
		System.out.println(no1 + "\n" +no2);
	
		
		for (int i = 2; i < number; i++) {
			
			no3=no1+no2;
			System.out.println(no3);
			no1=no2;
			no2=no3;
		}
		}
		
	
	
	public static void main(String[] args) {
		
		System.out.println("enter number to Print Fibonnaci Series");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		Fibonnaci fibonnaci=new Fibonnaci();
		fibonnaci.getSeries(number);
	}

}
